# Car Reservation Application

This is a car reservation application built using Test-Driven Development (TDD) and Behavior-Driven Development (BDD) methodologies. The application allows users to reserve cars in specific cities and provides feedback based on the reservation area.

## Project Structure

```
car-reservation-app
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── reservation
│   │   │           ├── App.java
│   │   │           ├── model
│   │   │           │   └── Car.java
│   │   │           ├── service
│   │   │           │   └── ReservationService.java
│   │   │           └── util
│   │   │               └── DateUtils.java
│   │   └── resources
│   │       └── application.properties
│   ├── test
│       ├── java
│       │   └── com
│       │       └── reservation
│       │           ├── AppTest.java
│       │           ├── model
│       │           │   └── CarTest.java
│       │           ├── service
│       │           │   └── ReservationServiceTest.java
│       │           └── bdd
│       │               ├── RunCucumberTest.java
│       │               └── steps
│       │                   └── ReservationSteps.java
│       └── resources
│           └── features
│               └── reservation.feature
├── pom.xml
└── README.md
```

## Setup Instructions

1. **Clone the repository**:
   ```
   git clone <repository-url>
   cd car-reservation-app
   ```

2. **Build the project**:
   Ensure you have Maven installed, then run:
   ```
   mvn clean install
   ```

3. **Run the application**:
   You can run the application using:
   ```
   mvn exec:java -Dexec.mainClass="com.reservation.App"
   ```

## Usage

To reserve a car, you can call the `reservar` method from the `ReservationService` class, providing the city and address as parameters. The service will return a message indicating whether the reservation is within the coverage area or not.

## Testing

The project includes unit tests for all major components and BDD tests using Cucumber. To run the tests, execute:
```
mvn test
```

## Features

- **Car Reservation**: Reserve cars in Belo Horizonte and Contagem.
- **Coverage Area Check**: Provides feedback on whether the reservation is within the service area.
- **Unit and BDD Testing**: Ensures the application behaves as expected through comprehensive testing.

## Contributing

Contributions are welcome! Please open an issue or submit a pull request for any improvements or bug fixes.

## License

This project is licensed under the MIT License. See the LICENSE file for details.