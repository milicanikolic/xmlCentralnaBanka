package app;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import com.marklogic.client.DatabaseClient;
import com.marklogic.client.DatabaseClientFactory;
import com.marklogic.client.DatabaseClientFactory.Authentication;

@Startup
@Singleton
public class StartApp {

	private static DatabaseClient client;
	private static String trenutniPort;
	private static HashMap<String, String> portWsdl;

	public StartApp() {

		
		
		
		
	}

	@PostConstruct
	public void init() {

		System.out.println("POKRENUO CENTRALNU BANKU");
		//citanje properties fajla
		Properties prop=new Properties();
		ClassLoader loader=Thread.currentThread().getContextClassLoader();
		InputStream input=null;
		
		portWsdl=new HashMap<>();
		
		
		otvoriKonekciju();

		procitajProperties();
	}

	@PreDestroy
	public void exit() {
		zatvoriKonekciju();
	}

	public void procitajProperties(){
		for(String key:ResourceBundle.getBundle("config").keySet()){
			String wsdl=ResourceBundle.getBundle("config").getString(key);
			portWsdl.put(key, wsdl);
		//System.out.println("WSDL Centralne Bankee: "+wsdlCB);
		}
	}
	public static void otvoriKonekciju() {
		client = DatabaseClientFactory.newClient("sarvanlaptop", 8003, "admin",
				"admin", Authentication.DIGEST);

	}

	public static void zatvoriKonekciju() {
		client.release();
	}

	public static DatabaseClient getClient() {
		return client;
	}

	public static void setClient(DatabaseClient client) {
		StartApp.client = client;
	}

	public static String getTrenutniPort() {
		return trenutniPort;
	}

	public static void setTrenutniPort(String trenutniPort) {
		StartApp.trenutniPort = trenutniPort;
	}
	
	public static String getWsdl(String port){
		return portWsdl.get(port);
	}
}