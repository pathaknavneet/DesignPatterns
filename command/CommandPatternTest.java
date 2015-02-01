package com.design.command;

import java.util.ArrayList;
import java.util.List;

public class CommandPatternTest {

	public static void main(String[] args) {
		// OnCommand is instantiated based on active device supplied by Remote
				ConsumerElectronics ce = UniversalRemote.getActiveDevice();
				OnCommand onCommand = new OnCommand(ce);
				Button onButton = new Button(onCommand);
				onButton.click();

				Television tv = new Television();
				MusicSystem ss = new MusicSystem();
				List all = new ArrayList();
				all.add(tv);
				all.add(ss);
				OffCommand off = new OffCommand(all);
				Button offButton= new Button(off);
				offButton.click();


	}

}
