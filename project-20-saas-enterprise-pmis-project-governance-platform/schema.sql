CREATE TABLE projects (
    id INT PRIMARY KEY AUTO_INCREMENT,
    project_name VARCHAR(255)
);

CREATE TABLE project_documents (
    id INT PRIMARY KEY AUTO_INCREMENT,
    document_title VARCHAR(255)
);

CREATE TABLE workflows (
    id INT PRIMARY KEY AUTO_INCREMENT,
    workflow_name VARCHAR(255)
);

CREATE TABLE risks (
    id INT PRIMARY KEY AUTO_INCREMENT,
    description VARCHAR(255),
    severity VARCHAR(50)
);
