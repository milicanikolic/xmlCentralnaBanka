package app;

import generisani.BankaServis;
import generisani.MT103I910;
import generisani.Mt103;
import generisani.Mt900;
import generisani.Mt910;


import java.io.StringReader;
import java.io.Writer;
import java.math.BigDecimal;
import java.net.URL;
import java.util.UUID;

import javax.jws.WebService;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.ws.Service;

import mt102.Mt102;
import mt102.PojedinacnoPlacanjeMt102;
import banka.Banka;

import com.marklogic.client.eval.ServerEvaluationCall;

@WebService(portName = "CentralnaBanka", serviceName = "CentralnaBankaServis", targetNamespace = "http://ftn.uns.ac.rs/CB",
endpointInterface = "app.CentralnaBankaServis")
//wsdlLocation = "WEB-INF/wsdl/NalogZaUplatu.wsdl")
//name = "NalogZaUplatu")
public class CentralnaBankaServisImpl implements CentralnaBankaServis{

	
	private URL wsdlBankaDunznik;
	private URL wsdlBankaPoverilac;

    private QName serviceNameBanka = new QName("http://ftn.uns.ac.rs/banka","BankaServis");
    private QName portNameBanka = new QName("http://ftn.uns.ac.rs/banka","Banka");
	
	public void primiMt103(Mt103 mt103) {
		
	
		
		// *****************************************************************************************************
		// kopirati u CentralBankaImpl, obrisati app paket, importovati klase mt-ova stare
		// *****************************************************************************************************
		
		// PREBACIVANJE NOVCA
		System.out.println("*******************CENTRALNA BANKA*****************");
		System.out.println("Metoda: PRIMI MT103");
		String swiftDuznika=mt103.getSwiftBanDuznik();
		
		String upit = "for $x in doc('/content/banka.xml')/banke/banka where $x/swiftCode='"
				+swiftDuznika + "' return $x";
		String odgovor = posaljiUpit(upit);
		
		Banka bankaDuznik=null; //BAZA: banka sa swiftKodom mt103.getSwiftBanDuznik();
		
		try {
			bankaDuznik = unmarshaluj(Banka.class, new StreamSource(
					new StringReader(odgovor)));
			wsdlBankaDunznik=new URL(StartApp.getWsdl(bankaDuznik.getPort()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Banka duznika je: "+bankaDuznik.getNaziv());
		
		System.out.println("STANJE BANKE DUZNIKA PRE SKIDANJA NOVCA: "+bankaDuznik.getIznosObracunskiRacun());
		bankaDuznik.setIznosObracunskiRacun(bankaDuznik.getIznosObracunskiRacun().subtract(mt103.getIznos()));
		System.out.println("STANJE BANKE DUZNIKA POSLE SKIDANJA NOVCA: "+bankaDuznik.getIznosObracunskiRacun());
		
		try {

			// UPISIVANJE NOVIH STANJA RACUNA U BAZU
			String upit3 = "xdmp:node-replace(doc('/content/banka.xml')/banke/banka[oznakaBanke='"
					+ bankaDuznik.getOznakaBanke()
					+ "']/iznosObracunskiRacun, <iznosObracunskiRacun> "
					+ bankaDuznik.getIznosObracunskiRacun() + "</iznosObracunskiRacun>)";
			posaljiUpit(upit3);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//uzimanje banke poverioca
		
		String upit1 = "for $x in doc('/content/banka.xml')/banke/banka where $x/swiftCode='"
				+mt103.getSwiftBanPoverioc() + "' return $x";
		String odgovor1 = posaljiUpit(upit1);
		
		Banka bankaPoverioc=null;	//BAZA
		try {
			bankaPoverioc = unmarshaluj(Banka.class, new StreamSource(
					new StringReader(odgovor1)));
			wsdlBankaPoverilac=new URL(StartApp.getWsdl(bankaPoverioc.getPort()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Banka poverioca je: "+bankaPoverioc.getNaziv());
		System.out.println("STANJE BANKE POVERIOCA PRE DODAVANJA NOVCA: "+bankaPoverioc.getIznosObracunskiRacun());
		bankaPoverioc.setIznosObracunskiRacun(bankaPoverioc.getIznosObracunskiRacun().add(mt103.getIznos()));
		System.out.println("STANJE BANKE POVERIOCA POSLE DODAVANJA NOVCA: "+bankaPoverioc.getIznosObracunskiRacun());
		
		try {

			// UPISIVANJE NOVIH STANJA RACUNA U BAZU
			String upit4 = "xdmp:node-replace(doc('/content/banka.xml')/banke/banka[oznakaBanke='"
					+ bankaPoverioc.getOznakaBanke()
					+ "']/iznosObracunskiRacun, <iznosObracunskiRacun> "
					+ bankaPoverioc.getIznosObracunskiRacun() + "</iznosObracunskiRacun>)";
			posaljiUpit(upit4);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// SLANJE MT900 ZA DUZNIK BANKU
		Mt900 mt900 = new Mt900();
		mt900.setIdPoruke(UUID.randomUUID().toString());
		mt900.setSwiftBanDuznik(mt103.getSwiftBanDuznik());
		mt900.setObracunskiRacBanDuznik(mt103.getObracunskiRacBankeDuznik());
		mt900.setIdPorukeNaloga(mt103.getIdPoruke());
		mt900.setDatumValute(mt103.getDatumValute());
		mt900.setIznos(mt103.getIznos());
		mt900.setSifraValute(mt103.getSifraValute());
		// posalti mt900 preko ws za banku sa swiftKodom mt103.getSwiftBanDuznik();

		
		Service service = Service.create(wsdlBankaDunznik, serviceNameBanka);
        BankaServis inter = service
                .getPort(portNameBanka, BankaServis.class);

        System.out.println("------------slanje mt900 banci duzniku--------------");
        inter.primiMt900(mt900);
		
		
	/*	System.out.println("KREIRANA MT900: IDPORUKE: "+mt900.getIdPoruke()+"\n SWIFTBANKEDUZNIKA: "+mt900.getSwiftBanDuznik()
				+"\n OBRACUNSKI RACUNA BANKE DUZNIKA: "+mt900.getObracunskiRacBanDuznik()+
				"\n ID PORUKE NALOGA: "+mt900.getIdPorukeNaloga()+
				"\n DATUM VALUTE: "+mt900.getDatumValute()
				+"\n IZNOS:	"+mt900.getIznos()+
				"\n SIFRA VALUTE: "+mt900.getSifraValute());
				*/
		
		// SLANJE MT103 I MT910 POVERIOCU
		// poslati mt103 preko ws za banku sa swiftKodom mt103.getSwiftBanPoverioc();
		Mt910 mt910 = new Mt910();
		mt910.setIdPoruke(UUID.randomUUID().toString());
		mt910.setSwiftBanPoverioc(mt103.getSwiftBanPoverioc());
		
		mt910.setObracunskiRacBanPoverioc(mt103.getObracunskiRacunBankePoverioca()); // fali u  Mt103
		mt910.setIdPorukeNaloga(mt103.getIdPoruke());
		mt910.setDatumValute(mt103.getDatumValute());
		mt910.setIznos(mt103.getIznos());
		mt910.setSifraValute(mt103.getSifraValute());
	
		/*
		System.out.println("KREIRANA MT910: IDPORUKE: "+mt910.getIdPoruke()+"\n SWIFT BANKE POVERIOCA: "+mt910.getSwiftBanPoverioc()
				//+"\n OBRACUNSKI RACUNA BANKE DUZNIKA: "+mt900.getObracunskiRacBanDuznik()
				+"\n ID PORUKE NALOGA: "+mt910.getIdPorukeNaloga()+
				"\n DATUM VALUTE: "+mt910.getDatumValute()
				+"\n IZNOS:	"+mt910.getIznos()+
				"\n SIFRA VALUTE: "+mt910.getSifraValute());
				*/
		
		// poslati mt910 preko ws za banku sa swiftKodom mt103.getSwiftBanPoverioc();
		
		Service service1 = Service.create(wsdlBankaPoverilac, serviceNameBanka);
        BankaServis inter1 = service1
                .getPort(portNameBanka, BankaServis.class);

        Mt103 mt103Novo=new Mt103();
        mt103Novo.setDatumNaloga(mt103.getDatumNaloga());
        mt103Novo.setDatumValute(mt103.getDatumValute());
        mt103Novo.setDuznik(mt103.getDuznik());
        mt103Novo.setIdPoruke(mt103.getIdPoruke());
        mt103Novo.setIznos(mt103.getIznos());
        mt103Novo.setModelOdobrenja(mt103.getModelOdobrenja());
        mt103Novo.setModelZaduzenja(mt103.getModelZaduzenja());
        mt103Novo.setObracunskiRacBankeDuznik(mt103.getObracunskiRacBankeDuznik());
        mt103Novo.setObracunskiRacunBankePoverioca(mt103.getObracunskiRacunBankePoverioca());
        mt103Novo.setPozivNaBrOdobrenja(mt103.getPozivNaBrOdobrenja());
        mt103Novo.setPozivNaBrojZaduzenja(mt103.getPozivNaBrojZaduzenja());
        mt103Novo.setPrimalac(mt103.getPrimalac());
        mt103Novo.setRacunDuznik(mt103.getRacunDuznik());
        mt103Novo.setRacunPoverioca(mt103.getRacunPoverioca());
        mt103Novo.setSifraValute(mt103.getSifraValute());
        mt103Novo.setSvrhaPlacanja(mt103.getSvrhaPlacanja());
        mt103Novo.setSwiftBanDuznik(mt103.getSwiftBanDuznik());
        mt103Novo.setSwiftBanPoverioc(mt103.getSwiftBanPoverioc());
        

        MT103I910 sve=new MT103I910();
        sve.setMt103N(mt103Novo);
        sve.setMt910N(mt910);
       
       
      System.out.println("------------------slanje MT103 i MT910 banci poverioca-------------------");
        inter1.odobriSredstva(sve);
      
		
	}

	
	public void primiMt102(Mt102 mt102) {
		
		System.out.println("*******************CENTRALNA BANKA*****************");
		System.out.println("Metoda: PRIMI MT102");
		
		Banka bankaDuznik=null;
		Banka bankaPoverilac=null;
		
		String upit1 = "for $x in doc('/content/banka.xml')/banke/banka where $x/swiftCode='"
				+mt102.getZaglavljeMt102().getSwiftBankaDuznik() + "' return $x";
		String odgovor1 = posaljiUpit(upit1);
		
		try {
			bankaDuznik = unmarshaluj(Banka.class, new StreamSource(
					new StringReader(odgovor1)));
			wsdlBankaDunznik=new URL(StartApp.getWsdl(bankaDuznik.getPort()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		String upit2 = "for $x in doc('/content/banka.xml')/banke/banka where $x/swiftCode='"
				+mt102.getZaglavljeMt102().getSwiftBankaPoverioc() + "' return $x";
		String odgovor2 = posaljiUpit(upit2);
		
		try {
			bankaPoverilac = unmarshaluj(Banka.class, new StreamSource(
					new StringReader(odgovor2)));
			wsdlBankaPoverilac=new URL(StartApp.getWsdl(bankaPoverilac.getPort()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		for(PojedinacnoPlacanjeMt102 pojedinacno:mt102.getPojedinacnoPlacanjeMt102()){
			
			System.out.println("POJEDINACNO PLACANJE: "+pojedinacno.getIznos());
			
			//SKIDANJE PARA SA DUZNIKA
			BigDecimal iznosDuznika=bankaDuznik.getIznosObracunskiRacun().subtract(pojedinacno.getIznos());
			bankaDuznik.setIznosObracunskiRacun(iznosDuznika);
			
			//DODAVANJE PARA NA POVERIOCA
			BigDecimal iznosPoverioca=bankaPoverilac.getIznosObracunskiRacun().add(pojedinacno.getIznos());
			bankaPoverilac.setIznosObracunskiRacun(iznosPoverioca);
		}
		
		//UPIS NOVIH IZNOSA U OBE BANKE
		try {

			System.out.println("UPIS U BAZU NOVIH STANJA BANAKA");
			// UPISIVANJE NOVIH STANJA RACUNA U BAZU
			String upit4 = "xdmp:node-replace(doc('/content/banka.xml')/banke/banka[oznakaBanke='"
					+ bankaPoverilac.getOznakaBanke()
					+ "']/iznosObracunskiRacun, <iznosObracunskiRacun> "
					+ bankaPoverilac.getIznosObracunskiRacun() + "</iznosObracunskiRacun>)";
			posaljiUpit(upit4);
			
			String upit5 = "xdmp:node-replace(doc('/content/banka.xml')/banke/banka[oznakaBanke='"
					+ bankaDuznik.getOznakaBanke()
					+ "']/iznosObracunskiRacun, <iznosObracunskiRacun> "
					+ bankaDuznik.getIznosObracunskiRacun() + "</iznosObracunskiRacun>)";
			posaljiUpit(upit5);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("KREIRANJE MT900");
		
		//SLANJE DUZNIKU MT900
		Mt900 mt900 = new Mt900();
		mt900.setIdPoruke(mt102.getZaglavljeMt102().getIdPoruke());
		mt900.setSwiftBanDuznik(mt102.getZaglavljeMt102().getSwiftBankaDuznik());
		mt900.setObracunskiRacBanDuznik(mt102.getZaglavljeMt102().getObracunskiRacunBanPoverioc());
		mt900.setIdPorukeNaloga("MT102");
		mt900.setDatumValute(mt102.getZaglavljeMt102().getDatumValute());
		mt900.setIznos(mt102.getZaglavljeMt102().getUkupanIznos());
		mt900.setSifraValute(mt102.getZaglavljeMt102().getSifraValute());
		// posalti mt900 preko ws za banku sa swiftKodom mt102.getZaglavljeMt102().getSwiftBankaDuznik();
		
		Service service = Service.create(wsdlBankaDunznik, serviceNameBanka);
        BankaServis inter = service
                .getPort(portNameBanka, BankaServis.class);
        System.out.println("-----------poslata MT900 banci duznika----------");
        inter.primiMt900(mt900);
		
		
		System.out.println("KREIRANJE MT910");
		//SLANJE MT910 I MT102 ZA POVERIOCA
		// poslati MT102 preko ws za banku sa swiftKodom mt102.getZaglavljeMt102().getSwiftBankaPoverioc();
		Mt910 mt910 = new Mt910();
		mt910.setIdPoruke(mt102.getZaglavljeMt102().getIdPoruke());
		mt910.setSwiftBanPoverioc(mt102.getZaglavljeMt102().getSwiftBankaPoverioc());
		mt910.setObracunskiRacBanPoverioc(mt102.getZaglavljeMt102().getObracunskiRacunBanPoverioc());
		mt910.setIdPorukeNaloga("MT102");
		mt910.setDatumValute(mt102.getZaglavljeMt102().getDatumValute());
		mt910.setIznos(mt102.getZaglavljeMt102().getUkupanIznos());
		mt910.setSifraValute(mt102.getZaglavljeMt102().getSifraValute());
		// poslati mt910 preko ws za banku sa swiftKodom mt102.getZaglavljeMt102().getSwiftBanPoverioc();

		Service service1 = Service.create(wsdlBankaPoverilac, serviceNameBanka);
        BankaServis inter1 = service1
                .getPort(portNameBanka, BankaServis.class);

        //POZVATI METODU KOJA PRIMA MT102 I MT910
        
	}
	
	
	public String posaljiUpit(String upit) {
		ServerEvaluationCall poziv = StartApp.getClient().newServerEval();
		String odgovor = poziv.xquery(upit).evalAs(String.class);
		return odgovor;
	}

	public static <T> T unmarshaluj(Class<T> cl, Source s) throws JAXBException {
		JAXBContext ctx = JAXBContext.newInstance(cl);
		Unmarshaller u = ctx.createUnmarshaller();
		return u.unmarshal(s, cl).getValue();
	}

	public static <T> void marshaluj(T obj, Writer wr) throws JAXBException {
		JAXBContext ctx = JAXBContext.newInstance(obj.getClass());
		Marshaller m = ctx.createMarshaller();
		m.marshal(obj, wr);
	}

}
