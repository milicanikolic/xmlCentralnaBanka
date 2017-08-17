//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.13 at 01:44:22 PM CEST 
//


package mt910;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for mt910 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mt910">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idPoruke" type="{http://ftn.uns.ac.rs/tipovi}tipIDporuke"/>
 *         &lt;element name="swiftBanPoverioc" type="{http://ftn.uns.ac.rs/tipovi}swiftKod"/>
 *         &lt;element name="obracunskiRacBanPoverioc">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="idPorukeNaloga">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="datumValute" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="iznos" type="{http://ftn.uns.ac.rs/tipovi}tipDec15_2"/>
 *         &lt;element name="sifraValute">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mt910", propOrder = {
    "idPoruke",
    "swiftBanPoverioc",
    "obracunskiRacBanPoverioc",
    "idPorukeNaloga",
    "datumValute",
    "iznos",
    "sifraValute"
})
public class Mt910 {

    @XmlElement(required = true)
    protected String idPoruke;
    @XmlElement(required = true)
    protected String swiftBanPoverioc;
    @XmlElement(required = true)
    protected String obracunskiRacBanPoverioc;
    @XmlElement(required = true)
    protected String idPorukeNaloga;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumValute;
    @XmlElement(required = true)
    protected BigDecimal iznos;
    @XmlElement(required = true)
    protected String sifraValute;

    /**
     * Gets the value of the idPoruke property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPoruke() {
        return idPoruke;
    }

    /**
     * Sets the value of the idPoruke property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPoruke(String value) {
        this.idPoruke = value;
    }

    /**
     * Gets the value of the swiftBanPoverioc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwiftBanPoverioc() {
        return swiftBanPoverioc;
    }

    /**
     * Sets the value of the swiftBanPoverioc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwiftBanPoverioc(String value) {
        this.swiftBanPoverioc = value;
    }

    /**
     * Gets the value of the obracunskiRacBanPoverioc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObracunskiRacBanPoverioc() {
        return obracunskiRacBanPoverioc;
    }

    /**
     * Sets the value of the obracunskiRacBanPoverioc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObracunskiRacBanPoverioc(String value) {
        this.obracunskiRacBanPoverioc = value;
    }

    /**
     * Gets the value of the idPorukeNaloga property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPorukeNaloga() {
        return idPorukeNaloga;
    }

    /**
     * Sets the value of the idPorukeNaloga property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPorukeNaloga(String value) {
        this.idPorukeNaloga = value;
    }

    /**
     * Gets the value of the datumValute property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumValute() {
        return datumValute;
    }

    /**
     * Sets the value of the datumValute property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumValute(XMLGregorianCalendar value) {
        this.datumValute = value;
    }

    /**
     * Gets the value of the iznos property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIznos() {
        return iznos;
    }

    /**
     * Sets the value of the iznos property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIznos(BigDecimal value) {
        this.iznos = value;
    }

    /**
     * Gets the value of the sifraValute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSifraValute() {
        return sifraValute;
    }

    /**
     * Sets the value of the sifraValute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSifraValute(String value) {
        this.sifraValute = value;
    }

}
