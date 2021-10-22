package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class databaseConnection {
	public static Connection initializeDatabase()
	        throws SQLException, ClassNotFoundException, FileNotFoundException, IOException
	    {

            Properties props = new Properties();
            props.load(new FileInputStream("D:\\pocjsp\\properties\\hotelroom.properties"));

            String dbDriver = "com.mysql.jdbc.Driver";
            String theUser = props.getProperty("user");
            String thePassword = props.getProperty("password");
            String theDburl = props.getProperty("dburl");


            Class.forName(dbDriver);
            Connection con = DriverManager.getConnection(theDburl, theUser, thePassword);

            System.out.println("Connecting to database...");
            System.out.println("Database URL: " + theDburl);
            System.out.println("User: " + theUser);

	        return con;
	    }
}
