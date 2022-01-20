package Revature.Project0.services;

import Revature.Project0.models.Transaction;
import Revature.Project0.repos.TransactionDAO;
import Revature.Project0.repos.TransactionDAOImpl;

import java.util.List;

public class TransactionService {
    private TransactionDAO transactionDAO = new TransactionDAOImpl();
    public List<Transaction> findAllTransactions(){
        return transactionDAO.findAll();
    }

    public Transaction findTransaction(int tId){
        return transactionDAO.findById(tId);
    }

    public boolean updateTransaction(Transaction transaction){
        return transactionDAO.updateTransaction(transaction);
    }

    public boolean addTransaction(Transaction transaction){
        return transactionDAO.addTransaction(transaction);
    }

    public boolean deleteTransaction(int tId){
        return transactionDAO.deleteTransaction(tId);
    }

}
