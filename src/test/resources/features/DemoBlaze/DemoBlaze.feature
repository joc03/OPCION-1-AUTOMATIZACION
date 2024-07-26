@AgregarItemCarrito
Feature: Flujo E2E COMPRA DE 2 PRODUCTOS

  @agregar_carrito

  Scenario Outline: Agregar los 2 productos al carrito de compras
    Given el usuario debe de encontrarse en la pagina de DemoBlaze
    When agrego el primer producto al carrito "<producto1>"
    And vuelvo a la pagina de inicio
    And agrego el segundo producto al carrito "<producto2>"
    And ingreso a la pagina del carrito
    And hago clic en el boton "PLACE ORDER"
    And relleno con los datos que me solicitan "<name>", "<country>", "<city>", "<creditCard>", "<year>", "<month>"
    And hago clic en el boton "PURCHASE"
    Then aparecera un cuadro con los datos de la compra, validando que diga "Thank you for your purchase!"
    And hago clic en el boton "OK"

    Examples:
    |producto1|  |producto2|   |name   |  |country   |  |city      |  |creditCard|  |year      |  |month     |
    |SANSUMG S6|  |NEXUS 6 |   |JOSE   |  |PERU      |  |LIMA      |  |123456789 |  |2022      |  |OCTUBRE   |









