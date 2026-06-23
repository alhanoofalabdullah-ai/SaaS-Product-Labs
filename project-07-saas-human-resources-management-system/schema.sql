CREATE TABLE employees (

id INT PRIMARY KEY AUTO_INCREMENT,

name VARCHAR(100),

department VARCHAR(100),

salary DECIMAL(12,2)

);

CREATE TABLE leave_requests (

id INT PRIMARY KEY AUTO_INCREMENT,

employee_name VARCHAR(100),

days_requested INT,

status VARCHAR(50)

);

CREATE TABLE payroll (

id INT PRIMARY KEY AUTO_INCREMENT,

employee_name VARCHAR(100),

salary DECIMAL(12,2)

);
