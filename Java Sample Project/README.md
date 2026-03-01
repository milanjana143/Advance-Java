1. After importing java project always check that the mysql connector jar works or not, if not then your downloaded jar file need to replace with imported jar in modulepath or classpath from configure build path.

2. Then you have to make sure that you have local db with same name as use in program. Otherwise create a db using same name from mysql command line client. Also check that table creation command is availabe or not in program, otherwise create a table in db using same table attribute names.


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
    name VARCHAR(50)
);

// Insert Values into Table-
INSERT INTO student (id, name) VALUES (1, 'Rahul'), (2, 'Amit');

// Show Table Data-
SELECT * FROM student;

// Delete Table-
DROP TABLE student;