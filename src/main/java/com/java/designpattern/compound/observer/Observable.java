package com.java.designpattern.compound.observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 观察者－具备真正观察能力
 *
 * @author taomk
 * 2016年9月20日 下午6:56:14
 */
public class Observable implements QuackObservable {

	ArrayList<Observer> observers = new ArrayList<Observer>(); 
	QuackObservable duck;
	
	public Observable(QuackObservable duck){
		this.duck = duck;
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void notifyObservers() {
		Iterator<Observer> iterator = observers.iterator();
		while(iterator.hasNext()){
			Observer observer = iterator.next();
			observer.update(duck);
		}
	}

}
