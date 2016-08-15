package com.java.designpattern.factory.pizzafm;

/**
 * Pizza店
 * 
 * @author taomk 2016年8月15日 上午9:34:03
 */
public abstract class PizzaStore {

	/**
	 * 制造pizza（由于不同pizza店的制作pizza方式不一，所以需要每个具体的pizza店自己来实现制作pizza的过程）
	 * 
	 * @param item
	 *            pizza类型
	 * @return <code>com.java.designpattern.factory.pizzafm.Pizza</code>
	 */
	abstract Pizza createPizza(String item);

	/**
	 * pizza订单
	 * 
	 * @param type
	 *            pizza类型
	 * @return 一个pizza成品
	 */
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
