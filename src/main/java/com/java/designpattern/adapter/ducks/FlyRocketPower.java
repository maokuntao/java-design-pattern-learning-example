package com.java.designpattern.adapter.ducks;

import com.java.designpattern.adapter.ducks.FlyBehavior;

/**
 * 一种具有火箭动力的飞行行为
 * @author taomk
 * 2016年8月8日 下午10:22:45
 */
public class FlyRocketPower implements FlyBehavior {

	/* (non-Javadoc)
	 * @see com.java.designpattern.adapter.ducks.FlyBehavior#fly()
	 */
	@Override
	public void fly() {
		System.out.println("Awsome , I'm flying with a rocket . 🚀");
	}

}
