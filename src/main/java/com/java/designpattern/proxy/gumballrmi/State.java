package com.java.designpattern.proxy.gumballrmi;

import java.io.Serializable;

/**
 * 糖果机器状态<br>
 * 需要继承<code>java.io.Serializable</code>以实现远程调用
 *
 * @author taomk
 * 2016年9月12日 下午6:12:46
 */
public interface State  extends Serializable {
	public void insertQuarter();
	public void ejectQuarter();
	public void turnCrank();
	public void dispense();
}
