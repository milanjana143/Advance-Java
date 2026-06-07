package com.jdbc;

import java.sql.*;

public class BatchInsert {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/batchinsert",
                "root",
                "1234");

            Statement st = con.createStatement();

            st.addBatch("INSERT INTO student VALUES(1,'Rahul',20)");
            st.addBatch("INSERT INTO student VALUES(2,'Amit',21)");
            st.addBatch("INSERT INTO student VALUES(3,'Priya',19)");
            st.addBatch("INSERT INTO student VALUES(4,'Milan',18)");
            st.addBatch("INSERT INTO student VALUES(5,'Abhi',18)");

            st.executeBatch();

            System.out.println("Records Inserted Successfully");

            con.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}