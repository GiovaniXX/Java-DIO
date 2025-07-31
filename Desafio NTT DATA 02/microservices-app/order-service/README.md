# Order Service

The Order Service is a microservice responsible for managing customer orders in the microservices application. It provides endpoints for creating, retrieving, updating, and deleting orders.

## Features

- Create new orders
- Retrieve existing orders
- Update order details
- Delete orders

## Technologies Used

- Spring Boot
- Spring Data JPA
- H2 Database (for development)
- Maven

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven

### Installation

1. Clone the repository:
   ```
   git clone <repository-url>
   ```

2. Navigate to the order-service directory:
   ```
   cd order-service
   ```

3. Build the project using Maven:
   ```
   mvn clean install
   ```

### Running the Application

To run the Order Service, execute the following command:
```
mvn spring-boot:run
```

The service will start on the configured port specified in `src/main/resources/application.yml`.

### API Endpoints

- `POST /orders`: Create a new order
- `GET /orders/{id}`: Retrieve an order by ID
- `PUT /orders/{id}`: Update an existing order
- `DELETE /orders/{id}`: Delete an order by ID

## Contributing

Contributions are welcome! Please submit a pull request or open an issue for any enhancements or bug fixes.

## License

This project is licensed under the MIT License. See the LICENSE file for details.