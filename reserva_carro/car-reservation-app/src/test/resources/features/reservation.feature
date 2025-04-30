Feature: Car Reservation

  Scenario: Reserva dentro da área de cobertura
    Given que o usuário está em "Belo Horizonte"
    And o endereço de reserva é "Rua A, 123"
    When o usuário faz uma reserva
    Then a resposta deve ser "Motorista a caminho"

  Scenario: Reserva fora da área de cobertura
    Given que o usuário está em "São Paulo"
    And o endereço de reserva é "Avenida B, 456"
    When o usuário faz uma reserva
    Then a resposta deve ser "Área fora de cobertura"