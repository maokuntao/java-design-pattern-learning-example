package com.java.designpattern.adapter.ducks;

import java.util.Random;

/**
 * 鸭子适配器－将“鸭子”转换为一只“火鸡”
 * @author taomk
 * 2016年8月19日 上午10:17:19
 */
public class DuckAdapter implements Turkey {

	Duck duck;
	Random random;
	
	public DuckAdapter(Duck duck){
		this.duck = duck;
		random = new Random();
	}
	
	@Override
	public void gobble() {
		duck.quack();
	}

	@Override
	public void fly() {

		if(random.nextInt(3) == 0){
			duck.fly();
		}
	}

}
