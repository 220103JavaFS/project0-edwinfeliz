package Revature.Project0.repos;

import Revature.Project0.models.Transaction;
import java.util.List;

public interface TransactionDAO {
    public List<Transaction> findAll();
    public Transaction findById(int tId);
    public boolean updateTransaction(Transaction transaction);
    public boolean addTransaction(Transaction transaction);
    public boolean deleteTransaction(int tId);
}
