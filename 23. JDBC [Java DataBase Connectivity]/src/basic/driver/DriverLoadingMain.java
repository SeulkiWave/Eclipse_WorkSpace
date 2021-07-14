package basic.driver;

public class DriverLoadingMain {

	public static void main(String[] args) throws Exception {
		
		String driverClass = "basic.OracleDriverTest";
		Class.forName(driverClass);
		
		
	}

}
