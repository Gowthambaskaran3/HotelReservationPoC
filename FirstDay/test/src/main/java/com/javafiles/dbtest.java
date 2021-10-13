package com.javafiles;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

public class dbtest {
    public static ArrayList<String> rooms() throws Exception{
        Connection Conn = null;
        Statement stmt = null;
        ResultSet resSet = null;

            Properties props = new Properties();
            props.load(new FileInputStream("D:\\pocjsp\\properties\\hotelroom.properties"));

            String theUser = props.getProperty("user");
            String thePassword = props.getProperty("password");
            String theDburl = props.getProperty("dburl");

            System.out.println("Connecting to database...");
            System.out.println("Database URL: " + theDburl);
            System.out.println("User: " + theUser);


            Conn = DriverManager.getConnection(theDburl, theUser, thePassword);

            System.out.println("\nConnection successful!\n");

            stmt = Conn.createStatement();
            
            resSet = stmt.executeQuery("select * from roomdetails");
            ArrayList<String> room = new ArrayList<String>();

            while (resSet.next()) {
                String roomid = resSet.getString("roomnumber");
                String roomname = resSet.getString("roomtype");

                room.add(roomid+"-"+roomname);
            }
            
            return(room);

    }

}
