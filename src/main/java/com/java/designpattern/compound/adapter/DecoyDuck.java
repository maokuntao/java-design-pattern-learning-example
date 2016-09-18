package com.java.designpattern.compound.adapter;

/**
 * 假鸭子
 *
 * @author taomk
 * 2016年9月18日 下午7:38:12
 */
public class DecoyDuck implements Quackable {
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
