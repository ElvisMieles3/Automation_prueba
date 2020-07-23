package com.certificacion.prueba.stepdefinitions;

import com.certificacion.prueba.models.DatosRegistro;
import com.certificacion.prueba.tasks.AbrirNavegador;
import com.certificacion.prueba.tasks.AgregarDatosProyecto2;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class Proyecto2StepDefinition {

    @Managed
    private WebDriver miNavegador;

    @Before
    public void setUpOnStage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(miNavegador)));
        theActorCalled("Elvis");
    }

    @Given("^que (.*) esta en el portal$")
    public void queElvisEstaEnElPortal( Actor actor) {
        OnStage.theActorInTheSpotlight().wasAbleTo(AbrirNavegador.navegador());
    }


    @When("^el ingresa la informacion para ingresar$")
    public void elIngresaLaInformacionParaIngresar(List<DatosRegistro> datosRegistros) {
        OnStage.theActorInTheSpotlight().attemptsTo(AgregarDatosProyecto2.conDatos(datosRegistros.get(0)));

    }

    @Then("^el usuario debe ver el nombre Bienvenido Elvis Miguel Mieles Guarin$")
    public void elUsuarioDebeVerElNombreBienvenidoElvisMiguelMielesGuarin() {

    }


}
