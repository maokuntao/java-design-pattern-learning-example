package com.java.designpattern.iterator.dinermerge;

/**
 * 餐厅菜单
 * 
 * @author taomk 2016年8月25日 下午7:10:35
 */
public class DinerMenu implements Menu{

	private static final int MAX_ITEMS = 6;
	private int numberOfItems = 0;
	MenuItem[] menuItems;

	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
		addItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
		addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
		addItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29);
		addItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05);
		addItem("Steamed Veggies and Brown Rice", "Steamed vegetables over brown rice", true, 3.99);
		addItem("Pasta", "Spaghetti with Marinara Sauce, and a slice of sourdough bread", true, 3.89);
	}

	public void addItem(String name, String description, boolean vagetarian, double price){
		MenuItem item = new MenuItem(name, description, vagetarian, price);
		if(numberOfItems >= MAX_ITEMS){
			System.err.println("Sorry , menu is full. ");
		}else{
			menuItems[numberOfItems] = item;
			numberOfItems ++;
		}
	}
	
	public MenuItem[] getMenuItmes(){
		return menuItems;
	}
	
	@Override
	public Iterator createIterator(){
		return new DinerMenuIterator(menuItems);
	}
}
