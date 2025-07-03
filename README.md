# 🚀 Full Stack CRUD Application

A complete Full Stack **CRUD (Create, Read, Update, Delete)** application built using:

- 🌐 **Frontend**: React JS
- ☕ **Backend**: Spring Boot with Java
- 🛢️ **Database**: MySQL
- 🔍 **API Testing**: Postman

---

## 🛠️ Technologies Used

| Layer     | Technology         |
|-----------|--------------------|
| Frontend  | React JS, Bootstrap, Axios |
| Backend   | Spring Boot, Java, REST API |
| Database  | MySQL              |
| API Tool  | Postman            |

---

## 📸 Features

- ✅ Add New Users
- ✅ View All Users
- ✅ Edit User Details
- ✅ Delete Users
- ✅ RESTful API Integration
- ✅ Postman Collection for Testing APIs
- ✅ Clean UI with Bootstrap

---

## 🔗 Endpoints (Spring Boot)

| Method | Endpoint         | Description        |
|--------|------------------|--------------------|
| GET    | `/users`         | Get all users      |
| POST   | `/users`         | Add new user       |
| GET    | `/users/{id}`    | Get user by ID     |
| PUT    | `/users/{id}`    | Update user        |
| DELETE | `/users/{id}`    | Delete user        |

---

## 📷 Screenshots

> Home Page, Add/Edit Form, Postman Examples, etc.

---

## 🧪 Testing with Postman

- Use the included `postman_collection.json` to test all API routes.
- Make sure your Spring Boot app is running on `localhost:8080`.

---

## 💾 MySQL Setup

```sql
CREATE DATABASE user_crud;
Update application.properties in Spring Boot:

properties
Copy
Edit
spring.datasource.url=jdbc:mysql://localhost:3306/user_crud
spring.datasource.username=root
spring.datasource.password=yourpassword
📂 Project Structure
swift
Copy
Edit
backend/
├── src/
│   └── main/java/com/app/controller/
│   └── main/java/com/app/model/
│   └── main/java/com/app/repository/
│   └── main/java/com/app/service/
│   └── application.properties

frontend/
├── src/
│   └── components/
│   └── App.js
│   └── index.js
📦 How to Run
Backend (Spring Boot):
bash
Copy
Edit
cd backend
./mvnw spring-boot:run
Frontend (React JS):
bash
Copy
Edit
cd frontend
npm install
npm start
👨‍💻 Author
[Surendhiran]

Email: sweetsurendhiran8@gmail.com

GitHub: github.com/surendhiranlearner

