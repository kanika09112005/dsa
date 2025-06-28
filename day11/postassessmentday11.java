package dsa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class postassessmentday11 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        inventory(); 
    }

    public static void inventory() throws ClassNotFoundException, SQLException {
       
        Class.forName("com.mysql.jdbc.Driver");

        
        String url = "jdbc:mysql://localhost:3306/JDBC";
        String userName = "root";
        String password = "root123";

        
        Connection con = DriverManager.getConnection(url, userName, password);
        Statement stmt = con.createStatement();

        String createTableQuery = "CREATE TABLE IF NOT EXISTS student (id INT, name VARCHAR(25), age INT)";
        stmt.executeUpdate(createTableQuery);
        System.out.println("Table created (if not exists)");

        // Insert 
        String insertQuery = "INSERT INTO student VALUES (1, 'kanika', 20), (2, 'Nasreen', 20), (3, 'Sathya', 19)";
        stmt.executeUpdate(insertQuery);
        System.out.println("Data inserted");

        //  Delete 
        String deleteQuery = "DELETE FROM student WHERE id = 2";
        stmt.executeUpdate(deleteQuery);
        System.out.println(" Data with id=2 deleted");

        // Retrieve 
        String selectQuery = "Select * FROM student";
        ResultSet rs = stmt.executeQuery(selectQuery);

        System.out.println("\n Student Table Data:");
        System.out.println("ID\tName\t\tAge");
        System.out.println("---------------------------");
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int age = rs.getInt("age");
            System.out.println(id + " " + name + " " + age);
        }

  
        rs.close();
        stmt.close();
        con.close();
        System.out.println(" All operations completed.");
    }
}
