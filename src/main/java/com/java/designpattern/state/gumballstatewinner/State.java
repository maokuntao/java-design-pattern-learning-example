package com.java.designpattern.state.gumballstatewinner;

/**
 * 状态接口－所有的具体状态都必须实现的共同接口
 *
 * @author taomk
 * 2016年9月4日 下午10:09:14
 */
public interface State {

	public void insertQuarter();
	public void ejectQuarter();
	public void turnCrank();
	public void dispense();
}
