package com.prog.questions.designpattern.command;

import java.util.List;
import java.util.ArrayList;

/*The Invoker*/
public class Switch {

	private List<Command> history  = new ArrayList<Command>();
	
	public void storeAndExecute(Command command){
		history.add(command);
		command.execute();
	}
}
