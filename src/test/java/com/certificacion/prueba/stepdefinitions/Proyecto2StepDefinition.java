package com.certificacion.prueba.stepdefinitions;

import com.certificacion.prueba.interation.WaitInteration;
import com.certificacion.prueba.models.DatosRegistro;
import com.certificacion.prueba.questions.RegistrarProyecto2;
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
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

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

    @Then("^el usuario debe ver el mensaje (.*)$")
    public void elUsuarioDebeVerElMensaje(String descripcionPoPup) throws Exception {

        Thread.sleep(2000);
        Alert alert = miNavegador.switchTo().alert();
        theActorInTheSpotlight().should(seeThat(RegistrarProyecto2.mensaje(alert.getText()),
                org.hamcrest.Matchers.is(descripcionPoPup)));
    }
}
