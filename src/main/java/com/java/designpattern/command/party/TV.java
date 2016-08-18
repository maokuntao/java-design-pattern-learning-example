package com.java.designpattern.command.party;

/**
 * 电视
 * @author taomk
 * 2016年8月18日 下午3:32:29
 */
public class TV {
	String location;
	int channel;

	public TV(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println(location + " TV is on");
	}

	public void off() {
		System.out.println(location + " TV is off");
	}

	public void setInputChannel() {
		this.channel = 3;
		System.out.println(location + " TV channel is set for DVD");
	}
}
