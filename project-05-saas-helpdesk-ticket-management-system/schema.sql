CREATE TABLE tickets (

id INT PRIMARY KEY AUTO_INCREMENT,

title VARCHAR(255),

description TEXT,

priority VARCHAR(50),

status VARCHAR(50),

assigned_agent VARCHAR(100)

);

CREATE TABLE agents (

id INT PRIMARY KEY AUTO_INCREMENT,

name VARCHAR(100)

);
