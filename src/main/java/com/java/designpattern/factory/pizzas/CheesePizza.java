package com.java.designpattern.factory.pizzas;

/**
 * 芝士披萨
 * @author taomk
 * 2016年8月12日 下午2:41:34
 */
public class CheesePizza extends Pizza {

	public CheesePizza() {
		name = "Cheese Pizza";
		dough = "Regular Crust";
		sauce = "Marinara Pizza Sauce";
		toppings.add("Fresh Mozzarella");
		toppings.add("Parmesan");
	}
	
}
