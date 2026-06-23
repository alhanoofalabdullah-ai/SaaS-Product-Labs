CREATE TABLE customers (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(150)
);

CREATE TABLE surveys (
    id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(255)
);

CREATE TABLE responses (
    id INT PRIMARY KEY AUTO_INCREMENT,
    customer_name VARCHAR(150),
    survey_title VARCHAR(255),
    rating INT
);
