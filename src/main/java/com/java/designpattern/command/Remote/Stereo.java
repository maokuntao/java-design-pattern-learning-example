package com.java.designpattern.command.Remote;

/**
 * 音响
 * @author taomk
 * 2016年8月17日 下午9:54:20
 */
public class Stereo {
	String location;

	public Stereo(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println(location + " stereo is on");
	}

	public void off() {
		System.out.println(location + " stereo is off");
	}

	public void setCD() {
		System.out.println(location + " stereo is set for CD input");
	}

	public void setDVD() {
		System.out.println(location + " stereo is set for DVD input");
	}

	public void setRadio() {
		System.out.println(location + " stereo is set for Radio");
	}

	public void setVolume(int volume) {
		// code to set the volume
		// valid range: 1-11 (after all 11 is better than 10, right?)
		System.out.println(location + " Stereo volume set to " + volume);
	}
}
