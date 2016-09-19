package com.java.designpattern.compound.decorator;

import com.java.designpattern.compound.adapter.Quackable;

/**
 * 使用装饰者模式给呱呱叫这一行为添加技术功能
 *
 * @author taomk
 * 2016年9月19日 下午3:55:01
 */
public class QuackCounter implements Quackable{

	private Quackable duck;
	private static int numberOfQuack;
	
	public QuackCounter(Quackable duck){
		this.duck = duck;
	}

	@Override
	public void quack() {
		duck.quack();
		numberOfQuack++;
	}
	
	/**
	 * 呱呱叫的次数
	 */
	public static int getQuacks(){
		return numberOfQuack;
	}
	
}
