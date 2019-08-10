package org.dove.pattern.singleton;

public class SingletonExample {

	private static SingletonExample instance = new SingletonExample();
	
	private SingletonExample() {
		
	}
	
	public SingletonExample getInstance() {
		return instance;
	}
}
