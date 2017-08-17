package app;

import java.math.BigDecimal;

import javax.xml.datatype.XMLGregorianCalendar;

public class ZaglavljeMt102 {

	protected String idPoruke;
	protected String swiftBankaDuznik;
	protected String obracunskiRacBanDuznik;
	protected String swiftBankaPoverioc;
	protected String obracunskiRacunBanPoverioc;
	protected BigDecimal ukupanIznos;
	protected String sifraValute;
	protected XMLGregorianCalendar datumValute;
	protected XMLGregorianCalendar datum;

	public ZaglavljeMt102() {
	}

	public String getIdPoruke() {
		return idPoruke;
	}

	public void setIdPoruke(String idPoruke) {
		this.idPoruke = idPoruke;
	}

	public String getSwiftBankaDuznik() {
		return swiftBankaDuznik;
	}

	public void setSwiftBankaDuznik(String swiftBankaDuznik) {
		this.swiftBankaDuznik = swiftBankaDuznik;
	}

	public String getObracunskiRacBanDuznik() {
		return obracunskiRacBanDuznik;
	}

	public void setObracunskiRacBanDuznik(String obracunskiRacBanDuznik) {
		this.obracunskiRacBanDuznik = obracunskiRacBanDuznik;
	}

	public String getSwiftBankaPoverioc() {
		return swiftBankaPoverioc;
	}

	public void setSwiftBankaPoverioc(String swiftBankaPoverioc) {
		this.swiftBankaPoverioc = swiftBankaPoverioc;
	}

	public String getObracunskiRacunBanPoverioc() {
		return obracunskiRacunBanPoverioc;
	}

	public void setObracunskiRacunBanPoverioc(String obracunskiRacunBanPoverioc) {
		this.obracunskiRacunBanPoverioc = obracunskiRacunBanPoverioc;
	}

	public BigDecimal getUkupanIznos() {
		return ukupanIznos;
	}

	public void setUkupanIznos(BigDecimal ukupanIznos) {
		this.ukupanIznos = ukupanIznos;
	}

	public String getSifraValute() {
		return sifraValute;
	}

	public void setSifraValute(String sifraValute) {
		this.sifraValute = sifraValute;
	}

	public XMLGregorianCalendar getDatumValute() {
		return datumValute;
	}

	public void setDatumValute(XMLGregorianCalendar datumValute) {
		this.datumValute = datumValute;
	}

	public XMLGregorianCalendar getDatum() {
		return datum;
	}

	public void setDatum(XMLGregorianCalendar datum) {
		this.datum = datum;
	}

}
