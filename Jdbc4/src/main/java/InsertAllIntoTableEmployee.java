import java.sql.*;
/*
 create table if not exists emp(
id int auto_increment primary key,
name varchar(100) not null,
age int,
designation varchar(150)
);*/
public class InsertAllIntoTableEmployee {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub

		String url = "jdbc:mysql://localhost:3306/employee";
		String user = "root";
		String password = "1998";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, user, password);

		Statement state = con.createStatement();
		//-- insert into employee(id,name,age,designation) values(2,"mona",34,"engineer");

		String insert1 = " insert into emp(id,name,age,designation) values(1,\"Mohit Rana\",26,\"Software Engineer\");\r\n"
				+ "";
		String insert2 = "insert into emp(id,name,age,designation) values(2,\"Rohit Shaikh\",24,\"Electrical Engineer\");\r\n"
				+ " ";
		String insert3 = "insert into emp(id,name,age,designation) values(3,\"Sahil Ali\",25,\"Mechanical Engineer\");\r\n"
				+ " ";
		
		
		state.addBatch(insert1);
		state.addBatch(insert2);
		state.addBatch(insert3);
		state.executeBatch();//execute complete batch
		System.out.println("Add records succesfully");
		state.close();
		con.close();

	}

}
