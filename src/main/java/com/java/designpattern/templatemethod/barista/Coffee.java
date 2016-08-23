package com.java.designpattern.templatemethod.barista;

/**
 * 煮咖啡
 * @author taomk
 * 2016年8月23日 下午7:58:16
 */
public class Coffee extends CaffeineBeverage {

	@Override
	void brew() {
		System.out.println("Dripping Coffee through filter");
	}

	@Override
	void addCondiments() {
		System.out.println("Adding Sugar and Milk");
	}

}
