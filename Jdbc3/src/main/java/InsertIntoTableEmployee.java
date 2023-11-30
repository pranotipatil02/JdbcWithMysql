import java.sql.*;
public class InsertIntoTableEmployee {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
       
    	   String url="jdbc:mysql://localhost:3306/employee";
    	   String user="root";
    	   String password="1998";
    	   //dynamically u want to insert
    	   //insert into employee(id,name,age,designation) values(?,?,?,?);
           String insertQuery="insert into employee(id,name,age,designation) values(?,?,?,?)";
    	   
    	    Class.forName("com.mysql.cj.jdbc.Driver");
		   Connection con=DriverManager.getConnection(url,user,password);
          PreparedStatement pstate=con.prepareStatement(insertQuery);
          pstate.setLong(1,30);
          pstate.setString(2, "Mohit");
          pstate.setInt(3, 25);
          pstate.setString(4, "Software Engineer");
          int rowsAffected=pstate.executeUpdate();
          if(rowsAffected>0)
          {
        	  System.out.println(rowsAffected+"row affected");
          }
          else
          {
        	  System.out.println(rowsAffected+"row/s affected");
          }
		 
          pstate.close();
          con.close();
       
	}

}
