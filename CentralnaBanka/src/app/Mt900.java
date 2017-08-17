package app;

import java.math.BigDecimal;

import javax.xml.datatype.XMLGregorianCalendar;

public class Mt900 {
	
    protected String idPoruke;
    protected String swiftBanDuznik;
    protected String obracunskiRacBanDuznik;
    protected String idPorukeNaloga;
    protected XMLGregorianCalendar datumValute;
    protected BigDecimal iznos;
    protected String sifraValute;

    public Mt900(){
    	
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

	public String getObracunskiRacBanDuznik() {
		return obracunskiRacBanDuznik;
	}

	public void setObracunskiRacBanDuznik(String obracunskiRacBanDuznik) {
		this.obracunskiRacBanDuznik = obracunskiRacBanDuznik;
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
