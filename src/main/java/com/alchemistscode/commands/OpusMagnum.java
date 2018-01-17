package com.alchemistscode.commands;

import static picocli.CommandLine.*;

@Command(name="opus", header="Opus Magnum")
public class OpusMagnum implements Runnable{

	@Option(names = {"-v", "--version"}, versionHelp = true, description = "display version info")
	boolean versionInfoRequested;

	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
