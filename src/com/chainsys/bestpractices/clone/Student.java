package com.chainsys.bestpractices.clone;

public class Student implements Cloneable {
	public String name;
	public int age;
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}

