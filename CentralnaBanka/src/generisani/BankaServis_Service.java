
package generisani;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "BankaServis", targetNamespace = "http://ftn.uns.ac.rs/banka", wsdlLocation = "http://SarvanLaptop:8180/Banka/BankaServis?wsdl")
public class BankaServis_Service
    extends Service
{

    private final static URL BANKASERVIS_WSDL_LOCATION;
    private final static WebServiceException BANKASERVIS_EXCEPTION;
    private final static QName BANKASERVIS_QNAME = new QName("http://ftn.uns.ac.rs/banka", "BankaServis");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://SarvanLaptop:8180/Banka/BankaServis?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BANKASERVIS_WSDL_LOCATION = url;
        BANKASERVIS_EXCEPTION = e;
    }

    public BankaServis_Service() {
        super(__getWsdlLocation(), BANKASERVIS_QNAME);
    }

    public BankaServis_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), BANKASERVIS_QNAME, features);
    }

    public BankaServis_Service(URL wsdlLocation) {
        super(wsdlLocation, BANKASERVIS_QNAME);
    }

    public BankaServis_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BANKASERVIS_QNAME, features);
    }

    public BankaServis_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BankaServis_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BankaServis
     */
    @WebEndpoint(name = "Banka")
    public BankaServis getBanka() {
        return super.getPort(new QName("http://ftn.uns.ac.rs/banka", "Banka"), BankaServis.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BankaServis
     */
    @WebEndpoint(name = "Banka")
    public BankaServis getBanka(WebServiceFeature... features) {
        return super.getPort(new QName("http://ftn.uns.ac.rs/banka", "Banka"), BankaServis.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BANKASERVIS_EXCEPTION!= null) {
            throw BANKASERVIS_EXCEPTION;
        }
        return BANKASERVIS_WSDL_LOCATION;
    }

}
