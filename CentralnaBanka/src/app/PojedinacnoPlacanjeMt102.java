package app;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

public class PojedinacnoPlacanjeMt102 {

	protected String idNaloga;
	protected String duznik;
	protected String svrhaPlacanja;
	protected String primalac;
	protected XMLGregorianCalendar datumNaloga;
	protected String racunDuznik;
	protected BigInteger modelZaduzenja;
	protected String pozivNaBrZaduzenja;
	protected String racunPoverioc;
	protected BigInteger modelOdobrenja;
	protected String pozivNaBrOdobrenja;
	protected BigDecimal iznos;
	protected String sifraValute;

	public PojedinacnoPlacanjeMt102() {
	}

	public String getIdNaloga() {
		return idNaloga;
	}

	public void setIdNaloga(String idNaloga) {
		this.idNaloga = idNaloga;
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

	public String getPozivNaBrZaduzenja() {
		return pozivNaBrZaduzenja;
	}

	public void setPozivNaBrZaduzenja(String pozivNaBrZaduzenja) {
		this.pozivNaBrZaduzenja = pozivNaBrZaduzenja;
	}

	public String getRacunPoverioc() {
		return racunPoverioc;
	}

	public void setRacunPoverioc(String racunPoverioc) {
		this.racunPoverioc = racunPoverioc;
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

}
