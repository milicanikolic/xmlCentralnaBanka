package app;

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

	public StartApp() {

	}

	@PostConstruct
	public void init() {

		System.out.println("POKRENUO CENTRALNU BANKU");
		otvoriKonekciju();

	}

	@PreDestroy
	public void exit() {
		zatvoriKonekciju();
	}

	public static void otvoriKonekciju() {
		client = DatabaseClientFactory.newClient("localhost", 8003, "admin",
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
}