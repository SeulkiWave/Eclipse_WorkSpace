package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCFlowMain {

	public static void main(String[] args) throws Exception {
		
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper7";
		String password = "javadeveloper7";
		String selectSQL = "select * from dept"; // 문장 안에 ; 금지..
		
		/* 1. Driver Class Loading
				: Driver 클래스 객체를 생성
					-> DriverManager 객체에 등록
					-> 등록된 Driver를 사용해 driverClass로 연결 객체를 요구함.. (url 필요)
		*/
		Class.forName(driverClass);
		System.out.println("1. Driver Class Loading");
		
		// 2. Connection 객체 생성 : DB Server에 연결...
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. Connection 객체 생성 - DB Server : "+con);
		
		// 3. Statement 객체 생성 : Connect에게 SQL문 전달 불가능 --> SQL문을 전송할 수 있는 객체 생성
		Statement state = con.createStatement();
		System.out.println("3. Statement 객체 생성 - SQL문 전송 객체: "+state);
		
		// 4. SQL문 전송
		// state.executeQuery(selectSQL);
		// 5. Result Set 얻기
		ResultSet result = state.executeQuery(selectSQL);
		System.out.println("4. SQL문 전송: " +selectSQL);
		System.out.println("5. ResultSet(결과 집합) 얻기: "+result);
		
		while (result.next()) {
			int deptno = result.getInt("deptno");
			String dname = result.getString("dname");
			String loc = result.getString("loc");
			System.out.println(deptno+"\t"+dname+"\t"+loc);
		}
		
		// 6. Resource 해지
		result.close();
		state.close();
		con.close();
		
		
	}

}
