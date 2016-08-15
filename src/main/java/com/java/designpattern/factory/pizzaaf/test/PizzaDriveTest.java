package com.java.designpattern.factory.pizzaaf.test;

import com.java.designpattern.factory.pizzaaf.ChicagoPizzaStore;
import com.java.designpattern.factory.pizzaaf.NYPizzaStore;
import com.java.designpattern.factory.pizzaaf.Pizza;
import com.java.designpattern.factory.pizzaaf.PizzaStore;

/**
 * 披萨工厂测试类
 * 
 * @author taomk 2016年8月15日 下午4:24:05
 */
public class PizzaDriveTest {
	
	public static void main(String[] args) {
		
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();

		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza + "\n");

		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza + "\n");

		pizza = nyStore.orderPizza("clam");
		System.out.println("Ethan ordered a " + pizza + "\n");

		pizza = chicagoStore.orderPizza("clam");
		System.out.println("Joel ordered a " + pizza + "\n");

		pizza = nyStore.orderPizza("pepperoni");
		System.out.println("Ethan ordered a " + pizza + "\n");

		pizza = chicagoStore.orderPizza("pepperoni");
		System.out.println("Joel ordered a " + pizza + "\n");

		pizza = nyStore.orderPizza("veggie");
		System.out.println("Ethan ordered a " + pizza + "\n");

		pizza = chicagoStore.orderPizza("veggie");
		System.out.println("Joel ordered a " + pizza + "\n");
	}
}
