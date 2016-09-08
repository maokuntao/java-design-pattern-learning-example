package com.java.designpattern.proxy.gumballmonitor;

/**
 * 状态接口－所有的状态公共接口
 *
 * @author taomk
 * 2016年9月8日 下午9:43:12
 */
import java.io.*;

public interface State extends Serializable {
 
	public void insertQuarter();
	public void ejectQuarter();
	public void turnCrank();
	public void dispense();
}
