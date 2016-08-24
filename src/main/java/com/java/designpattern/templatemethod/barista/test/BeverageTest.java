package com.java.designpattern.templatemethod.barista.test;

import com.java.designpattern.templatemethod.barista.*;

/**
 * 饮料测试类
 * @author taomk
 * 2016年8月23日 下午8:00:24
 */
public class BeverageTest {

	public static void main(String[] args) {
		
		System.out.println("Making tea... ");
		Tea tea = new Tea();
		tea.prepareRecipe();
		
		System.out.println("Making coffee... ");
		Coffee coffee = new Coffee();
		coffee.prepareRecipe();
		
		TeaWithHook teaHook = new TeaWithHook();
		CoffeeWithHook coffeeHook = new CoffeeWithHook();
 
		System.out.println("\nMaking tea...");
		teaHook.prepareRecipe();
 
		System.out.println("\nMaking coffee...");
		coffeeHook.prepareRecipe();
		
	}

}
