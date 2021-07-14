/*
 * DAO (Data Access Object)
 		- 회원들의 데이터를 저장하고 있는 파일(테이블)에 CRUD(Create, Read, Update, Delete) 작업을 할수있는 단위 메소드를 가지고 있는 클래스
 			-> 단위 메소드는 CRUD 업무만 담당!
 		- MemberService 객체의 요청(메소드 호출)을 받아서 Data Access(File, DB)에 관련된 단위기능(CRUD)을 수행하는 객체
 */

package DAO.Address.First;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AddressDAO1 {
	public void insert() throws Exception {
		
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper0";
		String password = "javadeveloper0";
		String insertSql = "insert into address values(address_no_seq.nextval,'guard','김경호','123-4568','경기도 성남시')";//semicolon있으면 애로사항발생~~~~
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		int insertRowCount = stmt.executeUpdate(insertSql);
		System.out.println(">> " + insertRowCount + " 행 insert");
		stmt.close();
		con.close();
	}
	
	public void deleteByNum() throws Exception{
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper7";
		String password = "javadeveloper7";
		String deleteSQL = "delete address where no=1";
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement state = con.createStatement();
		int deleteRowCount = state.executeUpdate(deleteSQL);
		System.out.println(">> "+deleteRowCount);
	}
	
	public void updateByNum() throws Exception {
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
	}
	
	public void selectByNum() throws Exception {
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper0";
		String password = "javadeveloper0";
		String selectSql = "select no,id,name,phone,address from address where no=8";//semicolon있으면 애로사항발생~~~~
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(selectSql);
		while (rs.next()) {
			int no = rs.getInt("no");
			String id = rs.getString("id");
			String name = rs.getString("name");
			String phone = rs.getString("phone");
			String address = rs.getString("address");
			System.out.println(no + "\t" + id + "\t" + name + "\t" + phone + "\t" + address);
		}

		rs.close();
		stmt.close();
		con.close();
	}
	
	public void selectAll() throws Exception {
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper0";
		String password = "javadeveloper0";
		String selectSql = "select no,id,name,phone,address from address";
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(selectSql);
		while (rs.next()) {
			int no = rs.getInt("no");
			String id = rs.getString("id");
			String name = rs.getString("name");
			String phone = rs.getString("phone");
			String address = rs.getString("address");
			System.out.println(no + "\t" + id + "\t" + name + "\t" + phone + "\t" + address);
		}

		rs.close();
		stmt.close();
		con.close();

	}

}
