package com.certificacion.prueba.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/proyecto2.feature"
        , glue = "com.certificacion.prueba.stepdefinitions"
        , snippets = SnippetType.CAMELCASE)
public class Proyecto2Runner {
}
