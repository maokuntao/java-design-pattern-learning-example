package com.java.designpattern.decorator.StarBuzz;
 
/**
 * 奶泡调料－装饰者
 * @author taomk
 * 2016年8月11日 下午4:24:43
 */
public class Whip extends CondimentDecorator {
	Beverage beverage;
 
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}
 
	public double cost() {
		return .10 + beverage.cost();
	}
}
