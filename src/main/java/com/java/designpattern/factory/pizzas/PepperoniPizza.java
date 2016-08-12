package com.java.designpattern.factory.pizzas;

/**
 * 意大利腊肉肠披萨
 * 
 * @author taomk 2016年8月12日 下午2:44:22
 */
public class PepperoniPizza extends Pizza {
	public PepperoniPizza() {
		name = "Pepperoni Pizza";
		dough = "Crust";
		sauce = "Marinara sauce";
		toppings.add("Sliced Pepperoni");
		toppings.add("Sliced Onion");
		toppings.add("Grated parmesan cheese");
	}
}
