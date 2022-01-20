--INSERT DATA TO USERS
INSERT INTO Users (users_first_name, users_last_name, users_email,
	users_gender, users_str, users_zip, users_city,
	users_state, users_phone_no) VALUES
('Margret', 'Walwood', 'mwalwood0@1688.com', 'F', '57 Troy Center', 90035, 'Los Angeles', 'CA', '323-974-0768'),
('Marven', 'MacNally', 'mmacnally1@imdb.com', 'M', '0 Debra Parkway', 79934, 'El Paso', 'TX', '915-421-3712'),
('Skylar', 'Smiz', 'ssmiz2@liveinternet.ru', 'M', '9 7th Street', 85015, 'Phoenix', 'AZ', '602-598-9180'),
('Lilli', 'Pinching', 'lpinching3@walmart.com', 'F', '362 Glacier Hill Hill', 95219, 'Stockton', 'CA', '209-166-1734'),
('Sandro', 'Vasilevich', 'svasilevich4@imgur.com', 'M', '06256 Caliangt Place', 61605, 'Peoria', 'IL', '309-326-2879'),
('Nara', 'Sickamore', 'nsickamore5@washingtonpost.com', 'F', '8540 Moland Point', 46867, 'Fort Wayne', 'IN', '260-992-0778'),
('Austin', 'Deeble', 'adeeble6@abc.net.au', 'F', '187 Harper Way', 70142, 'New Orleans', 'LA', '504-976-0595'),
('Myrta', 'Pitkeathley', 'mpitkeathley7@sfgate.com', 'F', '17 Ryan Circle', 80920, 'Colorado Springs', 'CO', '719-968-2975'),
('Marita', 'Terrazzo', 'mterrazzo8@paginegialle.it', 'F', '57877 Mockingbird Lane', 93094, 'Simi Valley', 'CA', '805-224-4200'),
('Hedy', 'Di Lucia', 'hdilucia9@lycos.com', 'F', '4584 Mallory Center', 90505, 'Torrance', 'CA', '310-672-3246'),
('Nana', 'Morais', 'nmoraisa@etsy.com', 'F', '3 Fairfield Circle', 78732, 'Austin', 'TX', '512-361-4084'),
('Isa', 'Coppeard', 'icoppeardb@w3.org', 'F', '768 Golf View Crossing', 32244, 'Jacksonville', 'FL', '904-926-5197'),
('Danya', 'Chat', 'dchatc@blog.com', 'F', '28280 Logan Crossing', 2203, 'Boston', 'MA', '617-733-1577'),
('Chane', 'McMeekan', 'cmcmeekand@tamu.edu', 'M', '0 Amoth Junction', 20910, 'Silver Spring', 'MD', '301-407-0387'),
('Homere', 'Ellwand', 'hellwande@accuweather.com', 'M', '41 Riverside Trail', 73114, 'Oklahoma City', 'OK', '405-438-0484'),
('Lorant', 'Reolfi', 'lreolfif@sciencedaily.com', 'M', '275 Dahle Street', 14233, 'Buffalo', 'NY', '716-363-1617'),
('Gery', 'Elloit', 'gelloitg@artisteer.com', 'M', '3203 Hauk Way', 31914, 'Columbus', 'GA', '706-582-3067'),
('Harbert', 'Baelde', 'hbaeldeh@tinypic.com', 'M', '421 Golf Course Road', 40524, 'Lexington', 'KY', '859-497-2427'),
('Bogart', 'Kennagh', 'bkennaghi@xing.com', 'M', '3 Jenna Parkway', 75260, 'Dallas', 'TX', '214-551-7180'),
('Raimundo', 'Oram', 'roramj@homestead.com', 'M', '06 Grover Street', 97286, 'Portland', 'OR', '503-844-1785');

SELECT * FROM users;


INSERT INTO employees(emp_id, emp_email, emp_job_title) VALUES
(20001, 'mpitkeathley7@sfgate.com', 'Internal Auditor'),
(20002, 'mterrazzo8@paginegialle.it', 'Editor'),
(20003, 'hdilucia9@lycos.com', 'Marketing Manager'),
(20004, 'nmoraisa@etsy.com', 'Marketing Manager'),
(10001, 'roramj@homestead.com', 'Senior Editor');

