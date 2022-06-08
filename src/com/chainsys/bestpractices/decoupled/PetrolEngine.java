package com.chainsys.bestpractices.decoupled;

public class PetrolEngine   implements IEngine{

public void start() {
	System.out.println("Petrol Engine Started");
}
public void stop() {
	System.out.println("Petrol Engine Stopped");
}
}

