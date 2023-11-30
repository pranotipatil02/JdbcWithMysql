import java.sql.*;
/*
 create table if not exists emp(
id int auto_increment primary key,
name varchar(100) not null,
age int,
designation varchar(150)
);*/
public class DeleteRecordsFromTableEmp {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub

		String url = "jdbc:mysql://localhost:3306/employee";
		String user = "root";
		String password = "1998";
        String deleteQuery="delete from emp where name=\"Sahil Ali\" ";
        
        Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, user, password);
        Statement state=con.createStatement(); 
        int rowsAffected=state.executeUpdate(deleteQuery);
        System.out.println(rowsAffected+" row/s affected");
	    state.close();
				
		con.close();

	}

}
