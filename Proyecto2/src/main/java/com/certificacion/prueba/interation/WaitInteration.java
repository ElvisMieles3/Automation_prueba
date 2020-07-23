package com.certificacion.prueba.interation;

import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class WaitInteration implements Interaction {
	
	private int seconds;
	
	public WaitInteration(int seconds) {
		this.seconds = seconds;
	}

	@Override
	public <T extends Actor> void performAs(T arg0) {
		new InternalSystemClock().pauseFor(seconds*1000);
	
	}
	public static WaitInteration waitFor(int seconds) {

		return Tasks.instrumented(WaitInteration.class, seconds);
	}

}
