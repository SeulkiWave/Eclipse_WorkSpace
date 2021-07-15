package statement;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;
import java.text.SimpleDateFormat;

/*
<<PreparedStatement>>

1. SQL문 작성
	- ? (파라미터)를 사용해서 나중에 외부에서 데이터 (리터럴)를 받을 수 있게 한다.
		ex > insert into emp (empno, ename, job, manager, hiredate, sal, comm, deptno) values(?, ?, ?, ?, ?, ?, ?, ?)	
	- 테이블 이름, 컬럼 이름 등은 ?를 사용해서 외부에서 입력 받을 수 없다.
		ex> select * from ? ;
          select ?, ? from emp;
2. PreparedStatement 객체 생성 후! 인자로 sql문을 넣어서 생성한다.
		ex> PreparedStatement pstmt = con.prepareStatement(sql);
3. 생성된 PreparedStatement 객체에 파라미터를 설정(Setting, Binding)한다
	- sql 좌측 ?부터 1, 2, 3 . . .
		ex>pstmt.setInt(1, 1234);              
 	   		pstmt.setString(2, "KIM");
   			pstmt.setString(3, 'MANAGER");
  			pstmt.setInt(4, 7839);
   			pstmt.setDate(5, new Date());
   			pstmt.setDouble(6, 1000.12);
   			pstmt.setInt(7, 0);
   			pstmt.setInt(8, 10);
 4.  실행
    - 실행시 sql문을 인자로 넣지안는다.
		ex>pstmt.executeUpdate();         
        	pstmt.executeQuery();         
*/

public class preparedStatementMain {

	public static void main(String[] args) throws Exception {
		
		// DB 접속 정보
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper7";
		String password = "javadeveloper7";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		
		// Insert - preparedStatement
		String insertSQL1 = "insert into emp (empno, ename, job, mgr, hiredate, sal, comm, deptno) values (?, ?, ?, ?, ?, ?, ?, ?)";
		/*
		PreparedStatement pstmt1 = con.prepareStatement(insertSQL1); //3
		pstmt1.setInt(1, 7000);
		pstmt1.setString(2, "TOM");
		pstmt1.setString(3, "SALESMAN");
		pstmt1.setInt(4, 7369);
		
		pstmt1.setDate(5, new Date(System.currentTimeMillis()));
		or
		//java.util.Date --> java.sql.date
		java.utilDate utilDate = new SimpleDateFormat("yyyy/MM/dd").parse("2003/09/06");
		long milliSec = utilDate.getTime();
		pstmt1.setDate(5, new java.sql.Date(milliSec));
		
		pstmt1.setDouble(6, 8000.34);
		pstmt1.setInt(7, 0);
		pstmt1.setInt(8, 40);
		int insertRowCount = pstmt1.executeUpdate();
		System.out.println(insertRowCount+"행 insert");
		*/
		
		String insertSQL2 = "insert into emp (empno, ename, job, mgr, hiredate, sal, comm, deptno) values (?, ?, ?, ?, sysdate, ?, ?, ?)";
		/*
		PreparedStatement pstmt2 = con.prepareStatement(insertSQL2);
		pstmt2.setInt(1, 7001);
		pstmt2.setString(2, "NEME");
		pstmt2.setString(3, "GAMER");
		pstmt2.setInt(4, 7369);
		pstmt2.setDouble(5, 5000);
		pstmt2.setInt(6, 0);
		pstmt2.setInt(7, 40);
		int insertRowCount2 = pstmt2.executeUpdate();
		System.out.println(insertRowCount2+"행 insert");
		*/
		
		String insertSQL3 = "insert into emp (empno, ename, job, mgr, hiredate, sal, comm, deptno) values (?, ?, ?, ?, to_date(?, ?), ?, ?, ?)";
		/*
		PreparedStatement pstmt3 = con.prepareStatement(insertSQL3);
		pstmt3.setInt(1, 7002);
		pstmt3.setString(2, "HONGDAL");
		pstmt3.setString(3, "GAMER");
		pstmt3.setInt(4, 7369);
		pstmt3.setString(5, "2021/07/15");
		pstmt3.setString(6, "YYYY/MM/DD");
		pstmt3.setDouble(7, 9000);
		pstmt3.setInt(8, 100);
		pstmt3.setInt(9, 40);
		int insertRowCount3 = pstmt3.executeUpdate();
		System.out.println(insertRowCount3+"행 insert");
		*/
		
		String insertSQL4 = "insert into emp values (?, ?, ?, ?, ?, ?, ?, ?)";
		/*
		PreparedStatement pstmt4 = con.prepareStatement(insertSQL4);
		pstmt4.setInt(1, 7003);
		pstmt4.setString(2, null);
		pstmt4.setNull(3, Types.VARCHAR);
		pstmt4.setNull(4, Types.INTEGER);
		pstmt4.setNull(5, Types.DATE);
		pstmt4.setNull(6, Types.DOUBLE);
		pstmt4.setNull(7, Types.INTEGER);
		pstmt4.setNull(8, Types.INTEGER);
		int insertRowCount4 = pstmt4.executeUpdate();
		System.out.println(insertRowCount4+"행 insert");
		*/
		
		// Select PreparedStatement
		int startSal = 1000;
		int endSal = 2000;
		String job = "CLERK";
		// select Statement
		String selectSQL = "select * from emp where sal >= "+startSal+" and sal <= "+endSal+" and job = '"+job+"'";
		Statement stmt= con.createStatement();
		ResultSet rs = stmt.executeQuery(selectSQL);
		while (rs.next()) {
			int empno = rs.getInt("empno");
			String ename = rs.getString("ename");
			String sjob = rs.getString("job");
			Double sal = rs.getDouble("sal");
			Date hiredate = rs.getDate("hiredate");
			String hiredateStr = new SimpleDateFormat("yyyy/MM/dd").format(hiredate);
			System.out.println(empno+"\t"+ename+"\t"+sjob+"\t"+sal+"\t"+hiredateStr);
		}
		
		// Select PreparedStatement
		String selectSQL2 = "select * from emp where sal >= ? and sal <= ? and job = ?";
		PreparedStatement pstmt = con.prepareStatement(selectSQL2);
		pstmt.setInt(1, startSal);
		pstmt.setInt(2, endSal);
		pstmt.setString(3, job);
		ResultSet rs2 = pstmt.executeQuery();
		while (rs2.next()) {
			int empno = rs2.getInt("empno");
			String ename = rs2.getString("ename");
			String sjob = rs2.getString("job");
			Double sal = rs2.getDouble("sal");
			Date hiredate = rs2.getDate("hiredate");
			String hiredateStr = new SimpleDateFormat("yyyy/MM/dd").format(hiredate);
			System.out.println(empno+"\t"+ename+"\t"+sjob+"\t"+sal+"\t"+hiredateStr);
		}
		
		
	}

}
