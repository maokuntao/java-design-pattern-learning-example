package com.java.designpattern.templatemethod.barista;

/**
 * 带有钩子的咖啡因饮料
 * @author taomk
 * 2016年8月24日 上午10:31:52
 */
public abstract class CaffeineBeverageWithHook {

	public void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		
//		由客户决定是否需要添加配料
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}
	
	abstract void brew();
	 
	abstract void addCondiments();
 
	void boilWater() {
		System.out.println("Boiling water");
	}
 
	void pourInCup() {
		System.out.println("Pouring into cup");
	}
 
//	此处即为一个钩子，可以由子类来覆盖此方法，来决定是否需要添加配料
	boolean customerWantsCondiments() {
		return true;
	}
}