SELECT * FROM employees;

INSERT INTO customer(cust_email) VALUES
('mwalwood0@1688.com'),
('mmacnally1@imdb.com'),
('ssmiz2@liveinternet.ru'),
('lpinching3@walmart.com'),
('svasilevich4@imgur.com'),
('nsickamore5@washingtonpost.com'),
('adeeble6@abc.net.au'),
('mterrazzo8@paginegialle.it'),
('nmoraisa@etsy.com'),
('icoppeardb@w3.org'),
('dchatc@blog.com'),
('cmcmeekand@tamu.edu'),
('hellwande@accuweather.com'),
('lreolfif@sciencedaily.com'),
('gelloitg@artisteer.com'),
('hbaeldeh@tinypic.com'),
('bkennaghi@xing.com');

SELECT * FROM customer;
SELECT * FROM users INNER JOIN customer ON users.users_email = customer.cust_email;
SELECT * FROM users RIGHT JOIN employees ON users.users_email = employees.emp_email;

TRUNCATE TABLE  account_info;
INSERT INTO account_info(	account_id,	acc_type, account_status, account_bal, account_cust_id ) VALUES
(428778104, 'Current', 'Inactive', 97.01, 1),
(396031385, 'Current', 'Inactive', 947.81, 19),
(925226824, 'Savings', 'Inactive', 742.09, 2),
(98974978, 'Current', 'Active', 345.89, 3),
(980616010, 'Savings', 'Suspended', 384.8, 4),
(24237256, 'Current', 'Suspended', 438.5, 5),
(398168326, 'Savings', 'Active', 499.29, 6),
(766555725, 'Current', 'Suspended', 551.57, 7),
(247937134, 'Current', 'Inactive', 849.69, 12),
(447330130, 'Current', 'Suspended', 999.63, 13),
(5947577, 'Savings', 'Inactive', 560.26, 14),
(722693641, 'Savings', 'Suspended', 344.54, 15),
(909526306, 'Savings', 'Inactive', 543.73, 16),
(699644340, 'Savings', 'Suspended', 614.39, 17),
(386754026, 'Savings', 'Inactive', 392.82, 18),
(771343817, 'Savings', 'Active', 433.3, 19);

SELECT * FROM account_info;

--INSERT DATA

UPDATE users SET users_dob='2/5/1977' WHERE users_id=1;
UPDATE users SET users_dob='2/16/1974' WHERE users_id=2;
UPDATE users SET users_dob='4/4/1968' WHERE users_id=3;
UPDATE users SET users_dob='11/30/2002' WHERE users_id=4;
UPDATE users SET users_dob='7/12/1972' WHERE users_id=5;
UPDATE users SET users_dob='10/17/1999' WHERE users_id=6;
UPDATE users SET users_dob='11/21/1976' WHERE users_id=7;
UPDATE users SET users_dob='10/18/1989' WHERE users_id=8;
UPDATE users SET users_dob='9/8/1983' WHERE users_id=9;
UPDATE users SET users_dob='5/20/1998' WHERE users_id=10;
UPDATE users SET users_dob='11/11/1957' WHERE users_id=11;
UPDATE users SET users_dob='5/19/1959' WHERE users_id=12;
UPDATE users SET users_dob='3/20/1964' WHERE users_id=13;
UPDATE users SET users_dob='1/29/1985' WHERE users_id=14;
UPDATE users SET users_dob='4/13/1984' WHERE users_id=15;
UPDATE users SET users_dob='5/15/1950' WHERE users_id=16;
UPDATE users SET users_dob='4/20/1976' WHERE users_id=17;
UPDATE users SET users_dob='2/1/1960' WHERE users_id=18;
UPDATE users SET users_dob='10/15/1959' WHERE users_id=19;
UPDATE users SET users_dob='2/15/1997' WHERE users_id=20;

