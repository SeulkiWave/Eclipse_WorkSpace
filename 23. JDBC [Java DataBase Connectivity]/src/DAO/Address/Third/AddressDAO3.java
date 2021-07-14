/*
 * DAO (Data Access Object)
 		- 회원들의 데이터를 저장하고 있는 파일(테이블)에 CRUD(Create, Read, Update, Delete) 작업을 할수있는 단위 메소드를 가지고 있는 클래스
 			-> 단위 메소드는 CRUD 업무만 담당!
 		- MemberService 객체의 요청(메소드 호출)을 받아서 Data Access(File, DB)에 관련된 단위기능(CRUD)을 수행하는 객체
 */

package DAO.Address.Third;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AddressDAO3 {
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
	
	public void insert(Address insertAdd) throws Exception {
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper7";
		String password = "javadeveloper7";
		
		String insertSql = "insert into address values(address_no_seq.nextval,'"+insertAdd.getId()+"','"+insertAdd.getName()+"','"+insertAdd.getPhone()+"','"+insertAdd.getAddress()+"')";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		int insertRowCount = stmt.executeUpdate(insertSql);
		System.out.println(">> " + insertRowCount + " 행 insert");
		stmt.close();
		con.close();
	}
	
	public void deleteByNum(int no) throws Exception{ // 외부에서 변수를 받기 위해 변수를 선언하장
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper7";
		String password = "javadeveloper7";
		
		String deleteSQL = "delete address where no="+no; // 외부에서 받은 인자no를 삭제하고자 하는 객체로 사용하기..
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement state = con.createStatement();
		int deleteRowCount = state.executeUpdate(deleteSQL);
		System.out.println(">> "+deleteRowCount);
	}
	
	public void updateByNum(int num, String id, String name, String phone, String address) throws Exception {
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper7";
		String password = "javadeveloper7";
		
		String updateSQL = "update address set id='"+id+"',name='"+name+"',phone='"+phone+"',address='"+address+"' where no = "+num;
		Class.forName(driverClass); // 1
		Connection con = DriverManager.getConnection(url, user, password); // 2
		Statement state = con.createStatement(); // 3
		int updateRowCount = state.executeUpdate(updateSQL);
		System.out.println(">> "+updateRowCount);
	}
	
	public void update (Address updateAdd) throws Exception {
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper7";
		String password = "javadeveloper7";
		
		String updateSQL = "update address set id='"+updateAdd.getId()+"',name='"+updateAdd.getName()+"',phone='"+updateAdd.getPhone()+"',address='"+updateAdd.getAddress()+"' where no = "+updateAdd.getNum();
		Class.forName(driverClass); // 1
		Connection con = DriverManager.getConnection(url, user, password); // 2
		Statement state = con.createStatement(); // 3
		int updateRowCount = state.executeUpdate(updateSQL);
		System.out.println(">> "+updateRowCount);
	}
	
	public void selectByNum(int num) throws Exception {
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper7";
		String password = "javadeveloper7";
		
		String selectSql = "select no,id,name,phone,address from address where no="+num;
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
		String user = "javadeveloper7";
		String password = "javadeveloper7";
		
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
