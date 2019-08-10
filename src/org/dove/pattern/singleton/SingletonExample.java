package org.dove.pattern.singleton;

public class SingletonExample {

	private static volatile SingletonExample instance = null;
	
	private SingletonExample() {
		if (instance != null) {
			throw new RuntimeException("Use getInstance() method "
					+ " to create SingletonExample instance");
		}
	}
	
	public SingletonExample getInstance() {
		if (instance == null) {
			synchronized (SingletonExample.class) {
				if (instance == null) {
					instance = new SingletonExample();
				}
			}
		}
		return instance;
	}
}
