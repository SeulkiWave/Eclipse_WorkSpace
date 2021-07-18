package DAO.guest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import DAO.common.DataSource;

public class GuestDao {
	private DataSource dataSource;

	public GuestDao() throws Exception {
		dataSource = new DataSource();
	}

	/*
이름             널?       유형             
-------------- -------- -------------- 
GUEST_NO       NOT NULL NUMBER(10)     
GUEST_NAME     NOT NULL VARCHAR2(100)  
GUEST_DATE     NOT NULL DATE           
GUEST_EMAIL             VARCHAR2(100)  
GUEST_HOMEPAGE          VARCHAR2(100)  
GUEST_TITLE    NOT NULL VARCHAR2(255)  
GUEST_CONTENT  NOT NULL VARCHAR2(4000) 
	 */
	
	public int insert(Guest guest) throws Exception {
		String insertSQL = "insert into GUEST values(guest_no_seq.nextval , ?, sysdate, ?, ?, ?, ?)";
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(insertSQL);
		pstmt.setString(1, guest.getGuest_name());
		// pstmt.setDate(2, null); - 이거 어떻게 해야하쥐...
		pstmt.setString(2, guest.getGuest_email());
		pstmt.setString(3, guest.getGuest_homepage());
		pstmt.setString(4, guest.getGuest_title());
		pstmt.setString(5, guest.getGuest_content());
		int count = pstmt.executeUpdate();
		pstmt.close();
		dataSource.releaseConnection(con);
		return count;
	}

	public int update(Guest guest) throws Exception {
		String update = "update guest set guest_name = ?, guest_email = ?, guest_homepage = ?, guest_title = ?, guest_content = ? where guest_no = ?";
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(update);
		pstmt.setString(1, guest.getGuest_name());
		pstmt.setString(2, guest.getGuest_email());
		pstmt.setString(3, guest.getGuest_homepage());
		pstmt.setString(4, guest.getGuest_title());
		pstmt.setString(5, guest.getGuest_content());
		pstmt.setInt(6, guest.getGuest_no());
		int count = pstmt.executeUpdate();
		pstmt.close();
		dataSource.releaseConnection(con);
		return count;
	}

	public int delete(int no) throws Exception {
		String delete = "delete from guest where guest_no = ?";
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(delete);
		pstmt.setInt(1, no);
		int count = pstmt.executeUpdate();
		pstmt.close();
		dataSource.releaseConnection(con);
		return count;
	}
	
	/*
	이름             널?       유형             
	-------------- -------- -------------- 
	GUEST_NO       NOT NULL NUMBER(10)     
	GUEST_NAME     NOT NULL VARCHAR2(100)  
	GUEST_DATE     NOT NULL DATE           
	GUEST_EMAIL             VARCHAR2(100)  
	GUEST_HOMEPAGE          VARCHAR2(100)  
	GUEST_TITLE    NOT NULL VARCHAR2(255)  
	GUEST_CONTENT  NOT NULL VARCHAR2(4000) 
		 */
	
	public Guest selectByNo(int no) throws Exception {
		Guest findGuest = null;
		String select = "select * from guest where guest_no = ?";
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(select);
		pstmt.setInt(1, no);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			int num = rs.getInt("GUEST_NO");
			String name = rs.getString("GUEST_NAME");
			String date = rs.getString("GUEST_DATE");
			String email = rs.getString("GUEST_EMAIL");
			String homepage = rs.getString("GUEST_HOMEPAGE");
			String title = rs.getString("GUEST_TITLE");
			String content = rs.getString("GUEST_CONTENT");
			findGuest = new Guest(num, name, date, email, homepage, title, content);
			}
		rs.close();
		pstmt.close();
		dataSource.releaseConnection(con);
		return findGuest;
	}

	public ArrayList<Guest> selectAll() throws Exception {
		ArrayList<Guest> findGuests = null;
		
		String selectAllSQL = "select * from guest";
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(selectAllSQL);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			int num = rs.getInt("GUEST_NO");
			String name = rs.getString("GUEST_NAME");
			String date = rs.getString("GUEST_DATE");
			String email = rs.getString("GUEST_EMAIL");
			String homepage = rs.getString("GUEST_HOMEPAGE");
			String title = rs.getString("GUEST_TITLE");
			String content = rs.getString("GUEST_CONTENT");
			Guest findGuest = new Guest (num, name, date, email, homepage, title, content);
			findGuests.add(findGuest);
		}
		rs.close();
		pstmt.close();
		dataSource.releaseConnection(con);
		return findGuests;
	}
}