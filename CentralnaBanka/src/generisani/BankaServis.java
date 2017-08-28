
package generisani;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BankaServis", targetNamespace = "http://ftn.uns.ac.rs/banka")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BankaServis {


    /**
     * 
     * @param zahtevZaIzvod
     * @return
     *     returns generisani.Presek
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obradiZahtevZaIzvod", targetNamespace = "http://ftn.uns.ac.rs/banka", className = "generisani.ObradiZahtevZaIzvod")
    @ResponseWrapper(localName = "obradiZahtevZaIzvodResponse", targetNamespace = "http://ftn.uns.ac.rs/banka", className = "generisani.ObradiZahtevZaIzvodResponse")
    @Action(input = "http://ftn.uns.ac.rs/banka/BankaServis/obradiZahtevZaIzvodRequest", output = "http://ftn.uns.ac.rs/banka/BankaServis/obradiZahtevZaIzvodResponse")
    public Presek obradiZahtevZaIzvod(
        @WebParam(name = "zahtevZaIzvod", targetNamespace = "http://ftn.uns.ac.rs/zahtev")
        ZahtevZaIzvod zahtevZaIzvod);

    /**
     * 
     * @param mt103I910
     */
    @WebMethod
    @RequestWrapper(localName = "odobriSredstva", targetNamespace = "http://ftn.uns.ac.rs/banka", className = "generisani.OdobriSredstva")
    @ResponseWrapper(localName = "odobriSredstvaResponse", targetNamespace = "http://ftn.uns.ac.rs/banka", className = "generisani.OdobriSredstvaResponse")
    @Action(input = "http://ftn.uns.ac.rs/banka/BankaServis/odobriSredstvaRequest", output = "http://ftn.uns.ac.rs/banka/BankaServis/odobriSredstvaResponse")
    public void odobriSredstva(
        @WebParam(name = "MT103i910", targetNamespace = "http://ftn.uns.ac.rs/mt103i910")
        MT103I910 mt103I910);

    /**
     * 
     * @param nalog
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obradiNalog", targetNamespace = "http://ftn.uns.ac.rs/nalog", className = "generisani.ObradiNalog")
    @ResponseWrapper(localName = "obradiNalogResponse", targetNamespace = "http://ftn.uns.ac.rs/banka", className = "generisani.ObradiNalogResponse")
    @Action(input = "http://ftn.uns.ac.rs/banka/BankaServis/obradiNalogRequest", output = "http://ftn.uns.ac.rs/banka/BankaServis/obradiNalogResponse")
    public String obradiNalog(
        @WebParam(name = "nalog", targetNamespace = "http://ftn.uns.ac.rs/nalog")
        Nalog nalog);

    /**
     * 
     * @param mt900
     */
    @WebMethod
    @RequestWrapper(localName = "primiMt900", targetNamespace = "http://ftn.uns.ac.rs/banka", className = "generisani.PrimiMt900")
    @ResponseWrapper(localName = "primiMt900Response", targetNamespace = "http://ftn.uns.ac.rs/banka", className = "generisani.PrimiMt900Response")
    @Action(input = "http://ftn.uns.ac.rs/banka/BankaServis/primiMt900Request", output = "http://ftn.uns.ac.rs/banka/BankaServis/primiMt900Response")
    public void primiMt900(
        @WebParam(name = "mt900", targetNamespace = "http://ftn.uns.ac.rs/mt900")
        Mt900 mt900);

}