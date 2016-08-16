package com.java.designpattern.singleton.subclass;

/**
 * 单例模式子类1
 * @author taomk
 * 2016年8月16日 下午9:27:40
 */
public class CoolerSingleton extends Singleton {
	// useful instance variables here
	protected static Singleton uniqueInstance;
 
	private CoolerSingleton() {
		super();
	}
 
	// useful methods here
}
