package com.prog.questions.designpattern.command;

public class FlipUpCommnad implements Command {

	private Light theLight;
	
	public FlipUpCommnad(Light theLight) {
		this.theLight = theLight;
	}
	@Override
	public void execute() {
		theLight.switchOn();

	}

}
