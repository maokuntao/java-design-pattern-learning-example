package com.java.designpattern.decorator.StarBuzz;

/**
 * 综合☕️
 * @author taomk
 * 2016年8月11日 下午4:17:51
 */
public class HouseBlend extends Beverage {
	
	public HouseBlend(){
		description = "House Blend Coffee";
	}

	/* (non-Javadoc)
	 * @see com.java.designpattern.decorator.StarBuzz.Baverage#cost()
	 */
	@Override
	public double cost() {
		return .99;
	}

}
