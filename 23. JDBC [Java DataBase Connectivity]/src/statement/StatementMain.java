package statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * 이름       널?       유형           
-------- -------- ------------ 
EMPNO    NOT NULL NUMBER(4)    
ENAME             VARCHAR2(10) 
JOB               VARCHAR2(9)  
MGR               NUMBER(4)    
HIREDATE          DATE         
SAL               NUMBER(7,2)  
COMM              NUMBER(7,2)  
DEPTNO            NUMBER(2)    
 */

public class StatementMain {
	public static void main(String[] args) throws Exception {
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper7";
		String password = "javadeveloper7";
		
		String selectSQL = "select * from emp order by sal desc";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		
		stmt.setMaxRows(3);
		// ResultSet의 행의 수 제한!
		// public void java.sql.Statement.setMaxRows(int max) throws SQLException
		//		- Sets the limit for the maximum number of rows that any ResultSet object generated
		//				by this Statement object can contain to the given number.
		// 		- If the limit is exceeded, the excess row are silently dropped.
		// - parameters: max the new max rows limit; zero0 means there is no limit
		
		/* 
		stmt.execute(); --> update인지 다른건지 모르면 이거 쓰면 되는데 비추...
		stmt.executeQuery();
		stmt.executeUpdate();
		*/
		ResultSet rs = stmt.executeQuery(selectSQL); // 시작 전엔 before of file , begin first에 cursor가 위치한다
		int num = 0;
		while (rs.next()) {
			System.out.println(rs.getInt("empno")+"\t"+rs.getString("ename")+"\t"+
											rs.getString("job")+"\t"+rs.getDouble("sal")+"\t"+
											rs.getDate("hiredate"));
			num++;
		}
		rs.close();
		// 도로Driver-Connection의 트럭Statement은 여러대! 그러나 트럭은 1개당 1짐(resultSet)만 옮길 수 있다.
		
		// DML
		String insertSQL = "insert into emp values (9090, 'KIM', 'MANAGER', null, to_date('2020/01/01', 'YYYY/MM/DD'), 6000, null, 40)";
		String updateSQL = "update emp set sal = 6788.98 where empno >= 7369 and empno <= 7600";
		String deleteSQL = "delete from emp where empno = 9090";
		
		int rowCount = stmt.executeUpdate(insertSQL);
		System.out.println(rowCount+"행 insert");
		rowCount = stmt.executeUpdate(updateSQL);
		System.out.println(rowCount+"행 update");
		rowCount = stmt.executeUpdate(deleteSQL);
		System.out.println(rowCount+"행 delete");
		
		/*
		String anySQL = "";
		boolean isSelect = true;
		if (isSelect) {
			anySQL = selectSQL; // select
		} else {
			anySQL = updateSQL; // DML - update
		}
		stmt.execute(anySQL);
		*/
		String anySQL = updateSQL;
		boolean isResultSet = stmt.execute(anySQL);
		if (isResultSet) {
			System.out.println("Sql: "+anySQL);
			// ResultSet
			ResultSet rs1 = stmt.getResultSet();
			while (rs1.next()) {
				System.out.println(rs1.getInt("empno")+"\t"+rs1.getString("ename")+"\t"+
												rs1.getString("job")+"\t"+rs1.getDouble("sal")+"\t"+
												rs1.getDate("hiredate"));
			}
		} else {
			System.out.println("sql: "+anySQL);
			// update count 	
			int rowCount2 = stmt.getUpdateCount();
			System.out.println("update count: "+rowCount2);
		}
		
		stmt.close();
		con.close();
		
	}
}
