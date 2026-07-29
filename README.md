# ✈️ Travel Booking System

A full-stack **Travel Booking System** built using **Java, JSP, Servlets, Hibernate, JDBC, MySQL, HTML, CSS, and JavaScript**. This project allows users to search, book, and manage travel services such as flights, trains, hotels, and cabs through a simple and user-friendly interface.

> 🚧 **Project Status:** Under Development

---

## 📌 Features

### 👤 User Module
- User Registration
- User Login & Logout
- Secure Session Management
- Profile Management

### ✈️ Flight Booking
- Search Flights
- View Flight Details
- Book Flight
- Cancel Booking

### 🚆 Train Booking
- Search Trains
- Train Reservation
- Booking History

### 🚖 Cab Booking
- Search Available Cabs
- Book Cab
- Ride History

### 🏨 Hotel Booking
- Search Hotels
- Room Booking
- Booking Management

### 📅 Booking Management
- View My Bookings
- Cancel Bookings
- Booking History

### 👨‍💼 Admin Module
- Dashboard
- Manage Users
- Manage Flights
- Manage Trains
- Manage Hotels
- Manage Cabs
- Manage Bookings

---

# 🛠️ Tech Stack

### Backend
- Java 17
- JDBC
- Hibernate ORM
- Jakarta Servlet
- JSP

### Frontend
- HTML5
- CSS3
- JavaScript

### Database
- MySQL

### Build Tool
- Maven

### Server
- Apache Tomcat 11

### IDE
- Spring Tool Suite (STS)

---

# 📂 Project Structure

```
travel-booking-system
│
├── src/main/java
│   ├── controller
│   ├── dao
│   ├── service
│   ├── model
│   ├── util
│   ├── filter
│   └── exception
│
├── src/main/resources
│
├── src/main/webapp
│   ├── auth
│   ├── css
│   ├── images
│   ├── js
│   └── WEB-INF
│
├── pom.xml
└── README.md
```

---

# 🏗️ Project Architecture

```
Browser
    │
    ▼
JSP (View)
    │
    ▼
Servlet (Controller)
    │
    ▼
Service Layer
    │
    ▼
DAO Layer
    │
    ▼
Hibernate ORM
    │
    ▼
MySQL Database
```

---

# 📋 Database

Database Name

```
travel_booking
```

---

# 🚀 Getting Started

### Clone Repository

```bash
git clone https://github.com/soniya1610/travel-booking-system.git
```

### Open Project

Import as **Existing Maven Project** in STS or Eclipse.

### Configure Database

Update your MySQL credentials in:

```
HbUtil.java
```

```java
Environment.URL
Environment.USER
Environment.PASS
```

### Build Project

```
Maven
→ Update Project
```

### Run

Deploy on **Apache Tomcat 11** and open:

```
http://localhost:8080/travel-booking-system
```

---

# 📈 Development Progress

- [x] Maven Project Setup
- [x] Hibernate Configuration
- [x] MySQL Integration
- [x] User Entity
- [x] User DAO
- [x] User Service
- [ ] User Registration
- [ ] Login System
- [ ] Session Management
- [ ] Flight Module
- [ ] Train Module
- [ ] Cab Module
- [ ] Hotel Module
- [ ] Booking Module
- [ ] Admin Dashboard
- [ ] Responsive UI

---

# 🎯 Learning Objectives

This project is being developed to gain hands-on experience with:

- Java Web Development
- JDBC
- Hibernate ORM
- JSP & Servlets
- MVC Architecture
- Session Management
- Authentication & Authorization
- CRUD Operations
- Maven
- MySQL
- Git & GitHub

---

# 📸 Screenshots

> Screenshots will be added as the project progresses.

---

# 🤝 Contributing

Contributions, suggestions, and improvements are welcome!

Feel free to fork this repository and submit a pull request.

---

# 👩‍💻 Author

**Soniya Meena**

- GitHub: https://github.com/soniya1610
- LinkedIn: www.linkedin.com/in/soniya-meena1610

---

⭐ If you like this project, don't forget to **Star** the repository.