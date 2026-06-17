// Java code to create database connectivity and data insertion.

import java.sql.*;

public class test {
      public static void main(String[] args) {
    	  
    	  try {
    		  
    		  Class.forName("com.mysql.cj.jdbc.Driver");
    		  
    		  Connection con= DriverManager.getConnection(
    				  "jdbc:mysql://localhost:3306/testdb1", "root", "1234");
    		  
    		  Statement st = con.createStatement();
    		  
    		  st.executeUpdate("INSERT INTO student VALUES (1, 'milan')");
    		  
    		  System.out.println("Insert Successfully!");
    		  
    		  con.close();
    	  } catch (Exception e) {
    		  System.out.println(e);
    	  }
    	  
      }
}

