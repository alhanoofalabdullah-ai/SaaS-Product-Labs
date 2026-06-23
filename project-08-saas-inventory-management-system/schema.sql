CREATE TABLE products (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(150),
    category VARCHAR(100),
    quantity INT,
    unit_price DECIMAL(12,2)
);

CREATE TABLE suppliers (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(150),
    contact_email VARCHAR(150)
);

CREATE TABLE stock_transactions (
    id INT PRIMARY KEY AUTO_INCREMENT,
    product_id INT,
    transaction_type VARCHAR(50),
    quantity INT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
