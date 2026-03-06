# Student Management System – Spring Boot REST API

A **backend REST API application** built using **Java, Spring Boot, Spring Data JPA, and MySQL** to manage student records.
This project demonstrates **industry-standard layered architecture (Controller → Service → Repository)** and implements CRUD operations for managing student data.

---

## 🚀 Features

* Create Student
* Get All Students
* Get Student by ID
* Update Student Details
* Delete Student
* RESTful API design
* MySQL database integration
* Clean layered architecture
* API testing using Postman

---

## 🛠 Tech Stack

**Backend**

* Java
* Spring Boot
* Spring Data JPA
* Hibernate

**Database**

* MySQL

**Tools**

* Maven
* IntelliJ IDEA
* Postman
* Git & GitHub

---

## 📂 Project Structure

```
student-management
│
├── src/main/java/com/example/student_management
│
├── controller
│      StudentController.java
│
├── service
│      StudentService.java
│      StudentServiceImpl.java
│
├── repository
│      StudentRepository.java
│
├── entity
│      Student.java
│
├── dto
│      StudentDTO.java
│
├── exception
│      GlobalExceptionHandler.java
│
└── StudentManagementApplication.java
│
├── src/main/resources
│      application.properties
│
└── pom.xml
```

---

## 📡 API Endpoints

### Create Student

POST `/api/students`

Request Body:

```json
{
  "name": "Ramakrishnan",
  "email": "ram@gmail.com",
  "course": "Java"
}
```

---

### Get All Students

GET `/api/students`

---

### Get Student by ID

GET `/api/students/{id}`

---

### Update Student

PUT `/api/students/{id}`

---

### Delete Student

DELETE `/api/students/{id}`

---

## 🗄 Database Configuration

Create a MySQL database:

```sql
CREATE DATABASE studentdb;
```

Update `application.properties`:

```
spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
server.port=8080
```

---

## ▶ How to Run the Project

1. Clone the repository

```
git clone https://github.com/yourusername/student-management-system.git
```

2. Open the project in **IntelliJ IDEA**

3. Configure the database in `application.properties`

4. Run the application

```
StudentManagementApplication.java
```

5. Test APIs using **Postman**

---

## 📊 Example Response

```
[
  {
    "id": 1,
    "name": "Ramakrishnan",
    "email": "ram@gmail.com",
    "course": "Java"
  }
]
```

---

## 📚 What I Learned

* REST API development using Spring Boot
* Database integration using Spring Data JPA
* Layered backend architecture
* CRUD operations with MySQL
* API testing using Postman
* Git version control and GitHub project management

---

## 👨‍💻 Author

**Ramakrishnan**

* Java Backend Developer (Aspiring)
* Passionate about building scalable backend systems
