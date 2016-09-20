package com.java.designpattern.compound.observer;

/**
 * 用来观察呱呱叫的观察者
 *
 * @author taomk
 * 2016年9月20日 下午7:34:22
 */
public class Quackologist implements Observer {

	@Override
	public void update(QuackObservable duck) {
//		打印出正在呱呱叫的Quackable对象
		System.out.println("Quackologist: " + duck + " just quacked.");
	}

}
