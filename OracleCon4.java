import java.sql.*;
class OracleCon{
public static void main(String[] args)
{
try{
	Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
Statement stmt=con.createStatement();
String sql="delete emp where deptno=30";
stmt.executeUpdate(sql);
ResultSet rs=stmt.executeQuery("select * from emp");
while(rs.next())
System.out.println(rs.getInt(1)+" "+rs.getString(2));
con.close();
}
catch(Exception e){
System.out.println(e);
}
}
}