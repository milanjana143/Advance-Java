package jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) {

        try {
            // 1️⃣ Load MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2️⃣ Connect to MySQL (No database selected)
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/",
                    "root",
                    "1234");

            // 3️⃣ Create Statement
            Statement stmt = con.createStatement();

            // 4️⃣ Create Database if not exists
            stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS company");
            

            // 5️⃣ Select the database
            stmt.executeUpdate("USE company");

            // 6️⃣ Create Table if not exists
            String sql = "CREATE TABLE IF NOT EXISTS employee (" +
                         "id INT PRIMARY KEY, " +
                         "name VARCHAR(50), " +
                         "salary DOUBLE)";
            
            stmt.executeUpdate(sql);

            System.out.println("Table created successfully!");

            // 7️⃣ Close connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}