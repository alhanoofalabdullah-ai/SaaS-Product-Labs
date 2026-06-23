CREATE TABLE budgets (
    id INT PRIMARY KEY AUTO_INCREMENT,
    department VARCHAR(150),
    allocated_amount DECIMAL(15,2)
);

CREATE TABLE expenses (
    id INT PRIMARY KEY AUTO_INCREMENT,
    department VARCHAR(150),
    description VARCHAR(255),
    amount DECIMAL(15,2)
);

CREATE TABLE financial_reports (
    id INT PRIMARY KEY AUTO_INCREMENT,
    report_type VARCHAR(100),
    generated_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
