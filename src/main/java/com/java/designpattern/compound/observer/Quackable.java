package com.java.designpattern.compound.observer;

/**
 * 所有的Quackable都实现QuackObservable接口
 *
 * @author taomk
 * 2016年9月20日 下午6:53:58
 */
public interface Quackable extends QuackObservable {
	
	public void quack();
}
