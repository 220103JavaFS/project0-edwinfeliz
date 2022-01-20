-- CREATE TABLE USERS
DROP TABLE IF EXISTS Users; 
CREATE TABLE Users (
	users_id SERIAL,
	users_first_name VARCHAR (30),
	users_last_name VARCHAR (30),
	users_email VARCHAR (60) PRIMARY KEY NOT NULL,
	users_gender VARCHAR (2));
    users_dob DATE,
    users_str VARCHAR (30),
    users_zip VARCHAR(10), 
	users_city VARCHAR (30),
	users_state VARCHAR(2),
	users_phone_no VARCHAR(12),
	user_type INTEGER);

SELECT users_email, users_first_name, psw, user_type FROM users WHERE users_email = 'dchatc@blog.com' AND psw = crypt('password3', psw);

--ALTER TABLE USERS TO ADD COLUMN TO STORED PASSWORDS	  
ALTER TABLE users ADD COLUMN psw VARCHAR(10);

--ALTER TABLE USERS TO ALLOW MORE CHARACTERS IN COLUMN PSW	  
ALTER TABLE users
ALTER COLUMN psw TYPE VARCHAR(150);

--CREATE EXTENSION TO ENCRYPT PASSWORDS IN COLUMN PSW	  
CREATE EXTENSION pgcrypto;

--CREATE 3 DIFFERENTS PASSWORDS FOR 3 DIFFERENTS USERS TO TEST THE APP 	  
UPDATE users 
SET psw = crypt('password3', gen_salt('bf')) 
WHERE user_type =3;

UPDATE users 
SET psw = crypt('password2', gen_salt('bf')) 
WHERE user_type =2;

UPDATE users 
SET psw = crypt('password1', gen_salt('bf')) 
WHERE user_type =1;


SELECT * FROM users;

-- CREATE TABLE EMPLOYEES TO KNOW WHO ARE THE EMPLOYEES
DROP TABLE IF EXISTS employees; 
CREATE TABLE employees(
       emp_id INTEGER PRIMARY KEY NOT NULL,
	   emp_email VARCHAR (60) NOT NULL REFERENCES Users(users_email),
	   emp_job_title VARCHAR (60) NOT NULL);

	  
 --CREATE TABLE CUSTOMERS TO KNOW WHO ARE THE CUSTOMERS	  
DROP TABLE IF EXISTS customer; 
CREATE TABLE customer(
       cust_id SERIAL NOT NULL PRIMARY KEY,
	   cust_email VARCHAR (60) NOT NULL REFERENCES Users(users_email));

 --CREATE TABLE ACCOUNTS TO STORE THE BANKS ACCOUNTS FOR CUSTOMERS  
DROP TABLE IF EXISTS account_info; 
CREATE TABLE account_info(
	account_id INTEGER PRIMARY KEY,
	acc_type VARCHAR (8)  NOT NULL,
	account_status VARCHAR (8)  NOT NULL,
	account_bal NUMERIC(8,2) DEFAULT (0),
	account_cust_id INTEGER NOT NULL REFERENCES customer(cust_id));

 --CREATE TABLE TRANSANCTIONS TO STORE ALL TRANSANCTIONS
DROP TABLE IF EXISTS transaction_info; 
CREATE TABLE transaction_info (
	transaction_id SERIAL PRIMARY KEY,
	transaction_type VARCHAR(6),
	transaction_amount NUMERIC(8,2),
	transaction_account_id INTEGER NOT NULL REFERENCES account_info(account_id));

