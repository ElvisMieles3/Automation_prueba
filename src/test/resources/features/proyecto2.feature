Feature: yo como usuario del servicio
  Necesito ingresar los datos en el  portal
  Para registrar la información en el sistema

  Scenario: ingresar al sistema por primera vez
    Given que Elvis esta en el portal
    When el ingresa la informacion para ingresar
      | nombre       | apellido      | correoElectronico              | contrasena | fechaNacimiento |
      | Elvis Miguel | Mieles Guarin | elmielesguarin@poligran.edu.co | Poli*2019  | 1996-03-04      |
    Then el usuario debe ver el nombre Bienvenido Elvis Miguel Mieles Guarin