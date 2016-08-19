package com.java.designpattern.adapter.ducks;

/**
 * 野火鸡？
 * @author taomk
 * 2016年8月19日 上午10:10:40
 */
public class WildTurkey implements Turkey {

	@Override
	public void gobble() {
		System.out.println("Gobble gobble");
	}

	@Override
	public void fly() {
		System.out.println("I'm flying a short distane");
	}

}
