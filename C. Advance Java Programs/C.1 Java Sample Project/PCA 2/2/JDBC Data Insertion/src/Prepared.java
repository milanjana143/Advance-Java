// JDBC code to insert data using Prepared Statement Interface.

import java.sql.*;

public class Prepared {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb1","root","1234");

            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO student VALUES (?, ?)");

            ps.setInt(1, 1);
            ps.setString(2, "milan");

            ps.executeUpdate();

            System.out.println("Insert Successfully!");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}