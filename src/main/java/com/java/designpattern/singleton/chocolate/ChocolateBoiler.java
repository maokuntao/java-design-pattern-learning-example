package com.java.designpattern.singleton.chocolate;

/**
 * 使用经典单例模式生成一个ChocolateBoiler（巧克力锅炉）单例
 * @author taomk
 * 2016年8月16日 下午2:43:30
 */
public class ChocolateBoiler {

	private boolean empty;// The boiler is empty
	private boolean boiled;// The boiler has been boiled
	
	private static ChocolateBoiler uniqueInstance;
	
	private ChocolateBoiler(){
		
	}
	
	public static ChocolateBoiler getInstance(){
		if(uniqueInstance == null){
			System.out.println("Creating unique instance of Chocolate Boiler");
			uniqueInstance = new ChocolateBoiler();
		}
		System.out.println("Returning instance of Chocolate Boiler");
		return uniqueInstance;
	}
	
	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
			// fill the boiler with a milk/chocolate mixture
		}
	}
 
	public void drain() {
		if (!isEmpty() && isBoiled()) {
			// drain the boiled milk and chocolate
			empty = true;
		}
	}
 
	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			// bring the contents to a boil
			boiled = true;
		}
	}
  
	public boolean isEmpty() {
		return empty;
	}
 
	public boolean isBoiled() {
		return boiled;
	}
	
}
