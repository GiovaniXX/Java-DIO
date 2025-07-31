# Microservices Application

This project is a microservices architecture built using Spring Boot. It consists of several microservices that communicate with each other to provide a complete application. Below is a brief overview of each microservice included in this project.

## Microservices Overview

### 1. API Gateway
- **Location**: `api-gateway/`
- **Description**: The API Gateway serves as the entry point for all client requests. It routes requests to the appropriate microservices and handles cross-cutting concerns such as authentication and logging.

### 2. Service Discovery
- **Location**: `service-discovery/`
- **Description**: This microservice is responsible for service registration and discovery. It allows other microservices to find and communicate with each other dynamically.

### 3. Product Service
- **Location**: `product-service/`
- **Description**: The Product Service manages product-related operations, including creating, updating, and retrieving product information.

### 4. Order Service
- **Location**: `order-service/`
- **Description**: The Order Service handles order-related operations, including creating and managing customer orders.

## Project Setup

### Prerequisites
- Java 11 or higher
- Maven
- IDE (e.g., IntelliJ IDEA, Eclipse, or any text editor)

### Running the Application
1. Clone the repository:
   ```
   git clone <repository-url>
   ```
2. Navigate to each microservice directory and run the following command to start the service:
   ```
   mvn spring-boot:run
   ```
3. Ensure that the Service Discovery is running before starting the API Gateway and other services.

### API Documentation
Refer to the individual README files in each microservice directory for detailed API documentation and usage instructions.

## Contributing
Contributions are welcome! Please open an issue or submit a pull request for any enhancements or bug fixes.

## License
This project is licensed under the MIT License. See the LICENSE file for more details.