package com.java.designpattern.singleton.enumer;

/**
 * 单例模式－枚举方式
 * 
 * @author taomk
 * 2016年8月16日 下午10:05:43
 */
public enum Singleton {

	UNIQUEINSTANCE;
	
	public void whateverMethod(){
		System.out.println("Other method!");
	}
}
