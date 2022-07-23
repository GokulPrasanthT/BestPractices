package com.chainsys.bestpractices.refrences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class Lessons {
	public static void testA() {
		List<Phone> phoneList = new ArrayList<Phone>();
		phoneList.add(new Phone());
		phoneList.add(new Phone());
		phoneList.add(new Phone());
		phoneList.add(new Phone());
		phoneList.add(new Phone());
		phoneList.add(new Phone());
		phoneList.forEach(System.out::println);
	}

	public static void testB() {
		List<Long> phoneNumber = new ArrayList<Long>();
		phoneNumber.add(9790046288L);
		phoneNumber.add(9790046222L);
		phoneNumber.add(9790046244L);
		phoneNumber.add(9790046266L);
		phoneNumber.add(9790046234L);
		phoneNumber.add(8508086000L);
		// phoneNumber.forEach(Phone::makeCall);
		phoneNumber.forEach(Phone::print);// Using class to static method
		Phone iPhone = new Phone();
		phoneNumber.forEach(iPhone::makeaCall); // non static method -> object reference to call instance

	}
// Constructor Reference 
	public static void testC() {
		PhoneEmpty mobileA = Phone::new; // Constructor Reference 
		Phone firstPhone = mobileA.get(); // Factory Method
		firstPhone.makeaCall(9344074238L);
		PhoneWithNumberModel mobileB = Phone::new;
		Phone secondPhone = mobileB.get(9790046288L, "5G OPPO"); // Factory Method 
		secondPhone.makeaCall(9766632362L);
		System.out.println(secondPhone.toString());
		
		
	}
	public static void testD() {
		Map<Long,String> phoneMap = new HashMap<Long,String>();
		phoneMap.put(1234567890L, "Samsung");
		phoneMap.put(2469087657L, "OPPO");
		phoneMap.put(4357765878L, "VIVO");
		phoneMap.put(9589590595L, "OnePlus");
		phoneMap.put(2756485049L, "iPhone");
		// Map does not have stream because it is not a collection
		// poneMap.stream
//		Set<Map.Entry<Long,String>> entries = phoneMap.entrySet();
//		Stream<Map.Entry<Long,String>> entryStreams = entries.stream();
		Set<Long> longSet = phoneMap.keySet();
		Stream<Long> numberStream = phoneMap.keySet().stream();
		//Map has to be Convert to a Set and Stream method Should be called on a set
		Phone[] phoneArray = numberStream.map(Phone::new).toArray(Phone[]::new); // Constructor Reference of Phone
//		int count = phoneArray.length;
//		for(int i=0;i<count;i++) {
//			System.out.println(phoneArray[i]);
//		}
//		Stream<Phone> phoneA = phoneArray.stream();// You Can't  stream() Method call  in array Directly
 		// Creating a Streamfrom array
		Stream<Phone> phoneStream =Arrays.stream(phoneArray);
 		phoneStream.forEach(System.out::println);
		
	}
}
// Functional Interfaces for Non Parameterized Constructor 
interface PhoneEmpty{
	Phone get();
	
}
// functional Interface for Parameterized Constructor
interface PhoneWithNumberModel{
	Phone get(long num, String mod);
	
}
class Phone {
	private long number;
	private String model;

	public Phone() {
		System.out.println("Default Constructor");
	}
	public Phone(long number) {
		System.out.println("Single Parameterized Constructor"); 
		this.number=number;
		this.model="Not Assigned";
	}
	public Phone(long number, String model) {
		System.out.println("Parameterized Constructor");
		this.number = number;
		this.model = model;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void makeaCall(long number) {
		System.out.println("The Call Made To : " + number);
		;
	}

	public static void print(long number) {
		System.out.println("Print Document : " + number);
	}

	@Override
	public String toString() {
		return this.number + " " + this.model;
	}
}
