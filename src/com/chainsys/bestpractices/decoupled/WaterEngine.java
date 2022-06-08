package com.chainsys.bestpractices.decoupled;

public class WaterEngine implements IEngine {
	public void start() {
		System.out.println("Wate Engine Start");
	}

	public void stop() {
		System.out.println("Water Engine Stop");
	}
}
