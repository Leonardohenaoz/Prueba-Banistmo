package com.bancolombia.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BancolombiaHomePage extends PageObject {
    
    public static final Target OPCION_PERSONAS = Target.the("Opción Personas")
            .located(By.xpath("(//a[contains(text(), 'Personas')])[1]"));

    public static final Target OPCION_PRODUCTOS_SERVICIOS = Target.the("Opción Productos & Servicios")
            .located(By.xpath("(//a[@class='dropdown-toggle' and contains(text(), 'Productos')])[1]\r\n"));

    public static final Target OPCION_INVERSIONES = Target.the("Opción Inversiones")
            .located(By.xpath("//a[contains(text(), 'Inversiones')]"));

    public static final Target OPCION_INVERSION_VIRTUAL = Target.the("Opción Inversión Virtual")
            .located(By.xpath("//a[contains(text(), 'Inversión Virtual')]"));

    public static final Target OPCION_DOCUMENTOS = Target.the("Opción Documentos")
            .located(By.xpath("//a[contains(text(), 'Documentos')]"));

    public static final Target OPCION_REGLAMENTO_INVERSION = Target.the("Reglamento Inversión Virtual Bancolombia")
            .located(By.xpath("//a[contains(text(), 'Reglamento Inversión Virtual Bancolombia')]"));
}

