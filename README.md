🌐 Spring Boot OAuth2 Google Authentication

📖 About This Project

This project is a Spring Boot OAuth2 Authentication System that allows users to log in using their Google account. It features:

✅ Google OAuth2 Authentication (via Spring Security)✅ Custom Login Page using Thymeleaf✅ User Profile Page displaying authenticated user details✅ Secure Session Management✅ Spring Boot & Thymeleaf-based UI

🛠️ Tech Stack

Java 17+

Spring Boot 3.x (Spring Security, OAuth2, Thymeleaf)

Maven

Google OAuth2 API

🚀 Getting Started

🔹 1. Clone the Repository

git clone https://github.com/your-username/Spring-OAuth2-Login.git
cd Spring-OAuth2-Login

🔹 2. Configure Google OAuth2 Credentials

Go to Google Cloud Console, create a project, enable OAuth consent screen, and generate credentials.

Update application.properties:

spring.security.oauth2.client.registration.google.client-id=YOUR_GOOGLE_CLIENT_ID
spring.security.oauth2.client.registration.google.client-secret=YOUR_GOOGLE_CLIENT_SECRET

🔹 3. Run the Application

mvn spring-boot:run

Access the login page at: http://localhost:8080/login

🖼️ Screenshots

✨ Custom Login Page



📜 Profile Page (User Details)



🤝 Contribution Guide

Want to improve this project? Follow these steps:

Fork this repository

Clone your forked version

Create a feature branch

Make changes and commit them

Push to your fork and submit a Pull Request

🛡️ Security Best Practices

Never expose OAuth credentials in public repositories!

Use environment variables instead of hardcoding credentials

Implement role-based access control (RBAC) for more security

📜 License

This project is licensed under MIT License – feel free to use and modify.

⭐ Found this helpful? Star the repo and contribute! 🚀
