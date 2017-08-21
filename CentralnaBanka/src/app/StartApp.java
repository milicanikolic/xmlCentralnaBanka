package app;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

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
		
		try{
			input=loader.getResourceAsStream("config.properties");
			prop.load(input);
			
			Set<Object> keys=prop.keySet();
			for(Object ob:keys){
				portWsdl.put(ob.toString(), prop.getProperty(ob.toString()));
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}
		System.out.println("MApa je:");
		for(String s:portWsdl.keySet()){
			System.out.println(s+" : "+portWsdl.get(s));
		}
		
		otvoriKonekciju();

	}

	@PreDestroy
	public void exit() {
		zatvoriKonekciju();
	}

	public static void otvoriKonekciju() {
		client = DatabaseClientFactory.newClient("laptop-234234", 8003, "admin",
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