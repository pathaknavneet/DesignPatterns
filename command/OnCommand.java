package com.design.command;

public class OnCommand implements Command {

	private ConsumerElectronics ce;
	
	 public OnCommand(ConsumerElectronics ce) {
		 this.ce=ce;
	}
	@Override
	public void execute() {
		this.ce.on();
	}

}
