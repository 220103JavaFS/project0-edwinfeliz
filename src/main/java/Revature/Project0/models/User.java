package Revature.Project0.models;

import java.util.Objects;

public class User {
    private int userId;
    private String userFirstName;
    private String userLastName;
    private String userEmail;
    private String userGender;
    private String userDOB;
    private String userStr;
    private int userZip;
    private String userCity;
    private String userState;
    private String userPhone;
    private Integer userType;
    private String user_psw;

    //Account info
    private int account_id;
    private String acc_type;
    private String account_status;
    private float account_bal;
    private int account_cust_id;

    public User() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public String getUserDOB() {
        return userDOB;
    }

    public void setUserDOB(String userDOB) {
        this.userDOB = userDOB;
    }

    public String getUserStr() {
        return userStr;
    }

    public void setUserStr(String userStr) {
        this.userStr = userStr;
    }

    public int getUserZip() {
        return userZip;
    }

    public void setUserZip(int userZip) {
        this.userZip = userZip;
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }

    public String getUserState() {
        return userState;
    }

    public void setUserState(String userState) {
        this.userState = userState;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getUser_psw() {
        return user_psw;
    }

    public void setUser_psw(String user_psw) {
        this.user_psw = user_psw;
    }

    /**/
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

    public int getAccount_cust_id() {
        return account_cust_id;
    }

    public void setAccount_cust_id(int account_cust_id) {
        this.account_cust_id = account_cust_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getUserId() == user.getUserId() && getUserZip() == user.getUserZip() && getAccount_id() == user.getAccount_id() && Float.compare(user.getAccount_bal(), getAccount_bal()) == 0 && getAccount_cust_id() == user.getAccount_cust_id() && Objects.equals(getUserFirstName(), user.getUserFirstName()) && Objects.equals(getUserLastName(), user.getUserLastName()) && Objects.equals(getUserEmail(), user.getUserEmail()) && Objects.equals(getUserGender(), user.getUserGender()) && Objects.equals(getUserDOB(), user.getUserDOB()) && Objects.equals(getUserStr(), user.getUserStr()) && Objects.equals(getUserCity(), user.getUserCity()) && Objects.equals(getUserState(), user.getUserState()) && Objects.equals(getUserPhone(), user.getUserPhone()) && Objects.equals(getUserType(), user.getUserType()) && Objects.equals(getUser_psw(), user.getUser_psw()) && Objects.equals(getAcc_type(), user.getAcc_type()) && Objects.equals(getAccount_status(), user.getAccount_status());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserId(), getUserFirstName(), getUserLastName(), getUserEmail(), getUserGender(), getUserDOB(), getUserStr(), getUserZip(), getUserCity(), getUserState(), getUserPhone(), getUserType(), getUser_psw(), getAccount_id(), getAcc_type(), getAccount_status(), getAccount_bal(), getAccount_cust_id());
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userFirstName='" + userFirstName + '\'' +
                ", userLastName='" + userLastName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userGender='" + userGender + '\'' +
                ", userDOB='" + userDOB + '\'' +
                ", userStr='" + userStr + '\'' +
                ", userZip=" + userZip +
                ", userCity='" + userCity + '\'' +
                ", userState='" + userState + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userType=" + userType +
                ", user_psw='" + user_psw + '\'' +
                ", account_id=" + account_id +
                ", acc_type='" + acc_type + '\'' +
                ", account_status='" + account_status + '\'' +
                ", account_bal=" + account_bal +
                ", account_cust_id=" + account_cust_id +
                '}';
    }
}

