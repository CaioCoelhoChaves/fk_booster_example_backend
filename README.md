# FK Booster Example Backend

This is a Java Spring Boot project initialized with Maven, providing a simple REST API.

## Prerequisites

- **Java 17 or higher**: Ensure you have a compatible JDK installed.
- **Maven**: The project includes a Maven wrapper (`mvnw`), so you don't need a global Maven installation.

## Getting Started

### 1. Clone the repository
```bash
git clone <repository-url>
cd fk-booster-example-backend
```

### 2. Build the project
Use the Maven wrapper to build the project and install dependencies:
```bash
./mvnw clean install
```

### 3. Run the application
You can start the Spring Boot application using the following command:
```bash
./mvnw spring-boot:run
```
The application will start on `http://localhost:8080` by default.

## API Endpoints

### Hello World
A simple health check/hello-world route is provided to verify the setup.

- **URL**: `/hello`
- **Method**: `GET`
- **Response**: `Hello, World!`

**Example with curl:**
```bash
curl http://localhost:8080/hello
```

## Project Structure

- `src/main/java`: Contains the Java source code.
  - `com.example.fkbooster.fk_booster_example_backend.controller`: Contains REST controllers.
- `src/main/resources`: Contains configuration files like `application.properties`.
- `pom.xml`: Maven configuration file with project dependencies.
