package com.java.designpattern.command.SimpleRemote;

/**
 * 电灯对象
 * 
 * @author taomk 2016年8月17日 下午9:56:26
 */
public class Light {
	
	/**
	 *打开电灯 
	 */
	public void on() {
		System.out.println("Light is on");
	}

	/**
	 * 关闭电灯
	 */
	public void off() {
		System.out.println("Light is off");
	}
}
