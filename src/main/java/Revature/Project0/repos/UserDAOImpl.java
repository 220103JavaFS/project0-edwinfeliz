package Revature.Project0.repos;

import Revature.Project0.models.User;
import Revature.Project0.utils.ConnectionUtil;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO{


    //Employees of the bank should be able to view all of their customers' information. This includes:
    //Account information
    //Account balances
    //Personal information
    @Override
    public List<User> findAll() {
        try(Connection conn= ConnectionUtil.getConnection()){
            String sql = "SELECT * FROM users " +
                          "INNER JOIN customer ON users.users_email = customer.cust_email "+
                          " INNER JOIN account_info ON customer.cust_id = account_info.account_cust_id;" ;
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);

            List<User> usersList = new ArrayList<>();

            while (result.next()){
                User user = new User();
                int type= result.getInt("user_type");
                if (type == 3){
                    user.setUserId(result.getInt("users_id"));
                    user.setUserFirstName(result.getString("users_first_name"));
                    user.setUserLastName(result.getString("users_last_name"));
                    user.setUserEmail(result.getString("users_email"));
                    user.setAccount_id(result.getInt("account_id"));
                    user.setAcc_type(result.getString("acc_type"));
                    user.setAccount_status(result.getString("account_status"));
                    user.setAccount_bal(result.getInt("account_bal"));
                    usersList.add(user);
                }
            }

            return usersList;

        }catch (SQLException e){
            e.printStackTrace();

        }
        return new ArrayList<>();
    }

    @Override
    public User findByEmail(String email) {
        try (Connection conn = ConnectionUtil.getConnection()){
            String sql = "SELECT * FROM users WHERE users_email = ?;"; //The question mark here is for use with prepared statement
            PreparedStatement statement = conn.prepareStatement(sql);
            //parameter index indicates the "?" that will be replaced with the value given as the second input.
            statement.setString(1, email);
            ResultSet result = statement.executeQuery();

            User user = new User();

            if (result.next()){
                user.setUserId(result.getInt("users_id"));
                user.setUserFirstName(result.getString("users_first_name"));
                user.setUserLastName(result.getString("users_last_name"));
                user.setUserEmail(result.getString("users_email"));
                user.setUserGender(result.getString("users_gender"));
                user.setUserDOB(result.getString("users_dob"));
                user.setUserStr(result.getString("users_str"));
                user.setUserZip(result.getInt("users_zip"));
                user.setUserCity(result.getString("users_city"));
                user.setUserState(result.getString("users_state"));
                user.setUserPhone(result.getString("users_phone_no"));
                user.setUser_psw(result.getString("psw"));
            }

            return user;

        }catch (SQLException e){
            e.printStackTrace();
        }

        return new User();
    }

    @Override
    public boolean updateUser(User user) {
        try(Connection conn = ConnectionUtil.getConnection()){
            String sql = "UPDATE users SET users_first_name = ?, users_last_name = ?,  users_email=?, users_gender = ?, users_str = ?," +
                    "users_zip = ?, users_city = ?, users_state = ?, users_phone_no = ? WHERE users_email = ?;";

            PreparedStatement statement = conn.prepareStatement(sql);

            int count = 0;
            statement.setString(++count, user.getUserFirstName());
            statement.setString(++count, user.getUserLastName());
            statement.setString(++count, user.getUserEmail());
            statement.setString(++count, user.getUserGender());
            statement.setString(++count, user.getUserStr());
            statement.setInt(++count, user.getUserZip());
            statement.setString(++count, user.getUserCity());
            statement.setString(++count, user.getUserState());
            statement.setString(++count, user.getUserPhone());
            statement.setString(++count, user.getUserEmail());
            statement.execute();
            return true;

        }catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean addUser(User user) {
        try(Connection conn = ConnectionUtil.getConnection()){
            String sql = "INSERT INTO users (users_first_name, users_last_name, users_email, psw, users_gender, " +
                    "users_str, users_zip, users_city, users_state, users_phone_no, user_type)" +
                    "VALUES (?,?,?,?,?,?,?,?,?,?,?);";

            PreparedStatement statement = conn.prepareStatement(sql);

            int count = 0;
            statement.setString(++count, user.getUserFirstName());
            statement.setString(++count, user.getUserLastName());
            statement.setString(++count, user.getUserEmail());
            statement.setString(++count, user.getUser_psw());
            statement.setString(++count, user.getUserGender());
//            statement.setString(++count, user.getUserDOB());
            statement.setString(++count, user.getUserStr());
            statement.setInt(++count, user.getUserZip());
            statement.setString(++count, user.getUserCity());
            statement.setString(++count, user.getUserState());
            statement.setString(++count, user.getUserPhone());
            statement.setInt(++count,user.getUserType());
            statement.execute();
            return true;

        }catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteUser(String email) {
        try (Connection conn = ConnectionUtil.getConnection()){
            String sql = "DELETE FROM users WHERE users_email = ?;"; //The question mark here is for use with prepared statement
            PreparedStatement statement = conn.prepareStatement(sql);
            //parameter index indicates the "?" that will be replaced with the value given as the second input.
            statement.setString(1, email);

            return statement.execute();

        }catch (SQLException e){
            e.printStackTrace();
        }
        return true;
    }
}
