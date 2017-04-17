package com.java.designpattern.singleton.enumer.test;

import com.java.designpattern.singleton.enumer.Singleton;

/**
 * 单例模式－枚举实现方式的测试类
 * @author taomk
 * 2016年8月16日 下午10:10:13
 */
public class SingletonEnumTest {

	public static void main(String[] args) {
		
		int i = 0;
		while(i<500){
			
			// Enum创建对象
//			Singleton s = new Singleton();
			Runnable r = () -> System.out.println(Thread.currentThread().getName() + " : " + Singleton.UNIQUEINSTANCE.hashCode());
			
			new Thread(r).start();
			
			i++;
		}
	}

}
