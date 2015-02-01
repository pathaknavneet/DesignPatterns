package com.design.command;

public class UniversalRemote {
	public static ConsumerElectronics getActiveDevice() {
		Television tv = new Television();
		return tv;
	}
}

