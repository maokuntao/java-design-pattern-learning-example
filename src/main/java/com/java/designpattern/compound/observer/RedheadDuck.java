package com.java.designpattern.compound.observer;

/**
 * 具备观察者身份的红头鸭
 *
 * @author taomk
 * 2016年9月20日 下午7:44:41
 */
public class RedheadDuck implements Quackable {
	Observable observable;

	public RedheadDuck() {
		observable = new Observable(this);
	}

	public void quack() {
		System.out.println("Quack");
		notifyObservers();
	}

	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	public void notifyObservers() {
		observable.notifyObservers();
	}

	public String toString() {
		return "Redhead Duck";
	}
}