# Product Service

The Product Service is a microservice that handles all operations related to products in the application. It provides RESTful APIs for managing product data, including creating, reading, updating, and deleting products.

## Features

- **CRUD Operations**: Create, Read, Update, and Delete products.
- **Data Validation**: Ensures that product data meets specified criteria.
- **Integration**: Works seamlessly with other microservices in the application.

## Technologies Used

- **Spring Boot**: For building the microservice.
- **Maven**: For dependency management and build automation.
- **Java**: The programming language used for development.

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven 3.6 or higher

### Installation

1. Clone the repository:
   ```
   git clone <repository-url>
   ```

2. Navigate to the product-service directory:
   ```
   cd product-service
   ```

3. Build the project using Maven:
   ```
   mvn clean install
   ```

4. Run the application:
   ```
   mvn spring-boot:run
   ```

### Configuration

The application configuration can be found in `src/main/resources/application.yml`. You can modify the server port and database connection settings as needed.

## API Endpoints

- `GET /products`: Retrieve a list of all products.
- `GET /products/{id}`: Retrieve a specific product by ID.
- `POST /products`: Create a new product.
- `PUT /products/{id}`: Update an existing product.
- `DELETE /products/{id}`: Delete a product by ID.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.