package com.chainsys.bestpractices.coupled;
//Objects of this class can work only with petrol engine  steel wheel
//The car class is tightly coupled from petrolEngine class, and steelWheel class
public class Car {
	private PetrolEngine engine; // early bound with petrol engine
	private SteelWheel[] wheels; // early bound with steel wheels
	
	public Car() {
		engine = new PetrolEngine();
		wheels = new SteelWheel[4]; // Creating array of four wheels
		wheels[0] = new SteelWheel();
		wheels[0].location="front left";
		wheels[1]= new SteelWheel();
		wheels[1].location="front right";
		wheels[2] = new SteelWheel();
		wheels[2].location="Back left";
		wheels[3] = new SteelWheel();
		wheels[3].location="Back right";
	}
	public Car(PetrolEngine engine , SteelWheel[] wheel) {
		this.engine = engine;
		wheels = new SteelWheel[4]; // Creating array of four wheels
		this.wheels = wheel;
		wheels[0].location="front left";
		wheels[1].location="front right";
		wheels[2].location="Back left";
		wheels[3].location="Back right";
	}
	public void startcar() {
		engine.start();
		wheels[0].rotate();
		wheels[1].rotate();
		wheels[2].rotate();
		wheels[3].rotate();
	}
	public SteelWheel[] getWheels() {
	 return this.wheels;
}
}
