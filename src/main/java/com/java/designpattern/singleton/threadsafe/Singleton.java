package com.java.designpattern.singleton.threadsafe;

/**
 * 经典单例模式－线程安全
 * 
 * @author taomk 2016年8月16日 下午3:11:59
 */
public class Singleton {

	private static Singleton uniqueInstance;

	private Singleton() {
	}

	/**
	 * 通过添加synchronized关键字，迫使每一个线程在进入getInstance方法之前，都必须先等待其他线程离开该方法。<br>
	 * 也就是说，不会有两个线程可以同时进入该方法。
	 * @return uniqueInstance
	 */
	public synchronized static Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
}
