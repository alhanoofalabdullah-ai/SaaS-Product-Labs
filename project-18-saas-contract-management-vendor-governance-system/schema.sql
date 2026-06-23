CREATE TABLE vendors (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(200)
);

CREATE TABLE contracts (
    id INT PRIMARY KEY AUTO_INCREMENT,
    contract_name VARCHAR(255),
    vendor_name VARCHAR(200),
    contract_value DECIMAL(18,2)
);

CREATE TABLE compliance_records (
    id INT PRIMARY KEY AUTO_INCREMENT,
    contract_name VARCHAR(255),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE contract_risks (
    id INT PRIMARY KEY AUTO_INCREMENT,
    contract_name VARCHAR(255),
    risk_level VARCHAR(50)
);
