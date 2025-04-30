# Reserva de Carros

Este é um aplicativo de reserva de carros desenvolvido utilizando as metodologias de Desenvolvimento Orientado a Testes (TDD) e Desenvolvimento Orientado por Comportamento (BDD). O aplicativo permite que os usuários reservem carros em cidades específicas e fornece um retorno com base na área da reserva.

## Estrutura do projeto

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

