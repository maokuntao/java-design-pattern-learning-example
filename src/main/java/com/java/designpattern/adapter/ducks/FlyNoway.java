package com.java.designpattern.adapter.ducks;

/**
 * 飞行行为的另一个实现
 * @author taomk
 * 2016年8月8日 下午9:55:57
 */
public class FlyNoway implements FlyBehavior {

	/* (non-Javadoc)
	 * @see com.java.designpattern.adapter.ducks.FlyBehavior#fly()
	 */
	@Override
	public void fly() {
		System.out.println("I belive I can fly ... : ( ");
	}

}
