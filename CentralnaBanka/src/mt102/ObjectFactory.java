//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.13 at 01:43:11 PM CEST 
//


package mt102;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mt102 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ZaglavljeMt102_QNAME = new QName("http://ftn.uns.ac.rs/mt102", "zaglavljeMt102");
    private final static QName _PojedinacnoPlacanjeMt102_QNAME = new QName("http://ftn.uns.ac.rs/mt102", "pojedinacnoPlacanjeMt102");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mt102
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Mt102 }
     * 
     */
    public Mt102 createMt102() {
        return new Mt102();
    }

    /**
     * Create an instance of {@link ZaglavljeMt102 }
     * 
     */
    public ZaglavljeMt102 createZaglavljeMt102() {
        return new ZaglavljeMt102();
    }

    /**
     * Create an instance of {@link PojedinacnoPlacanjeMt102 }
     * 
     */
    public PojedinacnoPlacanjeMt102 createPojedinacnoPlacanjeMt102() {
        return new PojedinacnoPlacanjeMt102();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZaglavljeMt102 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ftn.uns.ac.rs/mt102", name = "zaglavljeMt102")
    public JAXBElement<ZaglavljeMt102> createZaglavljeMt102(ZaglavljeMt102 value) {
        return new JAXBElement<ZaglavljeMt102>(_ZaglavljeMt102_QNAME, ZaglavljeMt102 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PojedinacnoPlacanjeMt102 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ftn.uns.ac.rs/mt102", name = "pojedinacnoPlacanjeMt102")
    public JAXBElement<PojedinacnoPlacanjeMt102> createPojedinacnoPlacanjeMt102(PojedinacnoPlacanjeMt102 value) {
        return new JAXBElement<PojedinacnoPlacanjeMt102>(_PojedinacnoPlacanjeMt102_QNAME, PojedinacnoPlacanjeMt102 .class, null, value);
    }

}
