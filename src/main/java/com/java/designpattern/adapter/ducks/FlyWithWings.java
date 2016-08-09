package com.java.designpattern.adapter.ducks;

/**
 * 飞行行为的一个具体实现
 * @author taomk
 * 2016年8月8日 下午9:53:12
 */
public class FlyWithWings implements FlyBehavior {

	/* (non-Javadoc)
	 * @see com.java.designpattern.adapter.ducks.FlyBehavior#fly()
	 */
	@Override
	public void fly() {
		System.out.println("I'm flying with wings ! ");
	}

}
