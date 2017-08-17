package app;

import java.math.BigDecimal;
import java.util.GregorianCalendar;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import mt102.Mt102;
import banka.Banka;

@Startup
@Singleton
public class App {

	public App() {
	}

	@PostConstruct
	public void init() {
	
		Mt103 mt103 = new Mt103();
		mt103.setIdPoruke("Continental Vojvodjanskoj 260k");
		mt103.setIznos(new BigDecimal(260000));
		mt103.setSifraValute("RSD");
		try {
			GregorianCalendar now = new GregorianCalendar();
			mt103.setDatumValute(DatatypeFactory.newInstance()
					.newXMLGregorianCalendar(now));
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		mt103.setRacunDuznik("12345");
		mt103.setSwiftBanDuznik("CONARS22");
		mt103.setObracunskiRacBankeDuznik("12345");

		mt103.setRacunPoverioca("98765");
		mt103.setSwiftBanPoverioc("VBUBRS22");
		mt103.setObracunskiRacBankePoverioc("98765");
		
		primiMt103(mt103);

	}

	public void primiMt103(Mt103 mt103) {
	
		// *****************************************************************************************************
		// kopirati u CentralBankaImpl, obrisati app paket, importovati klase mt-ova stare
		// *****************************************************************************************************
		
		// PREBACIVANJE NOVCA
		Banka bankaDuznik=null; //BAZA: banka sa swiftKodom mt103.getSwiftBanDuznik();
		bankaDuznik.setIznosObracunskiRacun(bankaDuznik.getIznosObracunskiRacun().subtract(mt103.getIznos()));
		
		Banka bankaPoverioc=null;	//BAZA
		bankaPoverioc.setIznosObracunskiRacun(bankaPoverioc.getIznosObracunskiRacun().add(mt103.getIznos()));
		
		// SLANJE MT900 ZA DUZNIK BANKU
		Mt900 mt900 = new Mt900();
		mt900.setIdPoruke(mt103.getIdPoruke());
		mt900.setSwiftBanDuznik(mt103.getSwiftBanDuznik());
		mt900.setObracunskiRacBanDuznik(mt103.getObracunskiRacBankeDuznik());
		mt900.setIdPorukeNaloga("MT103");
		mt900.setDatumValute(mt103.getDatumValute());
		mt900.setIznos(mt103.getIznos());
		mt900.setSifraValute(mt103.getSifraValute());
		// posalti mt900 preko ws za banku sa swiftKodom mt103.getSwiftBanDuznik();

		// SLANJE MT103 I MT910 POVERIOCU
		// poslati mt103 preko ws za banku sa swiftKodom mt103.getSwiftBanPoverioc();
		Mt910 mt910 = new Mt910();
		mt910.setIdPoruke(mt103.getIdPoruke());
		mt910.setSwiftBanPoverioc(mt103.getSwiftBanPoverioc());
		mt910.setObracunskiRacBanPoverioc(mt103.getObracunskiRacBankePoverioc()); // fali u  Mt103
		mt910.setIdPorukeNaloga("MT103");
		mt910.setDatumValute(mt103.getDatumValute());
		mt910.setIznos(mt103.getIznos());
		mt910.setSifraValute(mt103.getSifraValute());
		// poslati mt910 preko ws za banku sa swiftKodom mt103.getSwiftBanPoverioc();

	}

	
	public void primiMt102(Mt102 mt102) {
		
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

		
	}
}
