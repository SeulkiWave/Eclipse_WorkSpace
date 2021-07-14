package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AddressSelectNoMain {

	public static void main(String[] args) throws Exception {
		
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper7";
		String password = "javadeveloper7";
		
		String selectSQL = "select no,id,name,phone,address from address where no = 3";
		
		Class.forName(driverClass); // 1
		Connection con = DriverManager.getConnection(url, user, password); // 2
		Statement state = con.createStatement(); // 3
		
		/* ResultSet : executeQuery(String sql) throws Exception : 데이터베이스의 결과 집합을 표현하는 데이터 테이블?
		 * 		커서가 있는 영역의 데이터만 조작할 수 있다.. --> 첫 번째 row에 위치하기 위해 .next()로 커서를 1번 데이터로 이동시켜줌
		 		A ResultSet object maintains a cursor pointing to its current row of data. Initially the cursor is positioned before the first row. (default first)
		 			The next method moves the cursor to the next row, and because it returns false when there are no more rows in the ResultSet object,
		 			it can be used in a while loop to iterate through the result set. (맨 마지막: EndOfFirst, AfterLast.. / 맨앞: BeforeOfFirst,BeforeFirst 데이터가 없는 위치)
		 		A default ResultSet object is not updatable and has a cursor that moves forward only.
		 			Thus, you can iterate through it only once and only from the first row to the 아악!...
				Executes the given SQL statement, which returns a single ResultSet object
				- Parameters : SQL - an SQL statement to be sent to the database, typically a static SQL select statement
				- Returns : a ResultSet object that contains the data produced by the given query; never null!
					- 데이터가 null일 수 없다=> BOF/BF, EOF/AL에 커서가 위치하는.. 데이터가 없는 경우 결과가 false로 떨어지는..
					
				boolean next() throws SQLException;
					- moves the cursor one row from its current position.
					- A ResultSet cursor is initially positioned before the first row;
							the first call to the method next makes the first row the current row;
							the second call makes the second row the current row, and so on...
							when a call to the next method returns false, the cursor is positioned after the last row
		*/
		ResultSet rs = state.executeQuery(selectSQL);
		boolean isResultSet = rs.next();
		System.out.println(isResultSet);
		while (rs.next()) { // 전형적인 돌리는 방법! ~.~
			// System.out.println("데이터 출력: "+isResultSet);
			/*
			 * DB number -> int/double
			 * 		varchar2 -> String
			 * 		date -> date
			 * 	xxx vr = rs.getXXX("컬럼 이름");
			 */
			int no = rs.getInt("no");
			String id = rs.getString("id");
			String name = rs.getString("name");
			String phone = rs.getString("phone");
			String address = rs.getString("address");
			System.out.println(no+"\t"+id+"\t"+name+"\t"+phone+"\t"+address);
		}
		
		rs.close();
		state.close();
		con.close();
		
		
	}

}
