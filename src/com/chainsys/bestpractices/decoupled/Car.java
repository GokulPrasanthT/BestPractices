package com.chainsys.bestpractices.decoupled;
//Objects of this class can work only with any engine, And with any  wheel
//The car class is tightly decoupled from petrolEngine class, and steelWheel class
public class Car {
	private IEngine engine; // early bound with  engine interface
	private IWheel[] wheels; // early bound with  wheels interface
	// The type of engine , and the type of wheel will be injected to the car class
	// At runtime using the constructor ,thi is called as constructor based
	// Dependency injection
	public Car(IEngine engine , IWheel[] wheel) {
		this.engine = engine;
		this.wheels = wheel;
		
	}
	public void startcar() {
		engine.start();
		wheels[0].rotate();
		wheels[1].rotate();
		wheels[2].rotate();
		wheels[3].rotate();
	}
	public IWheel[] getWheels() {
	 return this.wheels;
}
}
