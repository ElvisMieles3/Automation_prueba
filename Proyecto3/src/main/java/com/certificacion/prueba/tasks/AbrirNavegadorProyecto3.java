package com.certificacion.prueba.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirNavegadorProyecto3 implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url("http://sahitest.com/demo/training/login.htm"));
    }
    public static AbrirNavegadorProyecto3 navegador(){

        return Tasks.instrumented(AbrirNavegadorProyecto3.class);
    }
}
