package com.design.command;

public class MusicSystem implements ConsumerElectronics {

	@Override
	public void on() {
		System.out.println("turning on MusicSystem");
		
	}

	@Override
	public void off() {
		System.out.println("turning off MusicSystem");
		
	}

}
