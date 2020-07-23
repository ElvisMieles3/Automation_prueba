package com.certificacion.prueba.userinterfaces;

import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.springframework.expression.spel.ast.Elvis;

public class Proyecto3UserInterfaces {

    public static final Target SELECCIONA_LA_OPCION_REGISTRAR = Target
            .the("selecciona la opción de registrar un cliente nuevo")
            .locatedBy("//*[text() = 'Register']");


    public static final Target INGRESA_NOMBRE = Target
            .the("Digita el nombre del usuario").located(By.name("username"));
    public static final Target INGRESA_CONTRASENA1 = Target
            .the("Digita la contraseña del usuario").located(By.name("password"));
    public static final Target INGRESA_CONTRASENA2 = Target
            .the("Digita la contrasela del usuario por segunda vez").located(By.name("password2"));
    public static final Target INGRESA_DIRECCION = Target
            .the("Digita la dirección del usuario").located(By.name("address"));

    public static final Target INGRESA_REFERENCIA_DIRECCION = Target
            .the("Digita la referencia de la dirección del usuario").located(By.name("billaddress"));


    public static final Target SELECCIONA_EL_SEXO = Target.the("selecciona el sexo")
            .locatedBy("//input[@value='M']");

    public static final Target SELECCIONA_EL_ESTADO = Target
            .the("selecciona el sexo masculino")
            .locatedBy("//select[@name='state']//option[.='{0}");

    public static final Target SELECCIONA_EL_BOTON_ACEPTAR_POLITICAS = Target.
            the("selecciona el botón crear cuenta")
            .located(By.name("agree"));

    public static final Target SELECCIONA_EL_BOTON_REGISTRAR = Target.
            the("selecciona el botón crear cuenta")
            .located(By.name("Register"));

}
