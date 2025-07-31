# Service Discovery Microservice

The Service Discovery microservice is responsible for managing the registration and discovery of microservices in the application. It utilizes Eureka, a service registry, to allow microservices to find and communicate with each other.

## Features

- **Service Registration**: Microservices can register themselves with the Eureka server.
- **Service Discovery**: Microservices can discover other registered services.
- **Load Balancing**: Supports client-side load balancing for service calls.

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven 3.6 or higher

### Installation

1. Clone the repository:
   ```
   git clone <repository-url>
   ```

2. Navigate to the service-discovery directory:
   ```
   cd microservices-app/service-discovery
   ```

3. Build the project using Maven:
   ```
   mvn clean install
   ```

### Running the Service Discovery

To run the Service Discovery microservice, execute the following command:
```
mvn spring-boot:run
```

### Configuration

The configuration for the Service Discovery can be found in `src/main/resources/application.yml`. You can customize the server port and Eureka settings as needed.

## API Endpoints

- **GET /eureka/apps**: Retrieve the list of registered applications.
- **GET /eureka/apps/{applicationName}**: Retrieve details of a specific registered application.

## Contributing

Contributions are welcome! Please submit a pull request or open an issue for any enhancements or bug fixes.

## License

This project is licensed under the MIT License. See the LICENSE file for details.