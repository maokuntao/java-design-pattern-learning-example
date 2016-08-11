package com.java.designpattern.decorator.StarBuzz;

/**
 * 浓缩☕
 * @author taomk
 * 2016年8月11日 下午4:15:55
 */
public class Espresso extends Beverage {
	
	public Espresso(){
		description = "Espresso";
	}

	/* (non-Javadoc)
	 * @see com.java.designpattern.decorator.StarBuzz.Baverage#cost()
	 */
	@Override
	public double cost() {
		return 1.99;
	}

}
