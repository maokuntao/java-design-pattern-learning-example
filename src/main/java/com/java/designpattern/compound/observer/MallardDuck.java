package com.java.designpattern.compound.observer;

/**
 * 具备观察者身份的绿头鸭
 *
 * @author taomk
 * 2016年9月20日 下午7:18:35
 */
public class MallardDuck implements Quackable {

	// 每一个Quackable都有一个Observable实例变量
	Observable observable;
	
	@Override
	public void registerObserver(Observer observer) {
		// 将MallardDuck本身加入到Observable来管理
		observable = new Observable(this);
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}

	@Override
	public void quack() {
		System.out.println("Quack");
		//需要让观察者直到我们发出了呱呱叫
		notifyObservers();
	}

}
