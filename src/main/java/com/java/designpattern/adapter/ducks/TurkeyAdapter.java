package com.java.designpattern.adapter.ducks;

/**
 * 火鸡适配器－将“火鸡”转换为一只“鸭子”
 * @author taomk
 * 2016年8月19日 上午10:13:12
 */
public class TurkeyAdapter implements Duck {

	Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey){
		this.turkey = turkey;
	}
	
	@Override
	public void quack() {
		turkey.gobble();//实际上是火鸡的行为
	}

	@Override
	public void fly() {
		for (int i = 0; i < 3; i++) {
			turkey.fly();//实际上是火鸡的行为
		}
	}

}
