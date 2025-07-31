# API Gateway Microservice

The API Gateway is a crucial component of the microservices architecture, serving as the single entry point for all client requests. It routes requests to the appropriate microservices and handles cross-cutting concerns such as authentication, logging, and rate limiting.

## Features

- **Routing**: Directs incoming requests to the appropriate microservice based on the request path.
- **Load Balancing**: Distributes incoming requests across multiple instances of microservices.
- **Security**: Implements authentication and authorization mechanisms to secure the microservices.
- **Monitoring**: Provides insights into the performance and health of the microservices.

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven 3.6 or higher

### Installation

1. Clone the repository:
   ```
   git clone <repository-url>
   ```
2. Navigate to the `api-gateway` directory:
   ```
   cd api-gateway
   ```
3. Build the project using Maven:
   ```
   mvn clean install
   ```

### Running the Application

To run the API Gateway, execute the following command:
```
mvn spring-boot:run
```

The application will start on the configured port (default is 8080). You can access the API Gateway at `http://localhost:8080`.

## Configuration

The configuration settings for the API Gateway can be found in the `src/main/resources/application.yml` file. You can customize the server port, routing information, and other settings as needed.

## Contributing

Contributions are welcome! Please submit a pull request or open an issue for any enhancements or bug fixes.

## License

This project is licensed under the MIT License. See the LICENSE file for more details.