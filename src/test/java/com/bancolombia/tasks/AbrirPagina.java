package com.bancolombia.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirPagina implements Task {

    private final String url;

    public AbrirPagina(String url) {
        this.url = url;
    }

    @Step("{0} abre la página web #url")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(url));
    }

    public static AbrirPagina en(String url) {
        return instrumented(AbrirPagina.class, url);
    }
}
