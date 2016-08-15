package com.java.designpattern.factory.pizzafm;
/**
 * New York pizza店制作的Cheese pizza
 * @author taomk
 * 2016年8月15日 上午9:42:43
 */
public class NYStyleCheesePizza extends Pizza {

	public NYStyleCheesePizza() { 
		name = "NY Style Sauce and Cheese Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
 
		toppings.add("Grated Reggiano Cheese");
	}
}
