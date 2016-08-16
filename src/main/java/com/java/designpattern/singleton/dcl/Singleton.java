package com.java.designpattern.singleton.dcl;

/**
 * 单例模式－双重检查锁(double checked locking)
 * @author taomk
 * 2016年8月16日 下午9:27:40
 */
public class Singleton {

//	This implementation of Singleton Pattern is not guaranteed prior to Java5
	private static volatile Singleton uniqueInstance = null;
	
	private Singleton(){}
	
	public static Singleton getInstance(){
		if(uniqueInstance == null){
			synchronized(Singleton.class){
				if(uniqueInstance == null){
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}
}
