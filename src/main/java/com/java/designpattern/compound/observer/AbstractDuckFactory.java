package com.java.designpattern.compound.observer;

/**
 * 新的生成鸭子的抽象工厂
 *
 * @author taomk
 * 2016年9月20日 下午7:41:20
 */
public abstract class AbstractDuckFactory {

	public abstract Quackable createMallardDuck();
	public abstract Quackable createRedheadDuck();
	public abstract Quackable createDuckCall();
	public abstract Quackable createRubberDuck();
	
}
