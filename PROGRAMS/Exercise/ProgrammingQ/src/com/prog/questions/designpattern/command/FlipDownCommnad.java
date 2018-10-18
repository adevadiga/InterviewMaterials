package com.prog.questions.designpattern.command;

public class FlipDownCommnad implements Command {

	private Light theLight;
	
	public FlipDownCommnad(Light theLight) {
		this.theLight = theLight;
	}
	@Override
	public void execute() {
		theLight.switchOff();

	}

}
