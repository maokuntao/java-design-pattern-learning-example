package com.java.designpattern.factory.pizzaaf;

/**
 * 披萨原料配送站，负责配送各式披萨原料
 * @author taomk
 * 2016年8月15日 下午4:08:55
 */
public interface PizzaIngredientFactory {
 
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
 
}
