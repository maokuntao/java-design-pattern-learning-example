package com.java.designpattern.compound.observer;

/**
 * 观察者接口－任何想被观察的Quackable都必须实现QuackObservable
 * 
 * @author taomk
 * 2016年9月20日 下午4:57:04
 */
public interface QuackObservable {
	
	/**
	 *  注册观察者－任何实现了Observer接口的对象都可以监听呱呱叫
	 */
	public void registerObserver(Observer observer);
	
	
	/**
	 * 通知所有的观察者
	 */
	public void nofityObservers();
}
