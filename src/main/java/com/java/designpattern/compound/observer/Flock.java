package com.java.designpattern.compound.observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 观察呱呱叫的群
 *
 * @author taomk
 * 2016年9月20日 下午7:36:57
 */
public class Flock implements Quackable {
	
	ArrayList<Quackable> ducks = new ArrayList<Quackable>();
	  
	public void add(Quackable duck) {
		ducks.add(duck);
	}
  
	@Override
	public void quack() {
		Iterator<Quackable> iterator = ducks.iterator();
		while (iterator.hasNext()) {
			Quackable duck = (Quackable)iterator.next();
			duck.quack();
		}
	}
   
	@Override
	public void registerObserver(Observer observer) {
		Iterator<Quackable> iterator = ducks.iterator();
		while (iterator.hasNext()) {
			Quackable duck = (Quackable)iterator.next();
			duck.registerObserver(observer);
		}
	}
  
	@Override
	public void notifyObservers() { }
  
	public String toString() {
		return "Flock of Ducks";
	}

}
