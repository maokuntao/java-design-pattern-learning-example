package com.java.designpattern.factory.pizzas.test;

import com.java.designpattern.factory.pizzas.Pizza;
import com.java.designpattern.factory.pizzas.PizzaStore;
import com.java.designpattern.factory.pizzas.SimplePizzaFactory;

/**
 * pizza店测试类
 * 
 * @author taomk 2016年8月12日 下午3:13:16
 */
public class PizzaDriveTest {

	public static void main(String[] args) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(factory);

		Pizza pizza = store.orderPizza("cheese");
		System.out.println("We ordered a " + pizza.getName() + "\n");

		pizza = store.orderPizza("veggie");
		System.out.println("We ordered a " + pizza.getName() + "\n");
	}

}
