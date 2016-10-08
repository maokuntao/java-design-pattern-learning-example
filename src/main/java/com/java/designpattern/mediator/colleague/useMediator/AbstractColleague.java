package com.java.designpattern.mediator.colleague.useMediator;

/**
 * 同事类。
 * 
 * @author taomk 2016年10月8日 下午8:48:35
 *
 */
public abstract class AbstractColleague {

	protected int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	/**
	 * 通过中介者来改变受影响同事对象
	 * @param number 原始数值
	 * @param mediator 中介者
	 */
	public abstract void setNumber(int number , AbstractMediator mediator);
}
