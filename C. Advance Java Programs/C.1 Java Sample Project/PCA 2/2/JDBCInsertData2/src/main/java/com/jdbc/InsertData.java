package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertData {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/insertdata",
                    "root",
                    "1234");

            String sql =
                    "INSERT INTO student(id,name,course) VALUES(?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, 101);
            ps.setString(2, "kousik");
            ps.setString(3, "BCA");
            
       

            int i = ps.executeUpdate();

            if(i > 0) {
                System.out.println("Data Inserted Successfully");
            } else {
                System.out.println("Insertion Failed");
            }

            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}