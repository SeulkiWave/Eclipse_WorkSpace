package basic.driver;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Properties;
import java.util.logging.Logger;

public class OracleDriverTest implements Driver {
	
	static {
		// 1. Driver 클래스 객체 생성
		// 2. DriverManager 객체에 등록
		System.out.println("Static Block Start ----- ----- -----");
		try {
			System.out.println("1. Driver 클래스 객체 생성");
			OracleDriverTest oracleDriverTest = new OracleDriverTest();
			System.out.println("2. DriverManager 객체에 등록");
			DriverManager.registerDriver(oracleDriverTest);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Static Block End ----- ----- -----");
	}
	
	@Override
	public boolean acceptsURL(String url) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Connection connect(String url, Properties info) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getMajorVersion() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getMinorVersion() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean jdbcCompliant() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
