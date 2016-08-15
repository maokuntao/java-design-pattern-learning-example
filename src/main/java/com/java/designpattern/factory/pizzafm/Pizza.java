package com.java.designpattern.factory.pizzafm;

import java.util.ArrayList;

/**
 * Pizza基础类，定义了pizza的一些基本属性和制作过程
 * 
 * @author taomk 2016年8月15日 上午9:24:03
 */
public abstract class Pizza {

	// 名称
	String name;
	// 面团
	String dough;
	// 调味汁
	String sauce;

	// 配料表
	ArrayList<String> toppings = new ArrayList<String>();

	/**
	 * 准备制作
	 */
	void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings: ");
		for (int i = 0; i < toppings.size(); i++) {
			System.out.println("   " + toppings.get(i));
		}
	}

	/**
	 * 烘焙
	 */
	void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	/**
	 * 切块
	 */
	void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	/**
	 * 装箱
	 */
	void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	public String getName() {
		return name;
	}

	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		display.append(dough + "\n");
		display.append(sauce + "\n");
		for (int i = 0; i < toppings.size(); i++) {
			display.append((String) toppings.get(i) + "\n");
		}
		return display.toString();
	}
}
