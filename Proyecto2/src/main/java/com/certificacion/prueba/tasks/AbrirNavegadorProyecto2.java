package com.certificacion.prueba.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirNavegadorProyecto2 implements Task {

	
	  @Override
	    public <T extends Actor> void performAs(T actor) {
		  
	        actor.attemptsTo(Open.url("http://3.87.50.247:3000/"));
	       
	    }
	public static AbrirNavegadorProyecto2 navegador(){

		return Tasks.instrumented(AbrirNavegadorProyecto2.class);
	}
}
