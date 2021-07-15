package com.itwill07.dao.phonebook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PhoneBookDao {
	
	public PhoneBookDao() {
		// TODO Auto-generated constructor stub
	}
	
	public void insert(PhoneBook tmpP) throws Exception {
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper7";
		String password = "javadeveloper7";
		
		// Insert
		String insertSQL = "insert into phonebook values(phonebook_no_seq.nextval,'"+tmpP.getName()+"','"+tmpP.getPhone()+"')";
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		int insertRowCount = stmt.executeUpdate(insertSQL);
		System.out.println(">> " + insertRowCount + " 행 insert");
		stmt.close();
		con.close();
	}
	
	// update
	public void update(PhoneBook tempP) throws Exception {
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper7";
		String password = "javadeveloper7";
		
		String updateSQL = "update phonebook name='"+tempP.getName()+"',phone='"+tempP.getPhone()+" where no = "+tempP.getNum();
		Class.forName(driverClass); // 1
		Connection con = DriverManager.getConnection(url, user, password); // 2
		Statement state = con.createStatement(); // 3
		int updateRowCount = state.executeUpdate(updateSQL);
		System.out.println(">> "+updateRowCount);
	}
	
	// delete
	public void delete(int no) throws Exception {
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper7";
		String password = "javadeveloper7";
		
		String deleteSQL = "delete phonebook where no="+no;
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement state = con.createStatement();
		int deleteRowCount = state.executeUpdate(deleteSQL);
		System.out.println(">> "+deleteRowCount);
	}
	
	// select by number
	public void select(int no) throws Exception {
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper7";
		String password = "javadeveloper7";
		
		String selectSQL = "select num, name, phone from phonebook where no="+no;
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(selectSQL);
		while (rs.next()) {
			int num = rs.getInt("num");
			String name = rs.getString("name");
			String phone = rs.getString("phone");
			System.out.println(num + "\t" + name + "\t" + phone);
		}
		
		rs.close();
		stmt.close();
		con.close();
	}
	
	// select All
	public void selectAll() throws Exception {
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper7";
		String password = "javadeveloper7";
		
		String selectSQL = "select num, name, phone from phonebook";
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(selectSQL);
		while (rs.next()) {
			int num = rs.getInt("num");
			String name = rs.getString("name");
			String phone = rs.getString("phone");
			System.out.println(num + "\t" + name + "\t" + phone);
		}
		rs.close();
		stmt.close();
		con.close();
	}
	
}