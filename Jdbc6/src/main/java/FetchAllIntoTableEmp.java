import java.sql.*;
/*
 create table if not exists emp(
id int auto_increment primary key,
name varchar(100) not null,
age int,
designation varchar(150)
);*/
public class FetchAllIntoTableEmp {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub

		String url = "jdbc:mysql://localhost:3306/employee";
		String user = "root";
		String password = "1998";
        String query="select * from emp";
        Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, user, password);
        PreparedStatement pstate=con.prepareStatement(query);
        ResultSet result=pstate.executeQuery();
        while(result.next())
        {
        	int id=result.getInt("id");
        	String name=result.getString("name");
            int  age=result.getInt("age");
            String designation=result.getString("designation");
             System.out.println("Id: "+id+" Name: "+name+" Age: "+age+" Designation: "+designation);
        }
        System.out.println("Successfully execute the records");
      
	   pstate.close();
				
		con.close();

	}

}
