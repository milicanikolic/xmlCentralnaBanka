package banka;

import generisaniBanka.Nalog;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Banka implements Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	private String port;
	private String oznakaBanke;// predstavlja ona prve 3 cifre u racunu firme,
								// po kojima moze da se
	// vidi u kojoj banci firma ima otvoren racun
	private String naziv;
	private String obracunskiRacun;
	private BigDecimal iznosObracunskiRacun;
	private String swiftCode;
	private HashMap<String, String> racunFirme;
	public HashMap<String, RacunUBanci> racunIznos; // broj racuna firme, iznosi
													// na racunu
	private HashMap<String, ArrayList<Nalog>> uplate; // broj racuna firme,
														// lista njenih
														// primljenih i poslatih
														// uplata

	public Banka() {
		super();
		racunFirme = new HashMap<String, String>();
		racunIznos = new HashMap<String, RacunUBanci>();
	}

	public Banka(String port,String naziv, String obracunskiRacun, String swiftCode, BigDecimal iznosObracunskiRacun) {
		super();
		this.port=port;
		racunFirme = new HashMap<String, String>();
		this.naziv = naziv;
		this.obracunskiRacun = obracunskiRacun;
		this.swiftCode = swiftCode;
		this.iznosObracunskiRacun=iznosObracunskiRacun;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getSwiftCode() {
		return swiftCode;
	}

	public void setSwiftCode(String swiftCode) {
		this.swiftCode = swiftCode;
	}

	public String getObracunskiRacun() {
		return obracunskiRacun;
	}

	public void setObracunskiRacun(String obracunskiRacun) {
		this.obracunskiRacun = obracunskiRacun;
	}

	public HashMap<String, String> getRacuniFirmi() {
		return racunFirme;
	}

	public void setRacuniFirmi(HashMap<String, String> racuniFirmi) {
		this.racunFirme = racuniFirmi;
	}

	public void dodajRacun(String firma, String brRacuna) {
		racunFirme.put(firma, brRacuna);
	}

	public HashMap<String, RacunUBanci> getRacunIznos() {
		return racunIznos;
	}

	public void setRacunIznos(HashMap<String, RacunUBanci> racunIznos) {
		this.racunIznos = racunIznos;
	}

	public HashMap<String, ArrayList<Nalog>> getUplate() {
		return uplate;
	}

	public void setUplate(HashMap<String, ArrayList<Nalog>> uplate) {
		this.uplate = uplate;
	}

	public String getOznakaBanke() {
		return oznakaBanke;
	}

	public void setOznakaBanke(String oznakaBanke) {
		this.oznakaBanke = oznakaBanke;
	}

	public BigDecimal getIznosObracunskiRacun() {
		return iznosObracunskiRacun;
	}

	public void setIznosObracunskiRacun(BigDecimal iznosObracunskiRacun) {
		this.iznosObracunskiRacun = iznosObracunskiRacun;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	
}