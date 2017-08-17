package app;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

public class Mt103 {

	protected String idPoruke;
	protected String swiftBanDuznik;
	protected String obracunskiRacBankeDuznik;
	protected String obracunskiRacBankePoverioc;
	protected String swiftBanPoverioc;
	protected String duznik;
	protected String svrhaPlacanja;
	protected String primalac;
	protected XMLGregorianCalendar datumNaloga;
	protected XMLGregorianCalendar datumValute;
	protected String racunDuznik;
	protected BigInteger modelZaduzenja;
	protected String pozivNaBrojZaduzenja;
	protected String racunPoverioca;
	protected BigInteger modelOdobrenja;
	protected String pozivNaBrOdobrenja;
	protected BigDecimal iznos;
	protected String sifraValute;

	public Mt103() {
	}

	public String getIdPoruke() {
		return idPoruke;
	}

	public void setIdPoruke(String idPoruke) {
		this.idPoruke = idPoruke;
	}

	public String getSwiftBanDuznik() {
		return swiftBanDuznik;
	}

	public void setSwiftBanDuznik(String swiftBanDuznik) {
		this.swiftBanDuznik = swiftBanDuznik;
	}

	public String getObracunskiRacBankeDuznik() {
		return obracunskiRacBankeDuznik;
	}

	public void setObracunskiRacBankeDuznik(String obracunskiRacBankeDuznik) {
		this.obracunskiRacBankeDuznik = obracunskiRacBankeDuznik;
	}

	public String getSwiftBanPoverioc() {
		return swiftBanPoverioc;
	}

	public void setSwiftBanPoverioc(String swiftBanPoverioc) {
		this.swiftBanPoverioc = swiftBanPoverioc;
	}

	public String getDuznik() {
		return duznik;
	}

	public void setDuznik(String duznik) {
		this.duznik = duznik;
	}

	public String getSvrhaPlacanja() {
		return svrhaPlacanja;
	}

	public void setSvrhaPlacanja(String svrhaPlacanja) {
		this.svrhaPlacanja = svrhaPlacanja;
	}

	public String getPrimalac() {
		return primalac;
	}

	public void setPrimalac(String primalac) {
		this.primalac = primalac;
	}

	public XMLGregorianCalendar getDatumNaloga() {
		return datumNaloga;
	}

	public void setDatumNaloga(XMLGregorianCalendar datumNaloga) {
		this.datumNaloga = datumNaloga;
	}

	public XMLGregorianCalendar getDatumValute() {
		return datumValute;
	}

	public void setDatumValute(XMLGregorianCalendar datumValute) {
		this.datumValute = datumValute;
	}

	public String getRacunDuznik() {
		return racunDuznik;
	}

	public void setRacunDuznik(String racunDuznik) {
		this.racunDuznik = racunDuznik;
	}

	public BigInteger getModelZaduzenja() {
		return modelZaduzenja;
	}

	public void setModelZaduzenja(BigInteger modelZaduzenja) {
		this.modelZaduzenja = modelZaduzenja;
	}

	public String getPozivNaBrojZaduzenja() {
		return pozivNaBrojZaduzenja;
	}

	public void setPozivNaBrojZaduzenja(String pozivNaBrojZaduzenja) {
		this.pozivNaBrojZaduzenja = pozivNaBrojZaduzenja;
	}

	public String getRacunPoverioca() {
		return racunPoverioca;
	}

	public void setRacunPoverioca(String racunPoverioca) {
		this.racunPoverioca = racunPoverioca;
	}

	public BigInteger getModelOdobrenja() {
		return modelOdobrenja;
	}

	public void setModelOdobrenja(BigInteger modelOdobrenja) {
		this.modelOdobrenja = modelOdobrenja;
	}

	public String getPozivNaBrOdobrenja() {
		return pozivNaBrOdobrenja;
	}

	public void setPozivNaBrOdobrenja(String pozivNaBrOdobrenja) {
		this.pozivNaBrOdobrenja = pozivNaBrOdobrenja;
	}

	public BigDecimal getIznos() {
		return iznos;
	}

	public void setIznos(BigDecimal iznos) {
		this.iznos = iznos;
	}

	public String getSifraValute() {
		return sifraValute;
	}

	public void setSifraValute(String sifraValute) {
		this.sifraValute = sifraValute;
	}

	public String getObracunskiRacBankePoverioc() {
		return obracunskiRacBankePoverioc;
	}

	public void setObracunskiRacBankePoverioc(String obracunskiRacBankePoverioc) {
		this.obracunskiRacBankePoverioc = obracunskiRacBankePoverioc;
	}

}
