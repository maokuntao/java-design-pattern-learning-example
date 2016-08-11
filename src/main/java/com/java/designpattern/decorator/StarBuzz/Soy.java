package com.java.designpattern.decorator.StarBuzz;

/**
 * 豆浆调料－装饰者
 * @author taomk
 * 2016年8月11日 下午4:24:43
 */
public class Soy extends CondimentDecorator {
	Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	public double cost() {
		return .15 + beverage.cost();
	}
}
