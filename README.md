# aiback

A Spring Boot backend project with JWT authentication, PostgreSQL, and RESTful APIs.

## Features

- User registration and login with JWT authentication
- User CRUD endpoints
- PostgreSQL database integration
- Secure password hashing
- Validation and error handling

## Requirements

- Java 21
- Docker & Docker Compose
- (Optional) Gradle (if running locally without Docker)

## Getting Started

### Clone the repository

```bash
git clone <your-repo-url>
cd aiback
```

#### Build and start all services

```bash
docker-compose up --build
```

The backend will be available at [http://localhost:8081](http://localhost:8081).

### Run Locally (without Docker)

Make sure PostgreSQL is running and update `application.properties` accordingly.

```bash
./gradlew bootRun
```

## API Endpoints

- `POST /auth/register` — Register a new user
- `POST /auth/login` — Login and receive JWT
- `GET /users` — List users (secured)
- `GET /users/{id}` — Get user by ID (secured)
- `POST /users` — Create user (secured)
- `PUT /users/{id}` — Update user (secured)
- `DELETE /users/{id}` — Delete user (secured)

## Testing

```bash
./gradlew test
```
