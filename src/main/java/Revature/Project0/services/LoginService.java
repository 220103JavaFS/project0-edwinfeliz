package Revature.Project0.services;

import Revature.Project0.utils.ConnectionUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginService {

    private static Logger log = LoggerFactory.getLogger(LoginService.class);
    public int access_level;

    public int login(String username, String password) throws SQLException {

        try (Connection conn = ConnectionUtil.getConnection()) {
//            log.info("1. Testing username: "+username);
//            log.info("1. Testing username to see what its happening: "+password);

            String sql = "SELECT users_email, psw, users_first_name, user_type FROM users WHERE users_email = ? AND psw = crypt(?, psw);";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, password);

//            log.info("2. Testing username: "+username);
//            log.info("2. Testing username to see what its happening: "+password);

            ResultSet result = statement.executeQuery();
            log.info("fucking number, just store that number");

            if (result.next()) {
                log.info("Welcome: "+result.getString("users_first_name"));
                access_level = result.getInt("user_type");
                log.info(Integer.toString(access_level));
                if (username.equals(result.getString("users_email"))) {
                    access_level = result.getInt("user_type");
                    return access_level;
                } else {
                    return 0;
                }
            }
        }
        return 0;
    }
}


