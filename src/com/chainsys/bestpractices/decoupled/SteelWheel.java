package com.chainsys.bestpractices.decoupled;

public class SteelWheel implements IWheel {
	public String location;
	public void rotate()
    {
        System.out.println("Steel Wheel rotating");
    }
    public void stopRotation()
    {
        System.out.println("Steel Wheel stopped");
    }
}
