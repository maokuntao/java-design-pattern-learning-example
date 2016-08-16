package com.java.designpattern.singleton.subclass.test;

import com.java.designpattern.singleton.subclass.CoolerSingleton;
import com.java.designpattern.singleton.subclass.HotterSingleton;
import com.java.designpattern.singleton.subclass.Singleton;

/**
 * 单例模式在有子类继承的情况下的测试结果
 * @author taomk
 * 2016年8月16日 下午9:27:40
 */
public class SingletonSubclassTest {
	
	public static void main(String[] args) {
		
		Singleton foo = CoolerSingleton.getInstance();
		Singleton bar = HotterSingleton.getInstance();
		System.out.println(foo);
		System.out.println(bar);
 	}
}
