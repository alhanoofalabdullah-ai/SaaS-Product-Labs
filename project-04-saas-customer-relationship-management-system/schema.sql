CREATE TABLE customers (

id INT PRIMARY KEY AUTO_INCREMENT,

company_name VARCHAR(200),

status VARCHAR(50)

);

CREATE TABLE leads (

id INT PRIMARY KEY AUTO_INCREMENT,

company_name VARCHAR(200),

lead_source VARCHAR(100)

);

CREATE TABLE opportunities (

id INT PRIMARY KEY AUTO_INCREMENT,

customer_name VARCHAR(200),

deal_value DECIMAL(15,2)

);
