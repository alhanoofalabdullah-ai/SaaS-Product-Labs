CREATE TABLE users (

id INT PRIMARY KEY AUTO_INCREMENT,

name VARCHAR(100),

email VARCHAR(100)

);

CREATE TABLE subscriptions (

id INT PRIMARY KEY AUTO_INCREMENT,

customer_name VARCHAR(100),

plan_name VARCHAR(50),

monthly_fee DECIMAL(10,2)

);
