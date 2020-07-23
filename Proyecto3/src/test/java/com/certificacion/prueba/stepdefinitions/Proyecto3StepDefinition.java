package com.certificacion.prueba.stepdefinitions;

import com.certificacion.prueba.models.DatosRegistro;
import com.certificacion.prueba.questions.RegistrarProyecto3;
import com.certificacion.prueba.tasks.AbrirNavegadorProyecto3;
import com.certificacion.prueba.tasks.AgregarDatosProyecto3;
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

public class Proyecto3StepDefinition {

    @Managed
    private WebDriver miNavegador;

    @Before
    public void setUpOnStage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(miNavegador)));
        theActorCalled("Elvis");
    }


    @Given("^que (.*) esta en el sitio$")
    public void queElvisEstaEnElSitio(Actor actor) {

        OnStage.theActorInTheSpotlight().wasAbleTo(AbrirNavegadorProyecto3.navegador());
    }

    @When("^el ingresa la informacion para registrar cliente nuevo$")
    public void elIngresaLaInformacionParaRegistrarClienteNuevo(List<DatosRegistro> datosRegistros) {
        OnStage.theActorInTheSpotlight().attemptsTo(AgregarDatosProyecto3.conDatos(datosRegistros.get(0)));

    }

    @Then("^el usuario debe ver la alerta (.*)$")
    public void elUsuarioDebeVerLaAlertaRegisteredSuccessfully(String descripcionPoPup) throws Exception {
        Thread.sleep(2000);
        Alert alert = miNavegador.switchTo().alert();
        theActorInTheSpotlight().should(seeThat(RegistrarProyecto3.mensaje(alert.getText()),
                org.hamcrest.Matchers.is(descripcionPoPup)));
    }

}
