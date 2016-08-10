package com.java.designpattern.observer.WeatherStation;

/**
 *  主题
 * @author taomk
 * 2016年8月9日 下午6:22:34
 */
public interface Subject {
	
	/**
	 * 注册观察者
	 * @param o 待注册的观察者
	 */
	public void registerObserver(Observer o);
	
	/**
	 * 移除观察者
	 * @param o 待删除的观察者
	 */
	public void removeObserver(Observer o);
	
	/**
	 * 观测值发生变化时，通知所有的观察者
	 */
	public void notifyObservers();
}
