package jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateMarks {
    public static void main(String[] args) {

        try {
            // Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/class",
                    "root",
                    "1234");

            // SQL Update Query
            String sql = "UPDATE student SET marks = ? WHERE roll = ?";

            // Create PreparedStatement
            PreparedStatement ps = con.prepareStatement(sql);

            // Set new marks and roll number
            ps.setInt(1, 85);  // new marks
            ps.setInt(2, 1);   // roll number

            // Execute Update
            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Marks Updated Successfully!");
            } else {
                System.out.println("Roll number not found!");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}