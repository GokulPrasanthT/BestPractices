package com.chainsys.bestpractices.decoupled;

public class DieselEngine implements IEngine {
	public void start() {
		System.out.println("Diesel Engine Started");
	}

	public void stop() {
		System.out.println("Diesel Engine Stopped");
	}

}
