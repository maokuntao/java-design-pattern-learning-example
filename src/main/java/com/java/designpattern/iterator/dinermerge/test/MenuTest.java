package com.java.designpattern.iterator.dinermerge.test;

import com.java.designpattern.iterator.dinermerge.*;

/**
 * 测试类
 * @author taomk
 * 2016年8月25日 下午8:31:34
 */
public class MenuTest {

	public static void main(String[] args) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
 
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
 
		waitress.printMenu();
		waitress.printVegetarianMenu();

		System.out.println("\nCustomer asks, is the Hotdog vegetarian?");
		System.out.print("Waitress says: ");
		if (waitress.isItemVegetarian("Hotdog")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		System.out.println("\nCustomer asks, are the Waffles vegetarian?");
		System.out.print("Waitress says: ");
		if (waitress.isItemVegetarian("Waffles")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
