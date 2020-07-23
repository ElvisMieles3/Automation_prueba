package com.certificacion.prueba.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


public class RegistrarProyecto3 implements Question<String> {
	private String mensaje;

	public RegistrarProyecto3(String mensaje) {
		super();
		this.mensaje = mensaje;
	}

	@Override
	public String answeredBy(Actor actor) {

		return this.mensaje;
	}

	public static RegistrarProyecto3 mensaje(String mensaje){
		return new RegistrarProyecto3(mensaje);
	}
}
