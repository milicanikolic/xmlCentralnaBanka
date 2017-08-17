package app;

import java.math.BigDecimal;

import javax.xml.datatype.XMLGregorianCalendar;

public class Mt910 {

	protected String idPoruke;
	protected String swiftBanPoverioc;
	protected String obracunskiRacBanPoverioc;
	protected String idPorukeNaloga;
	protected XMLGregorianCalendar datumValute;
	protected BigDecimal iznos;
	protected String sifraValute;

	public Mt910() {
	}

	public String getIdPoruke() {
		return idPoruke;
	}

	public void setIdPoruke(String idPoruke) {
		this.idPoruke = idPoruke;
	}

	public String getSwiftBanPoverioc() {
		return swiftBanPoverioc;
	}

	public void setSwiftBanPoverioc(String swiftBanPoverioc) {
		this.swiftBanPoverioc = swiftBanPoverioc;
	}

	public String getObracunskiRacBanPoverioc() {
		return obracunskiRacBanPoverioc;
	}

	public void setObracunskiRacBanPoverioc(String obracunskiRacBanPoverioc) {
		this.obracunskiRacBanPoverioc = obracunskiRacBanPoverioc;
	}

	public String getIdPorukeNaloga() {
		return idPorukeNaloga;
	}

	public void setIdPorukeNaloga(String idPorukeNaloga) {
		this.idPorukeNaloga = idPorukeNaloga;
	}

	public XMLGregorianCalendar getDatumValute() {
		return datumValute;
	}

	public void setDatumValute(XMLGregorianCalendar datumValute) {
		this.datumValute = datumValute;
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
