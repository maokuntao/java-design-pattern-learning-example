package com.java.designpattern.singleton.subclass;

/**
 * 单例模式－双重检查锁(double checked locking)
 * @author taomk
 * 2016年8月16日 下午9:27:40
 */
public class SingletonTestDrive {
	public static void main(String[] args) {
		Singleton foo = CoolerSingleton.getInstance();
		Singleton bar = HotterSingleton.getInstance();
		System.out.println(foo);
		System.out.println(bar);
 	}
}
