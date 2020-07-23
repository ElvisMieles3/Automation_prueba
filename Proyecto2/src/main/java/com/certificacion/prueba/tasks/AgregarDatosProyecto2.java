package com.certificacion.prueba.tasks;

import com.certificacion.prueba.interation.WaitInteration;
import com.certificacion.prueba.models.DatosRegistro;
import com.certificacion.prueba.userinterfaces.Proyecto2UserInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class AgregarDatosProyecto2 implements Task {

    private DatosRegistro datosRegistro;

    public AgregarDatosProyecto2(DatosRegistro datosRegistro) {

        this.datosRegistro = datosRegistro;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(datosRegistro.getNombre()).
                into(Proyecto2UserInterfaces.INGRESA_NOMBRE));

        actor.attemptsTo(Enter.theValue(datosRegistro.getApellido()).
                into(Proyecto2UserInterfaces.INGRESA_APELLIDO));

        actor.attemptsTo(Enter.theValue(datosRegistro.getCorreoElectronico()).
                into(Proyecto2UserInterfaces.INGRESA_CORREO));

        actor.attemptsTo(Enter.theValue(datosRegistro.getContrasena()).
                into(Proyecto2UserInterfaces.INGRESA_CONTRASENA));

        actor.attemptsTo(Enter.theValue(datosRegistro.getFechaNacimiento()).
                into(Proyecto2UserInterfaces.INGRESA_FECHA_NACIMIENTO));

        actor.attemptsTo(Click.on(Proyecto2UserInterfaces.SELECCIONA_EL_SEXO_MASCULINO));

        actor.attemptsTo(Click.on(Proyecto2UserInterfaces.SELECCIONA_EL_BOTON_CREAR_CUENTA));


    }

    public static AgregarDatosProyecto2 conDatos(DatosRegistro datosRegistro){

        return new AgregarDatosProyecto2(datosRegistro);
    }

}
