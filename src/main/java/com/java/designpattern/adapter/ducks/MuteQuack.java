package com.java.designpattern.adapter.ducks;

/**
 * @author taomk
 * 2016年8月8日 下午9:58:47
 */
public class MuteQuack implements QuackBehavior {

	/* (non-Javadoc)
	 * @see com.java.designpattern.adapter.ducks.QuackBehavior#quack()
	 */
	@Override
	public void quack() {
		System.out.println("<< Silence >>");
	}

}
