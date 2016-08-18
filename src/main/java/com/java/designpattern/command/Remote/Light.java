package com.java.designpattern.command.Remote;

/**
 * 电灯
 * @author taomk
 * 2016年8月17日 下午9:54:20
 */
public class Light {
	String location = "";

	public Light(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println(location + " light is on");
	}

	public void off() {
		System.out.println(location + " light is off");
	}
}
