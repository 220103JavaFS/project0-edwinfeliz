package Revature.Project0.utils;

import javax.sound.midi.Soundbank;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

    public static Connection getConnection() throws SQLException {
        //For many frameworks using JDBC it is necessary to "register" the driver
        //package you are using. This is to make the framework aware of it.
        try {
            Class.forName(("org.postgresql.Driver"));
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        String url = "jdbc:postgresql://javafs220103.cqltmsw1k4po.us-east-2.rds.amazonaws.com:5432/demos";
        String username = "postgres";
        //String password = "password";
        //System.out.println(System.getenv("SQLPassword"));
        String password = System.getenv("SQLPassword"); //Those are accessed by System.getenv("var-name");
                                                              //Run --> Edit Configurations to set env variables.

        return DriverManager.getConnection(url, username, password);
    }

    public static void main(String[] args){
        try{
            getConnection();
            System.out.println("Connection successful");
        }catch (SQLException e){
            System.out.println("Connection failed");
            e.printStackTrace();
        }
    }
}
