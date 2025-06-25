package dsa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Task2{
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/JDBC";
		String userName="root";
		String password="root123";
		
		Connection con=DriverManager.getConnection(url, userName, password);
		Statement stmt = con.createStatement();
	
		
		String query = "Insert into student values(1, 'kanika', 20), (2, 'nasreen', 20), (3, 'Sathya', 19)";
		stmt.executeUpdate(query);
		System.out.println("Datas have been inserted successfully");
		
				
	}

}
