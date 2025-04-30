Feature: Reserva de Carro

  Cenário: Reserva dentro da área de cobertura
    Dado que o passageiro está em "Belo Horizonte" e informa o endereço "Rua A"
    Quando o passageiro tenta reservar o carro
    Então a mensagem "Motorista a caminho" deve ser retornada

  Cenário: Reserva fora da área de cobertura
    Dado que o passageiro está em "São Paulo" e informa o endereço "Rua B"
    Quando o passageiro tenta reservar o carro
    Então a mensagem "Área fora de cobertura" deve ser retornada