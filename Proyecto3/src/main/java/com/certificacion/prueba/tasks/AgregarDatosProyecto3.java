package com.certificacion.prueba.tasks;

import com.certificacion.prueba.interation.WaitInteration;
import com.certificacion.prueba.models.DatosRegistro;
import com.certificacion.prueba.userinterfaces.Proyecto3UserInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromTarget;
import net.serenitybdd.screenplay.questions.Visibility;

public class AgregarDatosProyecto3 implements Task {

    private DatosRegistro datosRegistro;

    public AgregarDatosProyecto3(DatosRegistro datosRegistro) {

        this.datosRegistro = datosRegistro;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(Click.on(Proyecto3UserInterfaces.SELECCIONA_EL_BOTON_REGISTRAR));

        actor.attemptsTo(Enter.theValue(datosRegistro.getUserName()).
                into(Proyecto3UserInterfaces.INGRESA_NOMBRE));

        actor.attemptsTo(Enter.theValue(datosRegistro.getPassword()).
                into(Proyecto3UserInterfaces.INGRESA_CONTRASENA1));

        actor.attemptsTo(Enter.theValue(datosRegistro.getRepeatPassword()).
                into(Proyecto3UserInterfaces.INGRESA_CONTRASENA2));

        actor.attemptsTo(Click.on(Proyecto3UserInterfaces.SELECCIONA_EL_SEXO));

        actor.attemptsTo(Enter.theValue(datosRegistro.getAddress())
                .into(Proyecto3UserInterfaces.INGRESA_DIRECCION));

        actor.attemptsTo(Enter.theValue(datosRegistro.getRepeatPassword())
                .into(Proyecto3UserInterfaces.INGRESA_REFERENCIA_DIRECCION));

        actor.attemptsTo(Click.on(Proyecto3UserInterfaces.SELECCIONA_EL_ESTADO.of(datosRegistro.getState())));

        actor.attemptsTo(Click.on(Proyecto3UserInterfaces.SELECCIONA_EL_BOTON_ACEPTAR_POLITICAS));

        actor.attemptsTo(Click.on(Proyecto3UserInterfaces.SELECCIONA_EL_BOTON_REGISTRAR));

    }

    public static AgregarDatosProyecto3 conDatos(DatosRegistro datosRegistro){

        return new AgregarDatosProyecto3(datosRegistro);
    }

}
