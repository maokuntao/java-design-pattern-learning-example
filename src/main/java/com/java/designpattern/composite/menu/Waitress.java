package com.java.designpattern.composite.menu;

/**
 * 女侍者
 * 
 * @author taomk
 * 2016年8月31日 下午9:56:7
 *
 */
public class Waitress {

	MenuComponent allMenus;
	 
	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}
 
	public void printMenu() {
		allMenus.print();
	}
}
