CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(150)
);

CREATE TABLE courses (
    id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(200)
);

CREATE TABLE enrollments (
    id INT PRIMARY KEY AUTO_INCREMENT,
    student_name VARCHAR(150),
    course_title VARCHAR(200),
    completed BOOLEAN
);

CREATE TABLE certificates (
    id INT PRIMARY KEY AUTO_INCREMENT,
    student_name VARCHAR(150),
    course_title VARCHAR(200)
);
