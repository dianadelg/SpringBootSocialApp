# springboot-social-api

A Spring Boot REST API built incrementally to learn backend development, MVC, and database integration. It starts as a simple Hello World and grows into a small social-media backend.

## Roadmap

- [ ] **1. Hello World**: Create a Spring Boot project, run a server, and return text from an endpoint
- [ ] **2. REST APIs & MVC**: Controllers, HTTP methods, request/response handling, and JSON
- [ ] **3. Dependency Injection**: Services, constructors, `@Service`, `@Autowired`, and Spring beans
- [ ] **4. Models & DTOs**: Represent users and posts; understand data transfer
- [ ] **5. CRUD Operations**: Create, read, update, and delete users and posts
- [ ] **6. Database Integration**: Spring Data JPA, repositories, SQL, and relationships
- [ ] **7. Validation & Errors**: Validate requests and handle exceptions
- [ ] **8. Authentication & Security**: Sign-up, login, password hashing, and permissions
- [ ] **9. Social Features & Testing**: Posts, photos, feeds, tests, and application configuration

## Tech Stack

- Java
- Spring Boot (Maven)
- Spring Web MVC
- Spring Data JPA *(stage 6)*
- Spring Security *(stage 8)*

## Getting Started

### Prerequisites

- JDK 21 or newer
- Maven (or the included Maven Wrapper)
- Git

### Run Locally

```bash
git clone https://github.com/dianadelg/springboot-social-api.git
cd springboot-social-api
./mvnw spring-boot:run
```

On Windows Command Prompt, use `mvnw spring-boot:run`. The server starts at `http://localhost:8080`.

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/hello` | Returns a greeting |

*More endpoints will be added as the roadmap progresses.*
