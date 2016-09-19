package com.java.designpattern.compound.composite;

import java.util.ArrayList;

import com.java.designpattern.compound.adapter.Quackable;

/**
 * 使用组合模式来管理鸭子集合
 *
 * @author taomk
 * 2016年9月19日 下午7:46:57
 */
public class Flock implements Quackable {

	ArrayList<Quackable> quackers = new ArrayList<Quackable>();
	
	public void add(Quackable quacker){
		quackers.add(quacker);
	}
	
	@Override
	public void quack() {
		java.util.Iterator<Quackable> iterator = quackers.iterator();
		while(iterator.hasNext()){
			Quackable duck = iterator.next();
			duck.quack();
		}
	}

	public String toString() {
		return "Flock of Quackers";
	}
}
