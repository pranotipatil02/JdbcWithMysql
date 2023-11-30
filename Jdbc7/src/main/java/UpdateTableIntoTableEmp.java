import java.sql.*;
/*
 create table if not exists emp(
id int auto_increment primary key,
name varchar(100) not null,
age int,
designation varchar(150)
);*/
public class UpdateTableIntoTableEmp {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub

		String url = "jdbc:mysql://localhost:3306/employee";
		String user = "root";
		String password = "1998";
        String updateQuery="update emp set id=?,name=?,age=? where designation=?";
        Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, user, password);
        PreparedStatement pstate=con.prepareStatement(updateQuery);
        pstate.setInt(1,6 );//id
        pstate.setString(2,"Saniya mirza");//name
        pstate.setInt(3, 45);//age
        pstate.setString(4, "Civil Engineer");//designation
        int rowsAffected=pstate.executeUpdate();
        System.out.println(rowsAffected+" records updated successfully!");
       
       
	   pstate.close();
				
		con.close();

	}

}
