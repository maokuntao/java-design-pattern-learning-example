package com.java.designpattern.singleton.subclass;

/**
 * 单例模式在有子类继承的情况
 * @author taomk
 * 2016年8月16日 下午9:27:40
 */
public class Singleton {
	protected static Singleton uniqueInstance;
 
	// other useful instance variables here
 
	protected Singleton() {}
 
	public static synchronized Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
 
	// other useful methods here
}
