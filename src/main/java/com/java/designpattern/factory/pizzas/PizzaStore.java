package com.java.designpattern.factory.pizzas;

/**
 * @author taomk 2016年8月12日 下午2:53:00
 */
public class PizzaStore {

	SimplePizzaFactory factory = null;

	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}

	/**
	 * 处理订单
	 * @param type
	 * @return
	 */
	public Pizza orderPizza(String type) {
		Pizza pizza = factory.createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
