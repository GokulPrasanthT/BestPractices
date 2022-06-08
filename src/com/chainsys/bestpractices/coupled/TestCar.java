package com.chainsys.bestpractices.coupled;

public class TestCar extends PetrolEngine {
	public static void main(String args[]) {
		Car car = new Car();
		car.startcar();
//PetrolEngine pe = new PetrolEngine();
//pe.start();
		SteelWheel[] carWheels = car.getWheels();
		int length = carWheels.length;
		for (int i = 0; i < length; i++) {
			System.out.println(carWheels[i].location);
		}
	}
}