package com.java.designpattern.templatemethod.barista;

/**
 * 煮茶
 * @author taomk
 * 2016年8月23日 下午7:59:03
 */
public class Tea extends CaffeineBeverage {

	@Override
	void brew() {
		System.out.println("Steeping the tea");
	}

	@Override
	void addCondiments() {
		System.out.println("Adding Lemon");
	}

}
