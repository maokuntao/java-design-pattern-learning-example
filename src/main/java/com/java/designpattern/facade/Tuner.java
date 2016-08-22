package com.java.designpattern.facade;

/**
 * 
 * 调音器
 * 
 * @author taomk 2016年8月22日 下午9:53:41
 */
public class Tuner {
	String description;
	Amplifier amplifier;
	double frequency;
	
	public Tuner(String description, Amplifier amplifier) {
		this.description = description;
	}
 
	public void on() {
		System.out.println(description + " on");
	}
 
	public void off() {
		System.out.println(description + " off");
	}
 
	public void setFrequency(double frequency) {
		System.out.println(description + " setting frequency to " + frequency);
		this.frequency = frequency;
	}
 
	public void setAm() {
		System.out.println(description + " setting AM mode");
	}
 
	public void setFm() {
		System.out.println(description + " setting FM mode");
	}
  
        public String toString() {
                return description;
        }
}
