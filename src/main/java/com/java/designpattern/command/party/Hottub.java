package com.java.designpattern.command.party;

/**
 * 浴室
 * @author taomk
 * 2016年8月18日 下午3:32:29
 */
public class Hottub {
	boolean on;
	int temperature;

	public Hottub() {
	}

	public void on() {
		on = true;
	}

	public void off() {
		on = false;
	}

	public void circulate() {
		if (on) {
			System.out.println("Hottub is bubbling!");
		}
	}

	public void jetsOn() {
		if (on) {
			System.out.println("Hottub jets are on");
		}
	}

	public void jetsOff() {
		if (on) {
			System.out.println("Hottub jets are off");
		}
	}

	public void setTemperature(int temperature) {
		if (temperature > this.temperature) {
			System.out.println("Hottub is heating to a steaming " + temperature + " degrees");
		}
		else {
			System.out.println("Hottub is cooling to " + temperature + " degrees");
		}
		this.temperature = temperature;
	}
}
