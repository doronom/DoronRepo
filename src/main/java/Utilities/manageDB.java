package Utilities;

//import com.sun.jna.platform.win32.WTypes;

import java.sql.Driver;
import java.sql.DriverManager;

//Initializing DB connection method
public class manageDB extends CommonOps
{
    public static void initConnection(String dbURL, String user, String password)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(dbURL, user, password);
            stmt = con.createStatement();
        }
        catch (Exception e)
        {
            System.out.println("Error to connect DB, see details: " + e);
        }
    }

    //Closing DB session connection
    public static void closeConnection()
    {
        try
        {
            con.close();
        }

        catch (Exception e)
        {
            System.out.println("Error disconnecting DB, see details: " + e);
        }
    }
}
