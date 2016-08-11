package com.java.designpattern.decorator.StarBuzz;

/**
 * @author taomk
 * 2016年8月11日 下午4:22:53
 */
public class Decaf extends Beverage {
	
	public Decaf(){
		description = "Decaf";
	}

	/* (non-Javadoc)
	 * @see com.java.designpattern.decorator.StarBuzz.Baverage#cost()
	 */
	@Override
	public double cost() {
		return 1.05;
	}

}
