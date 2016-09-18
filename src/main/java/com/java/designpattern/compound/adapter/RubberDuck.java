package com.java.designpattern.compound.adapter;

/**
 * 橡胶鸭
 *
 * @author taomk
 * 2016年9月18日 下午7:38:12
 */
public class RubberDuck implements Quackable {
	public void quack() {
		System.out.println("Squeak");
	}
}
