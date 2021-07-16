package DAO.Address.Fourth;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * Connection을 생성 - 해지 하는 역할을 하는 클래스!
 * 		- DAO 객체들이 사용한당
 
  		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper37";
		String password = "javadeveloper37";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
 */
public class DataSource {
	
	
	
	// Connection 생성
	public Connection getConnection() throws Exception{
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper37";
		String password = "javadeveloper37";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		
		return con;
	}
	
	// Connection 해지(반납)
	public Connection releaseConnection(Connection con) throws Exception{
		con.close();
		
	}
	
}
