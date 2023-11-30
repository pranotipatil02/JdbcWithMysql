import java.sql.*;
/*
 create table if not exists emp(
id int auto_increment primary key,
name varchar(100) not null,
age int,
designation varchar(150)
);*/
public class InsertAllIntoTableEmp {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub

		String url = "jdbc:mysql://localhost:3306/employee";
		String user = "root";
		String password = "1998";
        String query="insert into emp(id,name,age,designation)values(?,?,?,?)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, user, password);

		PreparedStatement pstate=con.prepareStatement(query);
		String data[][]= {
				{"4","Sakshi Rane","25","Software Engineer"},
				{"5","Kartik Aryan","30","Civil Engineer"},
			};
		
		for(String[] record:data)
		{
			pstate.setInt(1, Integer.parseInt(record[0]));//1 coloumn 1 idd add 
			pstate.setString(2, record[1]);//2 coloumn name add
			pstate.setInt(3, Integer.parseInt(record[2]));//3 coloumn age add
			pstate.setString(4, record[3]);//4 coloumn designation add
		    pstate.addBatch();
		}
		int[] rowsAffected =pstate.executeBatch();
		
		for(int i:rowsAffected)
		{
			if(i==1)
			{
				System.out.println("Data inserted successfully");
			}
			else
			{
				System.out.println("Insertion failed");
			}
		}
		pstate.close();
		con.close();

	}

}
