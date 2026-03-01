package jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BatchInsert {
    public static void main(String[] args) {

        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/batchdb",
                    "root",
                    "1234");

            String sql = "INSERT INTO student (roll, name, marks) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            // Add first record
            ps.setInt(1, 1);
            ps.setString(2, "Rahul");
            ps.setInt(3, 80);
            ps.addBatch();

            // Add second record
            ps.setInt(1, 2);
            ps.setString(2, "Amit");
            ps.setInt(3, 75);
            ps.addBatch();

            // Add third record
            ps.setInt(1, 3);
            ps.setString(2, "Priya");
            ps.setInt(3, 90);
            ps.addBatch();

            // Execute Batch
            ps.executeBatch();

            System.out.println("Multiple Records Inserted Successfully!");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}