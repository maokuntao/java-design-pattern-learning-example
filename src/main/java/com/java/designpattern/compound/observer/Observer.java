package com.java.designpattern.compound.observer;

/**
 * 观察者－自己实现的观察者接口，可类比于<code>java.util.Observer</code> 
 *
 * @author taomk
 * 2016年9月20日 下午7:02:59
 */
public interface Observer {
	
	public void update(QuackObservable duck);
}
