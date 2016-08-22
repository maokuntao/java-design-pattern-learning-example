package com.java.designpattern.facade;

/**
 * 
 * 爆米花机
 * 
 * @author taomk 2016年8月22日 下午9:53:41
 */
public class PopcornPopper {
	String description;
	
	public PopcornPopper(String description) {
		this.description = description;
	}
 
	public void on() {
		System.out.println(description + " on");
	}
 
	public void off() {
		System.out.println(description + " off");
	}

	public void pop() {
		System.out.println(description + " popping popcorn!");
	}
 
  
        public String toString() {
                return description;
        }
}
