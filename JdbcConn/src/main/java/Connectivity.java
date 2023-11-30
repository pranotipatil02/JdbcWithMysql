/*
 1)import
 2)load driver
 3)register
 4)create statement
 5)execute statement
 6)prosess/execution/resultset
 7)close connection
 */
//jdbc:mysql://localhost:3306/student
//com.mysql.cj.jdbc.Driver
import java.sql.*;
public class Connectivity {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/employee";
		String username="root";
		String password="1998";
      Class.forName("com.mysql.cj.jdbc.Driver");//mysql driver name
      Connection con=DriverManager.getConnection(url,username,password);//eastablish
      Statement st=con.createStatement();
      ResultSet rs=st.executeQuery("select * from emp ");
      //insert into emp(empid,empname) values(2,"monal");
      String emp_info;
      rs.next();
      emp_info=rs.getInt(1)+":"+rs.getString(2);
      System.out.println(emp_info);
      
      rs.next();
      emp_info=rs.getInt("empid")+" : "+rs.getString("empname");
      System.out.println(emp_info);
      
      
      
	}


}
