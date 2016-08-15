package com.java.designpattern.factory.pizzaaf;

/**
 * 披萨店
 * @author taomk
 * 2016年8月15日 下午4:08:55
 */
public abstract class PizzaStore {
 
	protected abstract Pizza createPizza(String item);
 
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
