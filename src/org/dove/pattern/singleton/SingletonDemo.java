package org.dove.pattern.singleton;

public class SingletonDemo {

	public static void main(String[] args) {
		
		SingletonExample singleton = SingletonExample.getInstance();
		
		System.out.println(singleton);
		
		SingletonExample secondSingleton = SingletonExample.getInstance();
		
		System.out.println(secondSingleton);

	}

}
