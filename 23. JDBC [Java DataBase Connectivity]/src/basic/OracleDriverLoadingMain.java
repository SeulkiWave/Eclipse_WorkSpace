package basic;

public class OracleDriverLoadingMain {

	public static void main(String[] args) throws Exception {
		
		String driverClass = "basic.OracleDriverTest";
		Class.forName(driverClass);
		
		
	}

}
