import java.sql.*;
public class CreateDatabase {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
       
    	   String url="jdbc:mysql://localhost:3306";
    	   String user="root";
    	   String password="1998";
		   String query="create database EmployeeANP6060";
    	   Class.forName("com.mysql.cj.jdbc.Driver");
		   Connection con=DriverManager.getConnection(url,user,password);
          Statement state=con.createStatement();
          state.executeUpdate(query);
	      System.out.print("database created succesfully|");
          state.close();
          con.close();
       
	}

}
