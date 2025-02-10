package com.bancolombia.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ValidarDocumento implements Question<Boolean> {
    
    private final Target documento;

    public ValidarDocumento(Target documento) {
        this.documento = documento;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return documento.resolveFor(actor).isVisible();
    }

    public static ValidarDocumento esCorrecto(Target documento) {
        return new ValidarDocumento(documento);
    }
}
