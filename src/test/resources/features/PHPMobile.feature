Feature: El usuario realiza una reserva de un tour

  @PHP
  Scenario: Realizar reserva de un tour en phptravels
    Given el usuario se encuentra en la home de la app
    When el usuario tapea el icono Tours
    And el usuario completa los datos de destino <destino> , fecha <fecha>
    And el usuario selecciona cantidad de adultos <cantidad>
    And el usuario tapea el boton "SEARCH"
    And el usuario tapea el ícono de tour encontrado
    And el usuario selecciona la cantidad de adultos y de niños
    And el usuario tapea el boton BOOK
    And el usuario completa los datos <nombre>, <apellido>,<mail>,<phonenumber>, <address>
    And el usuario tapea el boton PROCEED
    Then el usuario verifica que se realizo correctamente la reserva del tour

