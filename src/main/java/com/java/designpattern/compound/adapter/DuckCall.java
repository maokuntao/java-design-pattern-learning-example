package com.java.designpattern.compound.adapter;

/**
 * 正常的鸭子
 *
 * @author taomk
 * 2016年9月18日 下午7:38:12
 */
public class DuckCall implements Quackable {
	public void quack() {
		System.out.println("Kwak");
	}
}
