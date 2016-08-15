package com.java.designpattern.factory.pizzafm;

/**
 * Chicago pizza店制作的Cheese pizza
 * @author taomk
 * 2016年8月15日 上午9:38:59
 */
public class ChicagoStyleCheesePizza extends Pizza {

	public ChicagoStyleCheesePizza() { 
		name = "Chicago Style Deep Dish Cheese Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
	}
	
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
