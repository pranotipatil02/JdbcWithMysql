import java.sql.*;

public class CreateTableIntoDatabase {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub

		String url = "jdbc:mysql://localhost:3306/employee";
		String user = "root";
		String password = "1998";
		String query = "create table if not exists employee(\r\n" + "id int auto_increment primary key,\r\n"
				+ "name varchar(100) not null,\r\n" + "age int,\r\n" + "designation varchar(150)\r\n" + ");\r\n" + "";
		/*
		 * mysql workbench  query
		 *  create table if not exists employee( id int auto_increment primary key, name
		 * varchar(100) not null, age int, designation varchar(150) );
		 * 
		 */

		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, user, password);
		Statement state = con.createStatement();
		state.executeUpdate(query);
		System.out.print("Table  created succesfully into the employee database|");
		state.close();
		con.close();

	}

}
