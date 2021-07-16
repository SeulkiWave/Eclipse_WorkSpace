package com.itwill07.dao.phonebook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class PhoneBookDao {
	
	public PhoneBookDao() {
		// TODO Auto-generated constructor stub
	}
	
	public int insert(PhoneBook tmpP) throws Exception {
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper7";
		String password = "javadeveloper7";
		
		// Insert
		String insertSQL = "insert into phonebook values(phonebook_no_seq.nextval, ?, ?)";
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		
		// Statement stmt = con.createStatement();
		PreparedStatement pstmt1 = con.prepareStatement(insertSQL);
		pstmt1.setString(1, tmpP.getName());
		pstmt1.setString(2, tmpP.getPhone());
		
		int insertRowCount = pstmt1.executeUpdate(insertSQL);
		System.out.println(">> " + insertRowCount + " 행 insert");
		pstmt1.close();
		con.close();
		
		return insertRowCount;
	}
	
	// update
	public int update(PhoneBook tempP) throws Exception {
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper7";
		String password = "javadeveloper7";
		
		String updateSQL = "update phonebook name= ?, phone=? where no = ?";
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		// Statement state = con.createStatement();
		PreparedStatement pstmt2 = con.prepareStatement(updateSQL);
		pstmt2.setString(1, tempP.getName());
		pstmt2.setString(2, tempP.getPhone());
		pstmt2.setInt(3, tempP.getNum());
		int updateRowCount = pstmt2.executeUpdate(updateSQL);
		System.out.println(">> "+updateRowCount);
		
		pstmt2.close();
		con.close();
		
		return updateRowCount;
	}
	
	// delete
	public int delete(int no) throws Exception {
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper7";
		String password = "javadeveloper7";
		
		String deleteSQL = "delete phonebook where no= ?";
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		// Statement state = con.createStatement();
		PreparedStatement pstmt3 = con.prepareStatement(deleteSQL);
		pstmt3.setInt(1, no);
		
		int deleteRowCount = pstmt3.executeUpdate(deleteSQL);
		System.out.println(">> "+deleteRowCount);
		
		pstmt3.close();
		con.close();
		
		return deleteRowCount;
	}
	
	// select by number
	public void select(int no) throws Exception {
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper7";
		String password = "javadeveloper7";
		
		String selectSQL = "select num, name, phone from phonebook where no= ?";
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		
		// Statement stmt = con.createStatement();
		PreparedStatement pstmt4 = con.prepareStatement(selectSQL);
		pstmt4.setInt(1, no);
		
		ResultSet rs = pstmt4.executeQuery(selectSQL);
		while (rs.next()) {
			int num = rs.getInt("num");
			String name = rs.getString("name");
			String phone = rs.getString("phone");
			System.out.println(num + "\t" + name + "\t" + phone);
		}
		
		rs.close();
		pstmt4.close();
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
		// Statement stmt = con.createStatement();
		PreparedStatement pstmt5 = con.prepareStatement(selectSQL);
		
		ResultSet rs = pstmt5.executeQuery(selectSQL);
		while (rs.next()) {
			int num = rs.getInt("num");
			String name = rs.getString("name");
			String phone = rs.getString("phone");
			System.out.println(num + "\t" + name + "\t" + phone);
		}
		rs.close();
		pstmt5.close();
		con.close();
	}
	
}