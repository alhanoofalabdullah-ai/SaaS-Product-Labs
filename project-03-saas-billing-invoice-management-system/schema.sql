CREATE TABLE customers (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(150),
    email VARCHAR(150)
);

CREATE TABLE plans (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    monthly_price DECIMAL(10,2)
);

CREATE TABLE invoices (
    id INT PRIMARY KEY AUTO_INCREMENT,
    customer_name VARCHAR(150),
    plan_name VARCHAR(100),
    subtotal DECIMAL(10,2),
    vat DECIMAL(10,2),
    total DECIMAL(10,2),
    status VARCHAR(30)
);
