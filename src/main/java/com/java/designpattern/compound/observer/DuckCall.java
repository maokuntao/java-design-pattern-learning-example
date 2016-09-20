package com.java.designpattern.compound.observer;

/**
 * 具备观察者身份的假鸭子
 *
 * @author taomk
 * 2016年9月20日 下午7:45:46
 */
public class DuckCall implements Quackable {
	Observable observable;

	public DuckCall() {
		observable = new Observable(this);
	}
 
	public void quack() {
		System.out.println("Kwak");
		notifyObservers();
	}
 
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	public void notifyObservers() {
		observable.notifyObservers();
	}
 
	public String toString() {
		return "Duck Call";
	}
}