package com.java.designpattern.facade;

/**
 * 
 * 荧幕
 * 
 * @author taomk 2016年8月22日 下午9:53:41
 */
public class Screen {
	String description;
	
	public Screen(String description) {
		this.description = description;
	}
 
	public void up() {
		System.out.println(description + " going up");
	}
 
	public void down() {
		System.out.println(description + " going down");
	}
 
  
        public String toString() {
                return description;
        }
}
