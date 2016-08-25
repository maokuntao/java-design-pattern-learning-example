package com.java.designpattern.iterator.dinermerge;

import java.util.ArrayList;
import java.util.List;

/**
 * 煎饼屋菜单
 * @author taomk
 * 2016年8月25日 下午7:25:38
 */
public class PancakeHouseMenu implements Menu {

	private ArrayList<MenuItem> menuItems;
	
	public PancakeHouseMenu(){
		menuItems = new ArrayList<MenuItem>();
		addItem("K&B's Pancake Breakfast", 
				"Pancakes with scrambled eggs, and toast", 
				true,
				2.99);
	 
			addItem("Regular Pancake Breakfast", 
				"Pancakes with fried eggs, sausage", 
				false,
				2.99);
	 
			addItem("Blueberry Pancakes",
				"Pancakes made with fresh blueberries, and blueberry syrup",
				true,
				3.49);
	 
			addItem("Waffles",
				"Waffles, with your choice of blueberries or strawberries",
				true,
				3.59);
		
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem item = new MenuItem(name , description , vegetarian , price);
		menuItems.add(item);
	}

	public List<MenuItem> getMenuItems(){
		return menuItems;
	}
	
	@Override
	public Iterator createIterator() {
		return new PancakeHouseMenuIterator(menuItems);
	}
	
	public String toString() {
		return "Objectville Pancake House Menu";
	}

}
