# Spring Boot Blog REST API

A robust, production-ready RESTful API for a blogging platform built with Spring Boot. This project demonstrates enterprise-level backend development practices, including clean architecture, security implementation, and containerization.

## 🌟 Key Features

- **Complete CRUD Operations**: Full create, read, update, and delete functionality for blog posts and comments
- **RESTful Architecture**: Well-designed API endpoints following REST best practices
- **Security**: JWT-based authentication and authorization with role-based access control
- **Data Validation**: Comprehensive input validation and error handling
- **Pagination & Sorting**: Efficient data retrieval with customizable pagination and sorting options
- **Exception Handling**: Global exception handling with meaningful error responses
- **Interactive API Documentation**: Fully integrated Swagger/OpenAPI 3.0 UI for API exploration
- **Production Deployment**: Live on AWS with Docker containerization
- **Database Integration**: PostgreSQL 17+ with JPA/Hibernate for robust data persistence
- **Modern Java**: Built with Java 21 leveraging latest language features

## 🛠️ Technology Stack

- **Framework**: Spring Boot 3.x
- **Language**: Java 21
- **Database**: PostgreSQL 17+
- **ORM**: Spring Data JPA (Hibernate)
- **Security**: Spring Security with JWT
- **Build Tool**: Maven
- **API Documentation**: Swagger/OpenAPI 3.0
- **Containerization**: Docker & Docker Compose
- **Cloud Deployment**: AWS

## 📋 Prerequisites

Before running this application, ensure you have the following installed:

- Java 21 or higher
- Maven 3.6+
- PostgreSQL 17+
- Docker and Docker Compose (for containerized deployment)

## 🔧 Installation & Setup

### Option 1: Local Development

1. **Clone the repository**
   ```bash
   git clone https://github.com/turtle6814/springboot-blog-rest-api.git
   cd springboot-blog-rest-api
   ```

2. **Build the project**
   ```bash
   ./mvnw clean install
   ```

3. **Run the application**
   ```bash
   ./mvnw spring-boot:run
   ```

The API will be available at `http://localhost:8080`

## 📖 API Documentation

This project includes interactive API documentation using Swagger/OpenAPI 3.0.

**Access Swagger UI:**
- Local: `http://localhost:8080/swagger-ui.html`
- AWS: `http://your-aws-endpoint/swagger-ui.html`

The Swagger interface provides:
- Complete API endpoint documentation
- Interactive request testing
- Request/response schema definitions
- Authentication testing capabilities

### Option 2: Docker Deployment

1. **Build and run with Docker Compose**
   ```bash
   docker-compose up -d
   ```

This will start both the Spring Boot application and PostgreSQL database in containers.

## 📚 API Endpoints

### Authentication
- `POST /api/auth/register` - Register a new user
- `POST /api/auth/login` - Authenticate and receive JWT token

### Posts
- `GET /api/posts` - Get all posts (with pagination and sorting)
- `GET /api/posts/{id}` - Get a specific post
- `POST /api/posts` - Create a new post (authenticated)
- `PUT /api/posts/{id}` - Update a post (authenticated)
- `DELETE /api/posts/{id}` - Delete a post (authenticated)

### Comments
- `GET /api/posts/{postId}/comments` - Get all comments for a post
- `GET /api/posts/{postId}/comments/{id}` - Get a specific comment
- `POST /api/posts/{postId}/comments` - Add a comment (authenticated)
- `PUT /api/posts/{postId}/comments/{id}` - Update a comment (authenticated)
- `DELETE /api/posts/{postId}/comments/{id}` - Delete a comment (authenticated)

### Categories
- `GET /api/categories` - Get all categories
- `POST /api/categories` - Create a category (admin only)

## 🔐 Security

The API implements JWT-based authentication with the following security features:

- **Token-based Authentication**: Secure JWT tokens for API access
- **Role-based Authorization**: Different permissions for users and administrators
- **Password Encryption**: BCrypt hashing for secure password storage
- **CORS Configuration**: Configurable cross-origin resource sharing
- **SQL Injection Protection**: Parameterized queries through JPA

## 📊 Database Schema

The application uses a relational database with the following main entities:

- **User**: User account information and credentials
- **Post**: Blog post content, title, and metadata
- **Comment**: User comments on posts
- **Category**: Post categorization
- **Role**: User roles for authorization

## 🧪 Testing

Run the test suite:
```bash
./mvnw test
```

## 🏗️ Architecture & Design Patterns

- **Layered Architecture**: Clear separation between controller, service, and repository layers
- **DTO Pattern**: Data Transfer Objects for API request/response handling
- **Repository Pattern**: Abstraction of data access logic
- **Dependency Injection**: Loose coupling through Spring's IoC container
- **Exception Handling**: Centralized exception handling with custom exceptions

## 🔄 Request/Response Flow

1. Client sends HTTP request to the API endpoint
2. Controller receives and validates the request
3. Service layer processes business logic
4. Repository layer interacts with the database
5. Response is formatted and returned to the client


## 🚢 Deployment

The application is production-ready and deployed on multiple platforms:

### ✅ Current Deployments

- **AWS Cloud**: Live deployment on Amazon Web Services
    - Scalable infrastructure
    - High availability configuration
    - Production-grade security

- **Docker Containers**: Fully containerized application
    - Using the provided Dockerfile and docker-compose.yml
    - Easy deployment and scaling
    - Consistent environments across development and production

### Additional Deployment Options

- **Other Cloud Platforms**: Azure, Google Cloud Platform
- **Traditional Servers**: Any server supporting Java applications
- **Container Orchestration**: Kubernetes, Docker Swarm, AWS ECS


## 👨‍💻 Developer

**Turtle6814**

- GitHub: [@turtle6814](https://github.com/turtle6814)

## 📞 Contact

For questions or support, please open an issue in the GitHub repository.

---

**Note**: This project demonstrates modern Spring Boot development practices and is suitable for portfolio showcasing and learning purposes.
