CREATE TABLE users(id INT PRIMARY KEY AUTO_INCREMENT,NAME VARCHAR(30) NOT NULL,
email_id VARCHAR(30) NOT NULL,password varchar(60) not null,is_active int not null default 1);