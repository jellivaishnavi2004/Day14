import java.sql.*;
class OracleCon{
public static void main(String[] args)
{
try{
	Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.println("passed 1");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
System.out.println("passed 2");	
Statement stmt=con.createStatement();
String sql="insert into into dept"+"(deptno,dname)"+"values(10,'ACCOUNTING')";
stmt.executeUpdate(sql);
ResultSet rs=stmt.executeQuery("select * from emp");
System.out.println("passed 3");
while(rs.next())
System.out.println(rs.getInt(1)+""+rs.getString(2));
con.close();
}
	catch(Exception e){
		System.out.println(e);
	}
}
}