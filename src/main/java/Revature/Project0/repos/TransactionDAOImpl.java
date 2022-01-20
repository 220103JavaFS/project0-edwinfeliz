package Revature.Project0.repos;

import Revature.Project0.models.Transaction;
import Revature.Project0.utils.ConnectionUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TransactionDAOImpl implements TransactionDAO{

    //See al transactions.  Tables to use: users, account_info, transaction_info.
    @Override
    public List<Transaction> findAll() {
        try (Connection conn = ConnectionUtil.getConnection()){
            String sql = "SELECT users_first_name, users_last_name, account_id, acc_type, "+
                          "account_status, account_bal, transaction_id, transaction_type, transaction_amount, transaction_status " +
                          "FROM users " +
                          "INNER JOIN customer ON users.users_email = customer.cust_email "+
                          "INNER JOIN account_info ON customer.cust_id = account_info.account_cust_id "+
                          "INNER JOIN transaction_info ON account_info.account_id=transaction_info.transaction_account_id;" ;

            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);

            List<Transaction> transactions = new ArrayList<>();

            while (result.next()){
                Transaction transaction = new Transaction();
                transaction.setUserFirstName(result.getString("users_first_name"));
                transaction.setUserLastName(result.getString("users_last_name"));
                transaction.setAccount_id(result.getInt("account_id"));
                transaction.setAcc_type(result.getString("acc_type"));
                transaction.setAccount_status(result.getString("account_status"));
                transaction.setAccount_bal(result.getFloat("account_bal"));
                transaction.setTransaction_id(result.getInt("transaction_id"));
                transaction.setTransaction_type(result.getString("transaction_type"));
                transaction.setTransaction_amount(result.getFloat("transaction_amount"));
                transaction.setTransaction_status(result.getString("transaction_status"));
            }

            return transactions;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Transaction findById(int tId) {
        return null;
    }

    @Override
    public boolean updateTransaction(Transaction transaction) {
        return false;
    }

    @Override
    public boolean addTransaction(Transaction transaction) {
        return false;
    }

    @Override
    public boolean deleteTransaction(int tId) {
        return false;
    }
}
