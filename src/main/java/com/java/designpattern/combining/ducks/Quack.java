package com.java.designpattern.combining.ducks;

/**
 * 呱呱叫行为的一个实现
 * @author taomk
 * 2016年8月8日 下午9:57:55
 */
public class Quack implements QuackBehavior {

	/* (non-Javadoc)
	 * @see com.java.designpattern.adapter.ducks.QuackBehavior#quack()
	 */
	@Override
	public void quack() {
		System.out.println("Ga~ Ga~ ...");
	}

}
