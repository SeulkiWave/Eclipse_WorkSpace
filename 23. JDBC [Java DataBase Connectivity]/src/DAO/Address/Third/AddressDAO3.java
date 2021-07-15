/*
 * DAO (Data Access Object)
 		- 회원들의 데이터를 저장하고 있는 파일(테이블)에 CRUD(Create, Read, Update, Delete) 작업을 할수있는 단위 메소드를 가지고 있는 클래스
 			-> 단위 메소드는 CRUD 업무만 담당!
 		- MemberService 객체의 요청(메소드 호출)을 받아서 Data Access(File, DB)에 관련된 단위기능(CRUD)을 수행하는 객체
 */

package DAO.Address.Third;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class AddressDAO3 {
	/*  --> 귀찮아서...
	public void insert(String id, String name, String phone, String address) throws Exception {
		
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper7";
		String password = "javadeveloper7";
		
		String insertSql = "insert into address values(address_no_seq.nextval,'"+id+"','"+name+"','"+phone+"','"+address+"')";
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		int insertRowCount = stmt.executeUpdate(insertSql);
		System.out.println(">> " + insertRowCount + " 행 insert");
		stmt.close();
		con.close();
	}
	*/
	
	public int insert(Address insertAdd) throws Exception {
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper7";
		String password = "javadeveloper7";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		
		String insertSQL = "insert into address values(address_no_seq.nextval, ?, ?, ?, ?)";
		// id, name, phone, address
		PreparedStatement pstmt1 = con.prepareStatement(insertSQL);
		pstmt1.setString(1, insertAdd.getId());
		pstmt1.setString(2, insertAdd.getName());
		pstmt1.setString(3, insertAdd.getPhone());
		pstmt1.setString(4, insertAdd.getAddress());
		
		int insertRowCount = pstmt1.executeUpdate();
		System.out.println(">> " + insertRowCount + " 행 insert");
		pstmt1.close();
		con.close();
		
		return insertRowCount;
	}
	
	public int deleteByNum(int no) throws Exception{ // 외부에서 변수를 받기 위해 변수를 선언하장
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper7";
		String password = "javadeveloper7";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		
		String deleteSQL = "delete address where no= ?"; // 외부에서 받은 인자no를 삭제하고자 하는 객체로 사용하기..

		PreparedStatement pstmt2 = con.prepareStatement(deleteSQL);
		pstmt2.setInt(1, no);
		
		int deleteRowCount = pstmt2.executeUpdate();
		System.out.println(">> "+deleteRowCount+"행 delete");
		pstmt2.close();
		con.close();
		
		return deleteRowCount;
	}
	
	/* --> 귀찮아서...
	public void updateByNum(int num, String id, String name, String phone, String address) throws Exception {
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper7";
		String password = "javadeveloper7";
		
		String updateSQL = "update address set id='"+id+"',name='"+name+"',phone='"+phone+"',address='"+address+"' where no = "+num;
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		
		Statement state = con.createStatement();
		int updateRowCount = state.executeUpdate(updateSQL);
		System.out.println(">> "+updateRowCount);
	}
	*/
	
	public void update (Address updateAdd) throws Exception {
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper7";
		String password = "javadeveloper7";
		
		String updateSQL = "update address set id = ?, name = ?, phone = ?, address = ? where no = ?";
		Class.forName(driverClass); // 1
		Connection con = DriverManager.getConnection(url, user, password);
		
		PreparedStatement pstmt3 = con.prepareStatement(updateSQL);
		pstmt3.setString(1, updateAdd.getId());
		pstmt3.setString(2, updateAdd.getName());
		pstmt3.setString(3, updateAdd.getPhone());
		pstmt3.setString(4, updateAdd.getAddress());
		pstmt3.setInt(5, updateAdd.getNum());
		
		int updateRowCount = pstmt3.executeUpdate(updateSQL);
		System.out.println(">> "+updateRowCount);
		pstmt3.close();
		con.close();
	}
	
	public Address selectByNum(int num) throws Exception {
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper7";
		String password = "javadeveloper7";
		
		Address findAdd = null;
		
		String selectSql = "select no, id, name, phone, address from address where no= ?";
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		
		PreparedStatement pstmt4 = con.prepareStatement(selectSql);
		pstmt4.setInt(1, num);
		
		ResultSet rs = pstmt4.executeQuery();
		while (rs.next()) {
			int no = rs.getInt("no");
			String id = rs.getString("id");
			String name = rs.getString("name");
			String phone = rs.getString("phone");
			String address = rs.getString("address");
			findAdd = new Address(no, id, name, phone, address);
			// System.out.println(no + "\t" + id + "\t" + name + "\t" + phone + "\t" + address);
		}

		rs.close();
		pstmt4.close();
		con.close();
		return findAdd;
	}
	
	public ArrayList<Address> selectAll() throws Exception { // Address는 DTO, ArrayList는 DTO의 Collection
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper7";
		String password = "javadeveloper7";
		
		ArrayList<Address> addLists = new ArrayList<Address>();
		
		String selectSQL = "select * from address"; // 이거 preparedStatement로 넣을 게 없는데 굳이.. 바꿔야 하는걸까...
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		/*
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(selectSQL);
		*/
		 PreparedStatement pstmt5 = con.prepareStatement(selectSQL);
		 ResultSet rs = pstmt5.executeQuery();
		
		while (rs.next()) {
			int no = rs.getInt("no");
			String id = rs.getString("id");
			String name = rs.getString("name");
			String phone = rs.getString("phone");
			String address = rs.getString("address");
			
			Address tempAdd = new Address();
			addLists.add(tempAdd);
			// System.out.println(no + "\t" + id + "\t" + name + "\t" + phone + "\t" + address);
		}
		rs.close();
		pstmt5.close();
		con.close();
		
		return addLists;
	}

}
