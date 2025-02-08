# FullStack-API-Hub

A Spring Boot backend application that provides commonly used APIs for full-stack web development. This project serves as a one-stop solution for developers to integrate various backend functionalities effortlessly.

## Features
- Authentication & Authorization (JWT, OAuth2)
- User Management (CRUD)
- File Upload/Download
- Payment Integration (Razorpay, Stripe, PayPal)
- Email & SMS Services (Twilio, AWS SES)
- Real-Time Notifications (WebSockets, Firebase)
- Chat System (WebSockets, Kafka)
- Logging & Monitoring (ELK, Prometheus)
- Database Management (MySQL, PostgreSQL, MongoDB)
- Search Functionality (Elasticsearch)
- Role-Based Access Control (RBAC)
- API Rate Limiting & Security

## Technologies Used
- **Spring Boot** (Java)
- **Spring Security** (JWT, OAuth2)
- **Spring Data JPA** (Hibernate, MySQL, PostgreSQL, MongoDB)
- **Kafka & WebSockets** (Real-time Communication)
- **Redis** (Caching, Session Management)
- **Swagger** (API Documentation)

## API Endpoints

### Authentication & Authorization
- `POST /auth/register` - User Registration
- `POST /auth/login` - User Login (JWT)
- `POST /auth/logout` - Logout
- `GET /auth/user` - Get Logged-in User Details

### User Management
- `GET /users` - Get All Users
- `GET /users/{id}` - Get User By ID
- `PUT /users/{id}` - Update User
- `DELETE /users/{id}` - Delete User

### File Upload & Download
- `POST /files/upload` - Upload File
- `GET /files/download/{fileId}` - Download File

### Payment Integration
- `POST /payment/razorpay` - Razorpay Payment
- `POST /payment/stripe` - Stripe Payment
- `POST /payment/paypal` - PayPal Payment

### Email & SMS Services
- `POST /email/send` - Send Email
- `POST /sms/send` - Send SMS (Twilio)

### Real-Time Chat & Notifications
- `POST /chat/send` - Send Message
- `GET /chat/messages/{userId}` - Get Messages
- `WS /notifications` - WebSocket Notifications

### Logging & Monitoring
- `GET /logs` - Retrieve Application Logs

### API Documentation
- `GET /swagger-ui.html` - Swagger Documentation

---

This project is open for contributions! Feel free to submit pull requests. 🚀


