
# 💳 Bank Management System (Java Servlets)

A full-stack **Bank Management System** developed using **Java Servlets**, **JDBC**, and **MySQL**.  
This project provides core banking functionalities like account creation, deposit, withdrawal, and fund transfer — all through a web-based interface.

---

## 🚀 Project Overview
The **Bank Management System** is designed to automate basic banking operations for users.  
It allows customers to manage their accounts efficiently with secure and user-friendly web interactions.

---

## ✨ Features
🔹 **User Registration & Login** — Secure authentication using Servlets  
🔹 **Account Management** — Create and manage customer accounts  

---

## 🧰 Technologies Used
| Layer | Technologies |
|:------|:--------------|
| **Frontend** | HTML, CSS, JSP |
| **Backend** | Java Servlets |
| **Database** | MySQL |
| **Server** | Apache Tomcat |
| **Build Tool** | Maven / Manual WAR Deployment |

---
## 📁 Project Structure
BankManagementSystem/
│
├── src/
│ └── main/
│ ├── java/
│ │ └── com/
│ │ └── bank/
│ │ ├── controller/
│ │ │ ├── LoginServlet.java
│ │ │ └── RegisterServlet.java
│ │ │
│ │ ├── dao/
│ │ │ ├── AdminDAO.java
│ │ │ └── AdminDAOImpl.java
│ │ │
│ │ ├── dto/
│ │ │ └── AdminDetails.java
│ │ │
│ │ └── util/
│ │ └── DBConnection.java
│ │
│ └── webapp/
│ ├── accountcreation.jsp
│ ├── index.jsp
│ ├── dashboard.jsp
│ ├── login.jsp
│ │
│ └── WEB-INF/
│ └── web.xml
│
├── sql/
│ └── bank_schema.sql
│
├── config/
│ └── db.properties
│
├── pom.xml
├── README.md
└── .gitignore
----

🧩 Core Components

🧠 DTO Layer (Data Transfer Objects)
➡️ AdminDetails.java — Holds admin information such as name, email, branch, and password.

💾 DAO Layer (Database Access)
➡️ AdminDAO.java — Interface defining DB operations.
➡️ AdminDAOImpl.java — Implements actual DB logic using JDBC.

🎮 Controller Layer (Servlets)
➡️ LoginServlet.java — Handles admin login and session management.
➡️ RegisterServlet.java — Handles new admin registration.

🌐 JSP Pages (Frontend)
➡️ index.jsp — Entry page / home.
➡️ login.jsp — Admin login interface.
➡️ accountcreation.jsp — Create new bank accounts.
➡️ dashboard.jsp — Displays account info and operations.
