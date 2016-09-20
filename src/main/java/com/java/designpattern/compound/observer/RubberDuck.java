package com.java.designpattern.compound.observer;

/**
 * 具备观察者身份的橡胶鸭
 *
 * @author taomk
 * 2016年9月20日 下午7:46:59
 */
public class RubberDuck implements Quackable {
	Observable observable;

	public RubberDuck() {
		observable = new Observable(this);
	}
 
	public void quack() {
		System.out.println("Squeak");
		notifyObservers();
	}

	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	public void notifyObservers() {
		observable.notifyObservers();
	}
  
	public String toString() {
		return "Rubber Duck";
	}
}