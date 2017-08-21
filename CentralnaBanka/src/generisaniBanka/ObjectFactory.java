
package generisaniBanka;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generisaniBanka package. 
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

    private final static QName _Mt103_QNAME = new QName("http://ftn.uns.ac.rs/mt103", "mt103");
    private final static QName _OdobriSredstvaResponse_QNAME = new QName("http://ftn.uns.ac.rs/banka", "odobriSredstvaResponse");
    private final static QName _ObradiZahtevZaIzvod_QNAME = new QName("http://ftn.uns.ac.rs/banka", "obradiZahtevZaIzvod");
    private final static QName _Mt900_QNAME = new QName("http://ftn.uns.ac.rs/mt900", "mt900");
    private final static QName _PrimiMt900_QNAME = new QName("http://ftn.uns.ac.rs/banka", "primiMt900");
    private final static QName _ObradiZahtevZaIzvodResponse_QNAME = new QName("http://ftn.uns.ac.rs/banka", "obradiZahtevZaIzvodResponse");
    private final static QName _ObradiNalogResponse_QNAME = new QName("http://ftn.uns.ac.rs/banka", "obradiNalogResponse");
    private final static QName _PrimiMt900Response_QNAME = new QName("http://ftn.uns.ac.rs/banka", "primiMt900Response");
    private final static QName _ZahtevZaIzvod_QNAME = new QName("http://ftn.uns.ac.rs/zahtev", "zahtevZaIzvod");
    private final static QName _Nalog_QNAME = new QName("http://ftn.uns.ac.rs/nalog", "nalog");
    private final static QName _OdobriSredstva_QNAME = new QName("http://ftn.uns.ac.rs/banka", "odobriSredstva");
    private final static QName _ObradiNalog_QNAME = new QName("http://ftn.uns.ac.rs/nalog", "obradiNalog");
    private final static QName _Mt910_QNAME = new QName("http://ftn.uns.ac.rs/mt910", "mt910");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generisaniBanka
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ZahtevZaIzvod }
     * 
     */
    public ZahtevZaIzvod createZahtevZaIzvod() {
        return new ZahtevZaIzvod();
    }

    /**
     * Create an instance of {@link Mt910 }
     * 
     */
    public Mt910 createMt910() {
        return new Mt910();
    }

    /**
     * Create an instance of {@link Mt900 }
     * 
     */
    public Mt900 createMt900() {
        return new Mt900();
    }

    /**
     * Create an instance of {@link StavkaPreseka }
     * 
     */
    public StavkaPreseka createStavkaPreseka() {
        return new StavkaPreseka();
    }

    /**
     * Create an instance of {@link Presek }
     * 
     */
    public Presek createPresek() {
        return new Presek();
    }

    /**
     * Create an instance of {@link ZaglavljePreseka }
     * 
     */
    public ZaglavljePreseka createZaglavljePreseka() {
        return new ZaglavljePreseka();
    }

    /**
     * Create an instance of {@link ObradiNalog }
     * 
     */
    public ObradiNalog createObradiNalog() {
        return new ObradiNalog();
    }

    /**
     * Create an instance of {@link Nalog }
     * 
     */
    public Nalog createNalog() {
        return new Nalog();
    }

    /**
     * Create an instance of {@link Mt103 }
     * 
     */
    public Mt103 createMt103() {
        return new Mt103();
    }

    /**
     * Create an instance of {@link ObradiZahtevZaIzvodResponse }
     * 
     */
    public ObradiZahtevZaIzvodResponse createObradiZahtevZaIzvodResponse() {
        return new ObradiZahtevZaIzvodResponse();
    }

    /**
     * Create an instance of {@link ObradiZahtevZaIzvod }
     * 
     */
    public ObradiZahtevZaIzvod createObradiZahtevZaIzvod() {
        return new ObradiZahtevZaIzvod();
    }

    /**
     * Create an instance of {@link PrimiMt900 }
     * 
     */
    public PrimiMt900 createPrimiMt900() {
        return new PrimiMt900();
    }

    /**
     * Create an instance of {@link OdobriSredstvaResponse }
     * 
     */
    public OdobriSredstvaResponse createOdobriSredstvaResponse() {
        return new OdobriSredstvaResponse();
    }

    /**
     * Create an instance of {@link OdobriSredstva }
     * 
     */
    public OdobriSredstva createOdobriSredstva() {
        return new OdobriSredstva();
    }

    /**
     * Create an instance of {@link PrimiMt900Response }
     * 
     */
    public PrimiMt900Response createPrimiMt900Response() {
        return new PrimiMt900Response();
    }

    /**
     * Create an instance of {@link ObradiNalogResponse }
     * 
     */
    public ObradiNalogResponse createObradiNalogResponse() {
        return new ObradiNalogResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Mt103 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ftn.uns.ac.rs/mt103", name = "mt103")
    public JAXBElement<Mt103> createMt103(Mt103 value) {
        return new JAXBElement<Mt103>(_Mt103_QNAME, Mt103 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OdobriSredstvaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ftn.uns.ac.rs/banka", name = "odobriSredstvaResponse")
    public JAXBElement<OdobriSredstvaResponse> createOdobriSredstvaResponse(OdobriSredstvaResponse value) {
        return new JAXBElement<OdobriSredstvaResponse>(_OdobriSredstvaResponse_QNAME, OdobriSredstvaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObradiZahtevZaIzvod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ftn.uns.ac.rs/banka", name = "obradiZahtevZaIzvod")
    public JAXBElement<ObradiZahtevZaIzvod> createObradiZahtevZaIzvod(ObradiZahtevZaIzvod value) {
        return new JAXBElement<ObradiZahtevZaIzvod>(_ObradiZahtevZaIzvod_QNAME, ObradiZahtevZaIzvod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Mt900 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ftn.uns.ac.rs/mt900", name = "mt900")
    public JAXBElement<Mt900> createMt900(Mt900 value) {
        return new JAXBElement<Mt900>(_Mt900_QNAME, Mt900 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrimiMt900 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ftn.uns.ac.rs/banka", name = "primiMt900")
    public JAXBElement<PrimiMt900> createPrimiMt900(PrimiMt900 value) {
        return new JAXBElement<PrimiMt900>(_PrimiMt900_QNAME, PrimiMt900 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObradiZahtevZaIzvodResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ftn.uns.ac.rs/banka", name = "obradiZahtevZaIzvodResponse")
    public JAXBElement<ObradiZahtevZaIzvodResponse> createObradiZahtevZaIzvodResponse(ObradiZahtevZaIzvodResponse value) {
        return new JAXBElement<ObradiZahtevZaIzvodResponse>(_ObradiZahtevZaIzvodResponse_QNAME, ObradiZahtevZaIzvodResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObradiNalogResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ftn.uns.ac.rs/banka", name = "obradiNalogResponse")
    public JAXBElement<ObradiNalogResponse> createObradiNalogResponse(ObradiNalogResponse value) {
        return new JAXBElement<ObradiNalogResponse>(_ObradiNalogResponse_QNAME, ObradiNalogResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrimiMt900Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ftn.uns.ac.rs/banka", name = "primiMt900Response")
    public JAXBElement<PrimiMt900Response> createPrimiMt900Response(PrimiMt900Response value) {
        return new JAXBElement<PrimiMt900Response>(_PrimiMt900Response_QNAME, PrimiMt900Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZahtevZaIzvod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ftn.uns.ac.rs/zahtev", name = "zahtevZaIzvod")
    public JAXBElement<ZahtevZaIzvod> createZahtevZaIzvod(ZahtevZaIzvod value) {
        return new JAXBElement<ZahtevZaIzvod>(_ZahtevZaIzvod_QNAME, ZahtevZaIzvod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Nalog }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ftn.uns.ac.rs/nalog", name = "nalog")
    public JAXBElement<Nalog> createNalog(Nalog value) {
        return new JAXBElement<Nalog>(_Nalog_QNAME, Nalog.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OdobriSredstva }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ftn.uns.ac.rs/banka", name = "odobriSredstva")
    public JAXBElement<OdobriSredstva> createOdobriSredstva(OdobriSredstva value) {
        return new JAXBElement<OdobriSredstva>(_OdobriSredstva_QNAME, OdobriSredstva.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObradiNalog }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ftn.uns.ac.rs/nalog", name = "obradiNalog")
    public JAXBElement<ObradiNalog> createObradiNalog(ObradiNalog value) {
        return new JAXBElement<ObradiNalog>(_ObradiNalog_QNAME, ObradiNalog.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Mt910 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ftn.uns.ac.rs/mt910", name = "mt910")
    public JAXBElement<Mt910> createMt910(Mt910 value) {
        return new JAXBElement<Mt910>(_Mt910_QNAME, Mt910 .class, null, value);
    }

}