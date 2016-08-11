package com.java.designpattern.decorator.StarBuzz;

/**
 * 深焙☕
 * @author taomk
 * 2016年8月11日 下午4:20:54
 */
public class DarkRoast extends Beverage {
	
	public DarkRoast(){
		description = "Dark Roast Coffee";
	}

	/* (non-Javadoc)
	 * @see com.java.designpattern.decorator.StarBuzz.Baverage#cost()
	 */
	@Override
	public double cost() {
		return .87;
	}

}
