package com.java.designpattern.facade;

/**
 * 
 * 剧院灯光
 * 
 * @author taomk 2016年8月22日 下午9:53:41
 */
public class TheaterLights {
	String description;
	
	public TheaterLights(String description) {
		this.description = description;
	}
  
	public void on() {
		System.out.println(description + " on");
	}
  
	public void off() {
		System.out.println(description + " off");
	}
  
	public void dim(int level) {
		System.out.println(description + " dimming to " + level  + "%");
	}
   
        public String toString() {
                return description;
        }
}
