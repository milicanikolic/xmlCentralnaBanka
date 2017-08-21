package app;

import generisaniBanka.Mt103;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.ws.RequestWrapper;

import mt102.Mt102;



@WebService(targetNamespace = "http://ftn.uns.ac.rs/CB")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL, parameterStyle = ParameterStyle.WRAPPED)
public interface CentralnaBankaServis {

	@RequestWrapper(className = "nalog.data.mt103Request", targetNamespace = "http://ftn.uns.ac.rs/mt103")
	// @ResponseWrapper(className="nalog.data.StringResponse")
	public void primiMt103(@WebParam(name = "mt103", targetNamespace = "http://ftn.uns.ac.rs/mt103")Mt103 mt103);
	
	@RequestWrapper(className = "nalog.data.mt102Request", targetNamespace = "http://ftn.uns.ac.rs/mt102")
	// @ResponseWrapper(className="nalog.data.StringResponse")
	public void primiMt102(@WebParam(name = "mt102", targetNamespace = "http://ftn.uns.ac.rs/mt102")Mt102 mt102);
}
