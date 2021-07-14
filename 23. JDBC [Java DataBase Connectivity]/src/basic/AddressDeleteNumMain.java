package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AddressDeleteNumMain {

	public static void main(String[] args) throws Exception {
		
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper7";
		String password = "javadeveloper7";
		
		String deleteSQL = "delete address where no=1";
		
		Class.forName(driverClass); // 1
		Connection con = DriverManager.getConnection(url, user, password); // 2
		Statement state = con.createStatement(); // 3
		
		int deleteRowCount = state.executeUpdate(deleteSQL);
		// java client에서 DML을 하면 자동으로 commit이 된당 (1개의 문장 - 1개의 트랜잭션)
		// auto - commit 을 방지하기 위해 명시적으로 적어줘야 할 필요가 있음..
		System.out.println(">> "+deleteRowCount);
		
	}

}
