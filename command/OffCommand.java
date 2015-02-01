package com.design.command;

import java.util.List;

public class OffCommand implements Command {
	private List<ConsumerElectronics> list;
	 public OffCommand(List<ConsumerElectronics> list) {
	 this.list=list;
	 }
	@Override
	public void execute() {
		for(ConsumerElectronics ce:list)
		ce.off();
	}

}
