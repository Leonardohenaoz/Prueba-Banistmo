# Fecha creación 10/02/2025
# Feature Caso Uno 


@PruebaTecnica 
Feature: Acceder a la página de Bancolombia y validar el documento
  
  
	@PruebaTecnicaCasoUno
  Scenario Outline: Usuario accede al documento "Reglamento Inversión Virtual Bancolombia"
  
  	Given que el usuario abre la página de Bancolombia
    When selecciona las opciones requeridas
    Then valida que el documento sea correcto
    
    #No es la pagina
