package DAO.member;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import DAO.common.DataSource;

/*
 * DateAccessObject
 * 		- member들의 데이터를 저장하고 있는 member 테이블에 CRUD 작업을 할 수 있는 단위 메소드를 갖고 있는 클래스
 * 		- MemberService 객체의 요청 - 메소드 호출을 받아서 Data Access(DB)에 관련된 단위 기능(CRUD)을 수행하는 객체
 * 		- Data Source 객체를 멤버로 가진다... -> Connection을 사용하기 위해..
 * 
 * 이름         널?       유형            
---------- -------- ------------- 
MEMID      NOT NULL VARCHAR2(20)  
MEMPW               VARCHAR2(30)  
MEMNAME             VARCHAR2(50)  
MEMADDRESS          VARCHAR2(100) 
MEMAGE              NUMBER(3)     
MEMMARRIED          CHAR(1)       
MEMRDATE            DATE 
 */

public class memberDAO {
	
	private DataSource dataSource;  // dataSource 객체!!!!!!
	public memberDAO() {
		this.dataSource = new DataSource();
	}
	
	public int insert(Member member) throws Exception {
		
		String insertSQL = "INSERT INTO member VALUES (?, ?, ?, ?, ?, ?, ?)";
		Connection con = dataSource.getConnection();
		
		PreparedStatement pstmt = con.prepareStatement(insertSQL);
		pstmt.setString(1, member.getMemID());
		pstmt.setString(2, member.getMemPW());
		pstmt.setString(3, member.getMemName());
		pstmt.setString(4, member.getMemAddress());
		pstmt.setInt(5, member.getMemAge());
		pstmt.setString(6, member.getMemMarried());
		
		/* !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!*/
		pstmt.setDate(7, new Date(member.getMemRDate().getTime()));
		/*
		java.util.Date utilDate = new SimpleDateFormat("yyyy/MM/DD").parse("2020/01/14");
		long milliSec = utilDate.getTime();
		pstmt.setDate(7, new Date(milliSec)); // 23.JDBC - src - DAO - statement - preparedStatementMain - 1번 예제
		*/
		int insertRowCount = pstmt.executeUpdate();		
		pstmt.close();
		dataSource.releaseConnection(con);
		
		return insertRowCount;
	}
	
	
	public int deleteByID(String memID) throws Exception {
		
		String deleteSQL = "delete from member where memID = ? ";
		
		Connection con = dataSource.getConnection();
		
		PreparedStatement pstmt = con.prepareStatement(deleteSQL);
		pstmt.setString(1, memID);
		
		int deleteRowCount = pstmt.executeUpdate();
		
		pstmt.close();
		dataSource.releaseConnection(con);
		
		return deleteRowCount;
	}
	
	
	public int updateByID(Member member) throws Exception {
		
		String updateSQL = "update member set memPW =?, memName = ?, memAddress =?, memMarried = ?"
				+ "        where memID = ?";
		
		Connection con = dataSource.getConnection();
		
		PreparedStatement pstmt = con.prepareStatement(updateSQL);
		pstmt.setString(1, "aaa");
		pstmt.setString(2, member.getMemName());
		pstmt.setString(3, member.getMemAddress());
		pstmt.setString(4, member.getMemMarried());
		pstmt.setString(5, member.getMemID());
		
		int updateRowCount = pstmt.executeUpdate();
		
		pstmt.close();
		dataSource.releaseConnection(con);
		
		return updateRowCount;
	}
	
	
	public Member selectByID(String memID) throws Exception {
		Member findMember = null;
		
		String selectSQL = "select * from member where memID = ? ";
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(selectSQL);
		pstmt.setString(1, memID);
		
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			String id = rs.getString("memID");
			String pw = rs.getString("memPW");
			String name = rs.getString("memName");
			String address = rs.getString("memAddress");
			int age = rs.getInt("memAge");
			String isMarried = rs.getString("memMarried");
			java.util.Date regDate = rs.getDate("memRDate");
			
			findMember = new Member(id, pw, name, address, age, isMarried, regDate);
		}
		rs.close();
		pstmt.close();
		dataSource.releaseConnection(con);
		
		return findMember;
	}
	
	
	public ArrayList<Member> selectAll () throws Exception {
		ArrayList<Member> members = null;
		
		String selectAllSQL = "select * from address";
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(selectAllSQL);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			String id = rs.getString("memID");
			String pw = rs.getString("memPW");
			String name = rs.getString("memName");
			String address = rs.getString("memAddress");
			int age = rs.getInt("memAge");
			String isMarried = rs.getString("memMarried");
			java.util.Date regDate = rs.getDate("memRDate");
			
			Member tempMem = new Member(id, pw, name, address, age, isMarried, regDate);
			members.add(tempMem);
		}
		rs.close();
		pstmt.close();
		dataSource.releaseConnection(con);
		
		return members;
	}
	
}