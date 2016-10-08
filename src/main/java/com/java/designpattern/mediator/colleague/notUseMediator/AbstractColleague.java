package com.java.designpattern.mediator.colleague.notUseMediator;

/**
 * 有两个类A和B，类中各有一个数字，并且要保证类B中的数字永远是类A中数字的100倍。
 * 也就是说，当修改类A的数时，将这个数字乘以100赋给类B，
 * 而修改类B时，要将数除以100赋给类A。类A类B互相影响，就称为<b>同事类</b>。
 * 
 * @author taomk 2016年10月8日 下午7:51:46
 *
 */
public abstract class AbstractColleague {

	public int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	
	/**
	 * 关联方法，修改数字同时修改关联对象
	 * @param number 原始数值
	 * @param colleague 关联对象
	 */
	public abstract void setNumber(int number , AbstractColleague colleague);
}
