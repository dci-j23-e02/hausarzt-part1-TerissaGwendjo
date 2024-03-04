###  Assignment: Implementing a General Practitioner (Hausarzt) Management System - Part1

#### Overview

In this assignment, you will design and implement a simplified database system for managing general practitioners (Hausärzte) and their patients. This exercise aims to give you hands-on experience with database design, Java JDBC connectivity, and executing SQL queries. This is purely an educational exercise, and there is no evaluation or grading. Follow the guidelines and step-by-step explanations, but keep the implementation to yourself to maximize learning.

#### Required Tasks

1. **Design the Database Schema**
   - **Required Tables:**
     - `general_practitioners`: Stores information about doctors.
     - `patients`: Holds information about patients and links to their general practitioners.

2. **Implement Java Classes**
   - **Required Java Classes:**
     - `GeneralPractitioner.java` and `Patient.java`: Model classes representing a doctor and a patient, respectively.
     - `ConnectionFactory.java`: Manages the database connection.
     - `GeneralPractitionerDao.java` and `PatientDao.java`: Interfaces defining operations for the respective models.
     - `GeneralPractitionerDaoImpl.java` and `PatientDaoImpl.java`: Implementations of the DAO interfaces.

3. **Write Required SQL Queries**
   - **Queries to Implement:**
     - Inserting, updating, and deleting records in both tables.
     - Query to find all patients of a specific general practitioner.

4. **Demonstration Main Class**
   - Implement a main class that demonstrates the functionality of your DAO implementations.

#### Guide to Each Task

1. **Design the Database Schema**
   - Define primary keys for both tables.
   - Establish a foreign key relationship from `patients` to `general_practitioners`.
   - Consider the data types for each field (e.g., `VARCHAR` for names, `INTEGER` for IDs).

2. **Implement Java Classes**
   - Model classes should have fields, constructors, getters, and setters.
   - `ConnectionFactory.java` should use JDBC to connect to your PostgreSQL database.
   - DAO interfaces define methods for CRUD operations and any additional queries you need.
   - DAO implementations execute the SQL queries and map results to Java objects.

3. **Write Required SQL Queries**
   - Practice writing INSERT, UPDATE, and DELETE SQL commands.
   - Use JOIN operations to retrieve related data across tables.

4. **Demonstration Main Class**
   - Implement a simple demonstration of CRUD operations and queries.
   - Show how to use your DAO implementations to interact with the database.

#### Implementation Notes

- Ensure your database is accessible and the JDBC connection URL, username, and password in `ConnectionFactory.java` are correctly configured.
- Test each SQL query independently to ensure correctness before integrating it into your Java application.
- This assignment provides a comprehensive practice opportunity, from database schema design to Java application development and SQL query execution. Take your time to understand each component and how they interact within the application. Happy coding!
