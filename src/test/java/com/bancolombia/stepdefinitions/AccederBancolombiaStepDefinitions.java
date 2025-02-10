package com.bancolombia.stepdefinitions;

import com.bancolombia.tasks.AbrirPagina; 
import com.bancolombia.tasks.SeleccionarOpcion;
import com.bancolombia.userinterfaces.BancolombiaHomePage;
import com.bancolombia.questions.ValidarDocumento;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class AccederBancolombiaStepDefinitions {

    @Before
    public void configurarEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que el usuario abre la página de Bancolombia")
    public void queElUsuarioAbreLaPaginaDeBancolombia() {
        //OnStage.theActorCalled("Usuario").attemptsTo(AbrirPagina.en("https://www.bancolombia.com/personas"));
        OnStage.theActorCalled("Usuario").attemptsTo(AbrirPagina.en("https://www.banistmo.com/wps/portal/banistmo/personas"));
    }

    @Cuando("selecciona las opciones requeridas")
    public void seleccionaLasOpcionesRequeridas() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarOpcion.en(BancolombiaHomePage.OPCION_PERSONAS),
                SeleccionarOpcion.en(BancolombiaHomePage.OPCION_PRODUCTOS_SERVICIOS),
                SeleccionarOpcion.en(BancolombiaHomePage.OPCION_INVERSIONES),
                SeleccionarOpcion.en(BancolombiaHomePage.OPCION_INVERSION_VIRTUAL),
                SeleccionarOpcion.en(BancolombiaHomePage.OPCION_DOCUMENTOS),
                SeleccionarOpcion.en(BancolombiaHomePage.OPCION_REGLAMENTO_INVERSION)
        );
    }

    @Entonces("valida que el documento sea correcto")
    public void validaQueElDocumentoSeaCorrecto() {
        OnStage.theActorInTheSpotlight().should(
                seeThat("El documento es visible", ValidarDocumento.esCorrecto(BancolombiaHomePage.OPCION_REGLAMENTO_INVERSION), Matchers.is(true))
        );
    }
}
