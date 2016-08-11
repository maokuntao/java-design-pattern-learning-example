package com.java.designpattern.decorator.StarBuzz;

/**
 * 牛奶调料－装饰者
 * @author taomk
 * 2016年8月11日 下午4:24:43
 */
public class Milk extends CondimentDecorator {
	Beverage beverage;

	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	public double cost() {
		return .10 + beverage.cost();
	}
}
