Feature: yo como usuario del servicio
  Necesito ingresar los datos de un usuario nuevo en el  portal
  Para registrar la información en el sistema

  Scenario: ingresar al sistema por primera vez
    Given que Elvis esta en el sitio
    When el ingresa la informacion para registrar cliente nuevo
      | userName     | password      | repeatPassword                 | address   | billingAddress | state  |
      | Elvis Miguel | Mieles Guarin | elmielesguarin@poligran.edu.co | Poli*2019 | 1996-03-04     | Kerala |
    Then el usuario debe ver la alerta Registered Successfully