package com.java.designpattern.combining.ducks;

/**
 * 一只绿头鸭
 * 
 * @author taomk 2016年8月8日 下午10:02:27
 */
public class MallardDuck extends Duck {

	public MallardDuck() {
		// 呱呱叫的行为委托给具体的Quack实例
		quackBehavior = new Quack();
		// 飞行的行为委托给具体的FlyWithWings实例
		flyBehavior = new FlyWithWings();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.java.designpattern.adapter.ducks.Duck#display()
	 */
	@Override
	public void display() {
		System.out.println("I'm a real Mallard duck !");
	}

}
