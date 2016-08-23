package com.java.designpattern.templatemethod.barista;

/**
 * 抽象咖啡和茶之后形成的咖啡因饮料
 * 
 * @author taomk 2016年8月23日 下午7:51:45
 */
public abstract class CaffeineBeverage {

	// 将煮咖啡和煮茶两个活动抽象出来，形成的共有的步骤。
	// 不希望子类来重写此方法，所以设置为final
	public final void prepareRecipe() {
		// 注水
		boilWater();
		// 冲泡茶叶／咖啡
		brew();
		// 倒入杯子
		pourInCup();
		// 添加佐料
		addCondiments();
	}

	abstract void brew();

	abstract void addCondiments();

	void boilWater() {
		System.out.println("Boiling water. ");
	}

	void pourInCup() {
		System.out.println("Pouring into cup. ");
	}
}
