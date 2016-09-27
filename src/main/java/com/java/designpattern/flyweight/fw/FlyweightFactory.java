package com.java.designpattern.flyweight.fw;

import java.util.Hashtable;

/**
 * Flyweight Factory
 * @author taomk 2016年9月27日 下午7:57:19
 *
 */
public class FlyweightFactory {

	private Hashtable<String , Flyweight> flyweights = new Hashtable<String , Flyweight>();
	
	public Flyweight getFlyweight(String key){
		Flyweight flyweight = flyweights.get(key);
		if(flyweight==null){
			flyweight = new ConcreteFlyweight(key);
			flyweights.put(key, flyweight);
		}
		return flyweight;
	}
	
	public int getFlyweightSize(){
		return flyweights.size();
	}
}
