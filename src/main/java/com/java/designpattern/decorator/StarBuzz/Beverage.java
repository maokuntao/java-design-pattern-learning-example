package com.java.designpattern.decorator.StarBuzz;

/**
 * 基础饮料类🍶
 * @author taomk
 * 2016年8月11日 下午2:52:08
 */
public abstract class Beverage {

	String description = "Unknown Beverage";
	
	public String getDescription(){
		return this.description;
	}
	
	/**
	 * @return 价格
	 */
	public abstract double cost(); 
}
