package dsa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Task1day11 {
	
		public static void main(String[] args) throws SQLException, ClassNotFoundException  {
			Class.forName("com.cj.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/demo";
			String userName="root";
			String password="root123";
			
			Connection con=DriverManager.getConnection(url, userName, password);
			Statement stmt = con.createStatement();
			String query = "Create table student(id int, name varchar(25), age int)";
			stmt.executeUpdate(query);
			System.out.println("Table has been created successfully");
		}
}

