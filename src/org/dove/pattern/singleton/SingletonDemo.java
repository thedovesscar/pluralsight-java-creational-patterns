package org.dove.pattern.singleton;

public class SingletonDemo {

	public static void main(String[] args) {
		
		SingletonExample singleton = SingletonExample.getInstance();
		
		System.out.print("This is the original call to the Constructor: ");
		System.out.println(singleton);
		
		SingletonExample secondSingleton = SingletonExample.getInstance();
		
		System.out.print("This is the result of the secondary call to the Constructor: ");
		System.out.println(secondSingleton);
		
	}

}
