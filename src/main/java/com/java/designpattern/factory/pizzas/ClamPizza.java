package com.java.designpattern.factory.pizzas;

/**
 * 蛤蜊披萨
 * 
 * @author taomk 2016年8月12日 下午2:43:17
 */
public class ClamPizza extends Pizza {
	public ClamPizza() {
		name = "Clam Pizza";
		dough = "Thin crust";
		sauce = "White garlic sauce";
		toppings.add("Clams");
		toppings.add("Grated parmesan cheese");
	}
}
