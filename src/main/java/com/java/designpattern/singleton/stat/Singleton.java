package com.java.designpattern.singleton.stat;

/**
 * 经典的单例模式－饿汉模式
 * @author taomk
 * 2016年8月16日 下午9:21:26
 */
public class Singleton {

	private static Singleton uniqueInstance = new Singleton();
	
	public static Singleton getInstance(){
		return uniqueInstance;
	}
}
