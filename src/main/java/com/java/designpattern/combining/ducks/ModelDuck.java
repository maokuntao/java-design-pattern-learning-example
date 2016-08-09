package com.java.designpattern.combining.ducks;

/**
 * 模型鸭
 * 
 * @author taomk 2016年8月8日 下午10:18:24
 */
public class ModelDuck extends Duck {

	public ModelDuck() {
		// 模型鸭不会飞
		flyBehavior = new FlyNoway();
		// 模型鸭会叫
		quackBehavior = new Quack();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.java.designpattern.adapter.ducks.Duck#display()
	 */
	@Override
	public void display() {
		System.out.println("I'm a model duck !");
	}

}
