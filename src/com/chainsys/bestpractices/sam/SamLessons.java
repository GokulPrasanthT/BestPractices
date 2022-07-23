package com.chainsys.bestpractices.sam;

import java.util.ArrayList;

// SAM - Single Abstract Method
interface IntegerFunction{
	Integer doOperations(int x, int y);
}
interface StringFunction{
	String execute(String s);
}
interface NumberFunction{
	Integer doOperations(int x, int y, int z);
}
class ImplementerA implements IntegerFunction {
	public Integer doOperations(int x, int y) {
		return x+y;
	}
	
}
public class SamLessons {
	public static void demoA() {
		IntegerFunction total = new ImplementerA();
		IntegerFunction add = (x,y)->x+y; //Lambda Expression
	// (x,y) this is parameter for the method
	//-> x+y this is implementation for the method
	// add is an implementation of doOprations method of interface IntegerFunction
		NumberFunction sum = (x,y,z) -> x+y+z;
		IntegerFunction multiply = (x,y)->x*y;
		IntegerFunction divide = (x,y)->x/y;
		Integer result = add.doOperations(2, 8);
		System.out.println("Result : " + result);
		result = total.doOperations(5,6);
		result = multiply.doOperations(10, 5);
		System.out.println("Result : " + result);
		result = divide.doOperations(20, 2);
		System.out.println("Result : " + result);
	//
		System.out.println(add.getClass().getName());
	}
	public static void demoB() {
		StringFunction upper = (s)->s.toUpperCase();
		StringFunction lower = (s)->s.toLowerCase();
		String result = upper.execute("Gokul Prasanth");
		System.out.println("Result : " + result);
		result = lower.execute("SANJAY");
		System.out.println("Result : " + result);
	}
	public static void demoC() {
		ArrayList<Integer> nos=new ArrayList<Integer>();
		nos.add(100);
		nos.add(20);
		nos.add(30);
		nos.add(25);
		nos.add(80);
		nos.forEach((n)-> System.out.println(n));
	}
	public static void demoD() {
		IntegerFunction getTotal=(x,y)->x+y;
		ArrayList<Integer> nos=new ArrayList<Integer>();
		nos.add(100);
		nos.add(20);
		nos.add(30);
		nos.add(25);
		nos.add(80);
		int i=100;
		nos.forEach((n)-> 
		{
			int result=0;
			result=getTotal.doOperations(n, i);
			System.out.println(" total: "+result);
		}
		);
	}
}
