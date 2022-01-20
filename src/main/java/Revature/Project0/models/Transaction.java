package Revature.Project0.models;

import java.util.Objects;

public class Transaction {
    //Customer_info
    private String userFirstName;
    private String userLastName;
    private String userEmail;
    private String user_psw;

    //Transaction Info
    private int transaction_id;
    private String transaction_type;
    private float transaction_amount;
    private int transaction_account_id;
    private String transaction_status;

    //Account info
    private int account_id;
    private String acc_type;
    private String account_status;
    private float account_bal;

    public Transaction() {
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUser_psw() {
        return user_psw;
    }

    public void setUser_psw(String user_psw) {
        this.user_psw = user_psw;
    }

    public int getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(int transaction_id) {
        this.transaction_id = transaction_id;
    }

    public String getTransaction_type() {
        return transaction_type;
    }

    public void setTransaction_type(String transaction_type) {
        this.transaction_type = transaction_type;
    }

    public float getTransaction_amount() {
        return transaction_amount;
    }

    public void setTransaction_amount(float transaction_amount) {
        this.transaction_amount = transaction_amount;
    }

    public int getTransaction_account_id() {
        return transaction_account_id;
    }

    public void setTransaction_account_id(int transaction_account_id) {
        this.transaction_account_id = transaction_account_id;
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public String getAcc_type() {
        return acc_type;
    }

    public void setAcc_type(String acc_type) {
        this.acc_type = acc_type;
    }

    public String getAccount_status() {
        return account_status;
    }

    public void setAccount_status(String account_status) {
        this.account_status = account_status;
    }

    public float getAccount_bal() {
        return account_bal;
    }

    public void setAccount_bal(float account_bal) {
        this.account_bal = account_bal;
    }

    public String getTransaction_status() {
        return transaction_status;
    }

    public void setTransaction_status(String transaction_status) {
        this.transaction_status = transaction_status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transaction)) return false;
        Transaction that = (Transaction) o;
        return getTransaction_id() == that.getTransaction_id() && Float.compare(that.getTransaction_amount(), getTransaction_amount()) == 0 && getTransaction_account_id() == that.getTransaction_account_id() && getAccount_id() == that.getAccount_id() && Float.compare(that.getAccount_bal(), getAccount_bal()) == 0 && Objects.equals(getUserFirstName(), that.getUserFirstName()) && Objects.equals(getUserLastName(), that.getUserLastName()) && Objects.equals(getUserEmail(), that.getUserEmail()) && Objects.equals(getUser_psw(), that.getUser_psw()) && Objects.equals(getTransaction_type(), that.getTransaction_type()) && Objects.equals(getTransaction_status(), that.getTransaction_status()) && Objects.equals(getAcc_type(), that.getAcc_type()) && Objects.equals(getAccount_status(), that.getAccount_status());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserFirstName(), getUserLastName(), getUserEmail(), getUser_psw(), getTransaction_id(), getTransaction_type(), getTransaction_amount(), getTransaction_account_id(), getTransaction_status(), getAccount_id(), getAcc_type(), getAccount_status(), getAccount_bal());
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "userFirstName='" + userFirstName + '\'' +
                ", userLastName='" + userLastName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", user_psw='" + user_psw + '\'' +
                ", transaction_id=" + transaction_id +
                ", transaction_type='" + transaction_type + '\'' +
                ", transaction_amount=" + transaction_amount +
                ", transaction_status='" + transaction_status + '\'' +
                ", account_id=" + account_id +
                ", acc_type='" + acc_type + '\'' +
                ", account_status='" + account_status + '\'' +
                ", account_bal=" + account_bal +
                '}';
    }
}
