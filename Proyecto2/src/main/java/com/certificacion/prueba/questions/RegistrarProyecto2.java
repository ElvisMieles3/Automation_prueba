package com.certificacion.prueba.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


public class RegistrarProyecto2 implements Question<String> {
	private String mensaje;

	public RegistrarProyecto2(String mensaje) {
		super();
		this.mensaje = mensaje;
	}

	@Override
	public String answeredBy(Actor actor) {

		return this.mensaje;
	}

	public static RegistrarProyecto2 mensaje(String mensaje){
		return new RegistrarProyecto2(mensaje);
	}
}
