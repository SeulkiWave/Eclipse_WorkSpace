package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AddressInsertMain {

	public static void main(String[] args) throws Exception {
		
		/*
		 * 1. Driver Class Loading
		 * 2. Connection 객체 생성 - DB Server에 연결
		 * 3. Statement 객체 생성 - SQL 전송 객체
		 * 4. Statement 객체를 사용해 SQL문 전송 - DML
		 * 5. 실행 결과 - ResultSet, 영향 받은 행의 수
		 */
		
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper7";
		String password = "javadeveloper7";
		
		String insertSQL = "insert into address values(address_no_seq.nextval,'guard','김경호','123-4568','경기도 성남시')";
		
		Class.forName(driverClass); // 1
		Connection con = DriverManager.getConnection(url, user, password); // 2
		Statement state = con.createStatement(); // 3
		
		/* 4 : Statement 객체를 사용해 SQL문을 전송한다.. (DML / Select일 때 구분하기)
		*		- executeUpdate : Executes the given SQL statement, which may be an INSERT, UPDATE,
		*									or DELETE statement or an SQL statement that returns nothing,
		*									such as an SQL DDL statement.
		*				+ Parameters:: SQL - an SQL data Manipulation Language (DML) statement, such as INSERT, UPDATE, DELETE;
		*												or an SQL statement that returns nothing, such as a DDL statement.
		*				+ Result: either (1) the row count(영향 받은 행의 수) for SQL Data Manipulation Language (DML) statement,
		*								or (2) 0 (영향 받은 행이 없는 경우) for SQL statement that return nothing 
		*/
		int insertRowCount = state.executeUpdate(insertSQL); // 1이 반환될 예정..
		System.out.println(">> insert에 영향 받은 행의 수: "+insertRowCount+"만큼 insert 됨");
		
		
		
		
	}

}
