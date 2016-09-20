package com.java.designpattern.compound.observer;

/**
 * 计数器装饰者也需要成为观察者
 *
 * @author taomk
 * 2016年9月20日 下午7:29:27
 */
public class QuackCounter implements Quackable {
	
	Quackable duck;
	static int numberOfQuacks;
	
	public QuackCounter(Quackable duck) {
		this.duck = duck;
	}

	@Override
	public void registerObserver(Observer observer) {
		duck.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		duck.notifyObservers();
	}

	@Override
	public void quack() {
		duck.quack();
		numberOfQuacks++;
	}
	
	public static int getQuacks() {
		return numberOfQuacks;
	}
	
	public String toString() {
		return duck.toString();
	}
}
