CREATE TABLE suppliers (

id INT PRIMARY KEY AUTO_INCREMENT,

name VARCHAR(150),

email VARCHAR(150)

);

CREATE TABLE purchase_requests (

id INT PRIMARY KEY AUTO_INCREMENT,

department VARCHAR(100),

item VARCHAR(200),

amount DECIMAL(15,2),

status VARCHAR(50)

);

CREATE TABLE purchase_orders (

id INT PRIMARY KEY AUTO_INCREMENT,

supplier VARCHAR(150),

amount DECIMAL(15,2)

);
