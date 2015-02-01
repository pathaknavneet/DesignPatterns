package com.design.command;

public class Television implements  ConsumerElectronics{

	@Override
	public void on() {
		System.out.println("switching TV on");
	}

	@Override
	public void off() {

		System.out.println("switching tv off");
	}

}
