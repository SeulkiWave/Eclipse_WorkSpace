package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AddressUpdateNumMain {

	public static void main(String[] args) throws Exception{
		
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper7";
		String password = "javadeveloper7";
		
		String updateSQL = "update address set id='xxx',name='김경호',phone='899-9999',address='서울시 강남구' where no = 1";
		
		Class.forName(driverClass); // 1
		Connection con = DriverManager.getConnection(url, user, password); // 2
		Statement state = con.createStatement(); // 3
		
		int updateRowCount = state.executeUpdate(updateSQL);
		System.out.println(">> "+updateRowCount);
		
		
		state.close();
		con.close();
	}
	

}
