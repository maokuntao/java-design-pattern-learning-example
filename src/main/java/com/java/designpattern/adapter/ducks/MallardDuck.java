package com.java.designpattern.adapter.ducks;

/**
 * 绿头鸭
 * @author taomk
 * 2016年8月19日 上午10:08:25
 */
public class MallardDuck implements Duck {

	@Override
	public void quack() {
		System.out.println("Quack");
	}

	@Override
	public void fly() {
		System.out.println("I'm flying");
	}

}
