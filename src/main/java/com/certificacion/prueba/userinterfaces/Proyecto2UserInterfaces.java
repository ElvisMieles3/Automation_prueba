package com.certificacion.prueba.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Proyecto2UserInterfaces {

    public static final Target INGRESA_NOMBRE = Target
            .the("Digita el nombre del usuario").located(By.name("firstname"));
    public static final Target INGRESA_APELLIDO = Target
            .the("Digita el apellido del usuario").located(By.name("lastname"));
    public static final Target INGRESA_CORREO = Target
            .the("Digita el correo del usuario").located(By.name("email"));
    public static final Target INGRESA_CONTRASENA = Target
            .the("Digita la contraseña del usuario").located(By.name("password"));
    public static final Target INGRESA_FECHA_NACIMIENTO = Target
            .the("Digita la fecha de nacimiento del usuario").located(By.name("birthdate"));

    public static final Target SELECCIONA_EL_SEXO = Target.the("selecciona el sexo")
            .locatedBy("//div[@class='radio']//option[.='{0}']");

    public static final Target SELECCIONA_EL_SEXO_MASCULINO = Target.the("selecciona el sexo masculino")
            .located(By.name("man"));


    public static final Target SELECCIONA_EL_BOTON_CREAR_CUENTA = Target.
            the("selecciona el botón crear cuenta")
            .locatedBy("//button[@class='btn btn-default']");

}
