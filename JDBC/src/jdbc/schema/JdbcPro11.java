package jdbc.schema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Savepoint;

public class JdbcPro11 
{
    String driver = "oracle.jdbc.OracleDriver";
    String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
    String user = "shamsundar";
    String pwd = "shamsundar1234";

    // Corrected SQL: AVAILABLE_SEATES column and proper decrement
    String sqlQuery1 = "UPDATE TrainSeatAvailability SET AVAILABLE_SEATES = AVAILABLE_SEATES - 1 " +
                       "WHERE TRAIN_ID=? AND JORNEY_DATE=? AND CLASS=? AND AVAILABLE_SEATES>0";

    String sqlQuery2 = "INSERT INTO BookingDetails VALUES(?,?,?,?,?)";
    String sqlQuery3 = "SELECT PAYMENT_STATUS FROM CustomerPayment WHERE CUSTOMER_ID=?";
    String sqlQuery4 = "UPDATE BookingDetails SET STATUS=? WHERE BOOKING_ID=?";

    public Connection connect()
    {
        Connection con = null;
        try
        {
            Class.forName(driver);
            con = DriverManager.getConnection(dbUrl, user, pwd);
            System.out.println("Connection Created....");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return con;
    }

    void meth1()
    {
        System.out.println("Implementing Transaction Management...");

        try(Connection con = connect())
        {
            System.out.println("getAutoCommit(): " + con.getAutoCommit());
            con.setAutoCommit(false);
            System.out.println("getAutoCommit(): " + con.getAutoCommit());

            // Lock Seat
            PreparedStatement ps1 = con.prepareStatement(sqlQuery1);
            ps1.setString(1, "1234");             // TRAIN_ID
            ps1.setString(2, "2024-10-10");       // JORNEY_DATE
            ps1.setString(3, "Sleeper");          // CLASS

            int rowCount = ps1.executeUpdate();

            if(rowCount == 0)
                throw new RuntimeException("Seat Locking Unsuccessful");
            System.out.println("Seat is Locked");

            Savepoint sp = con.setSavepoint();

            // Insert Booking Record
            PreparedStatement ps2 = con.prepareStatement(sqlQuery2);
            ps2.setString(1, "B101");             // BOOKING_ID
            ps2.setString(2, "1234");             // TRAIN_ID
            ps2.setString(3, "C123");             // CUSTOMER_ID
            ps2.setInt(4, 1);                      // SEAT_NUMBER
            ps2.setString(5, "Payment Pending");  // STATUS

            int rowcount2 = ps2.executeUpdate();

            if(rowcount2 == 0)
                throw new RuntimeException("Booking Unsuccessful");
            System.out.println("Booking Record inserted Successfully");
            System.out.println("Waiting for payment confirmation...");

            // Check Payment Status
            PreparedStatement ps3 = con.prepareStatement(sqlQuery3);
            ps3.setString(1, "C123");             // CUSTOMER_ID
            ResultSet rs = ps3.executeQuery();

            String status = "Failed";
            if(rs.next())
                status = rs.getString(1);

            if(status.equalsIgnoreCase("Success"))
            {
                PreparedStatement ps4 = con.prepareStatement(sqlQuery4);
                ps4.setString(1, "Confirmed");    // STATUS
                ps4.setString(2, "B101");         // BOOKING_ID
                ps4.executeUpdate();
                System.out.println("Payment Confirmed, Booking Updated");
            }
            else
            {
                System.out.println("Payment Failed, Rolling Back...");
                con.rollback(sp);
            }

            con.commit();
            System.out.println("Transaction Committed Successfully");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) 
    {
        new JdbcPro11().meth1();
    }
}
