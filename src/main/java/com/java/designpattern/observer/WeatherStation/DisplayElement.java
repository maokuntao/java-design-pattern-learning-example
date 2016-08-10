package com.java.designpattern.observer.WeatherStation;

/**
 * 用于展示观测值信息
 * @author taomk
 * 2016年8月9日 下午6:34:32
 */
public interface DisplayElement {

	/**
	 * 当布告板需要显示时，调用此方法
	 */
	public void display();
}
