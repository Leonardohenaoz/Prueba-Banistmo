# Fecha creación 04/04/2024
# Feature Caso Uno 


@CasoUno 
Feature: Crear New User
  
  
	@CasoUnoNewUser
  Scenario Outline: Crear New User exitosamente
  
  	## Autenticación en el sistema
    Given Ingreso al sitio
    When Ingresar a la opcion New User
    And Ingreso de informacion de New User <firstName> <lastName> <userName> <password>
    And Click en el boton Register 
    And Ingresar al modulo Book Store Application y seleccionar la opción Book Store
    And Seleccionar libro Programming JavaScript
    And Ingreso al sitio
    #And Ingresar al modulo Book Store Application y seleccionar la opción Book Store
    #And Seleccionar libro Understanding ECMAScript seis
    #And Ingreso passwword <password> y clic en boton ingresar
    #Then Valido la autenticación en el sistema Tuenti


    Examples:
      | firstName | lastName | userName | password |
      ##@externaldata@./src/test/resources/DataDriven/CasoUno.xlsx@Caso01
|"Test01"|"Test01"|"test01"|"Test2023*"|


