package com.java.designpattern.factory.pizzafm;
/**
 * New York pizza店制作的Clam pizza
 * @author taomk
 * 2016年8月15日 上午9:42:43
 */
public class NYStyleClamPizza extends Pizza {

	public NYStyleClamPizza() {
		name = "NY Style Clam Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
 
		toppings.add("Grated Reggiano Cheese");
		toppings.add("Fresh Clams from Long Island Sound");
	}
}
