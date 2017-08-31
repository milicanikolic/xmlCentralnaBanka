
package generisani;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mt102n" type="{http://ftn.uns.ac.rs/banka}mt102" form="qualified"/>
 *         &lt;element name="mt910n" type="{http://ftn.uns.ac.rs/mt910}mt910" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mt102N",
    "mt910N"
})
@XmlRootElement(name = "MT102i910", namespace = "http://ftn.uns.ac.rs/mt102i910")
public class MT102I910 {

    @XmlElement(name = "mt102n", namespace = "http://ftn.uns.ac.rs/mt102i910", required = true)
    protected Mt102 mt102N;
    @XmlElement(name = "mt910n", namespace = "http://ftn.uns.ac.rs/mt102i910", required = true)
    protected Mt910 mt910N;

    /**
     * Gets the value of the mt102N property.
     * 
     * @return
     *     possible object is
     *     {@link Mt102 }
     *     
     */
    public Mt102 getMt102N() {
        return mt102N;
    }

    /**
     * Sets the value of the mt102N property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mt102 }
     *     
     */
    public void setMt102N(Mt102 value) {
        this.mt102N = value;
    }

    /**
     * Gets the value of the mt910N property.
     * 
     * @return
     *     possible object is
     *     {@link Mt910 }
     *     
     */
    public Mt910 getMt910N() {
        return mt910N;
    }

    /**
     * Sets the value of the mt910N property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mt910 }
     *     
     */
    public void setMt910N(Mt910 value) {
        this.mt910N = value;
    }

}
