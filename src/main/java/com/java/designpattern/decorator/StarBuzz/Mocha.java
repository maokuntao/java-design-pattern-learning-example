package com.java.designpattern.decorator.StarBuzz;

/**
 * 摩卡调料－装饰者
 * @author taomk
 * 2016年8月11日 下午4:24:43
 */
public class Mocha extends CondimentDecorator {
	
	Beverage beverage;
	
	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}

	/* (non-Javadoc)
	 * @see com.java.designpattern.decorator.StarBuzz.CondimentDecorator#getDescription()
	 */
	@Override
	public String getDescription() {
		return beverage.getDescription() + " , Mocha";
	}

	/* (non-Javadoc)
	 * @see com.java.designpattern.decorator.StarBuzz.Beverage#cost()
	 */
	@Override
	public double cost() {
		return 0.20 + beverage.cost();
	}

}
