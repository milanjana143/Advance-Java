🗄️ DATABASE COMMANDS :-

// Show All Databases-
SHOW DATABASES;

// Create New Database-
CREATE DATABASE college;

// Use (Select) Database-
USE college;

// Delete Database-
DROP DATABASE college;



📊 TABLE COMMANDS :-

(First select database using USE db_name)

// Show All Tables-
Use college;
SHOW TABLES;

// Create Table-
CREATE TABLE student (
    id INT PRIMARY KEY,
    name VARCHAR(50) );

// Insert Values into Table-
INSERT INTO student (id, name) VALUES (1, 'Rahul'), (2, 'Amit');

// Show Table Data-
SELECT * FROM student;

// Delete Table-
DROP TABLE student;