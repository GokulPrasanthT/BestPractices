package com.chainsys.bestpractices.decoupled;

//Objects of this class can work only with any engine, And with any  wheel
//The car class is tightly decoupled from petrolEngine class, and steelWheel class
public class Bike {
	private IEngine engine; // early bound with  engine interface
	public IEngine getEngine() {
		return engine;
	}
	public void setEngine(IEngine engine) {
		this.engine = engine;
	}
	// The type of Wheel , will be injected to the Bike class
		// At runtime using the Setter Method ,this is called as Setter based
		// Dependency injection

	public void setWheels(IWheel[] wheels) {
		this.wheels = wheels;
	}
	private IWheel[] wheels; // early bound with  wheels interface
	// The type of engine , will be injected to the Bike class
	// At runtime using the Setter Method ,this is called as Setter based
	// Dependency injection

	// public Bike (Iengine engine, Iwheel[] wheel) {
	// this.engine engine; 
	// this.Wheels wheel;
	
	public void startBike() {
		engine.start();
		wheels[0].rotate();
		wheels[1].rotate();
		
	}
	public IWheel[] getWheels() {
	 return this.wheels;
}
}
