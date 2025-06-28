package dsa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class mainproday11{
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
    String deletequery = "Delete from student where id=2";
		int no = stmt.executeUpdate(deletequery);
		System.out.println("One data has been deleted successfully");
		
		String query = "Select * from student";
		ResultSet rs = stmt.executeQuery(query);
		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			int age = rs.getInt("age");

			System.out.println(id + " " + name + " " + age);
		}
  }
}
