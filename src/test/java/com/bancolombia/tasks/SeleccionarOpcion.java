package com.bancolombia.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarOpcion implements Task {
    private final Target opcion;

    public SeleccionarOpcion(Target opcion) {
        this.opcion = opcion;
    }

    @Step("{0} selecciona la opción")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(opcion));
    }

    public static SeleccionarOpcion en(Target opcion) {
        return instrumented(SeleccionarOpcion.class, opcion);
    }
}
