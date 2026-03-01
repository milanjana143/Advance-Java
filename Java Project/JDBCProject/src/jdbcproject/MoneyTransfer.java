package jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MoneyTransfer {
    public static void main(String[] args) {

        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bankdb",
                    "root",
                    "1234");

            // Disable auto commit
            con.setAutoCommit(false);

            // Debit query
            String debitQuery = "UPDATE account SET balance = balance - ? WHERE acc_no = ?";
            PreparedStatement debit = con.prepareStatement(debitQuery);
            debit.setDouble(1, 1000);
            debit.setInt(2, 101);
            debit.executeUpdate();

            // Credit query
            String creditQuery = "UPDATE account SET balance = balance + ? WHERE acc_no = ?";
            PreparedStatement credit = con.prepareStatement(creditQuery);
            credit.setDouble(1, 1000);
            credit.setInt(2, 102);
            credit.executeUpdate();

            // Commit transaction
            con.commit();

            System.out.println("Money Transferred Successfully!");

        } catch (Exception e) {
        	e.printStackTrace();   // ADD THIS LINE

            try {
                if (con != null) {
                    con.rollback();  // rollback using SAME connection
                    System.out.println("Transaction Failed! Rolled Back.");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}