package com.java.designpattern.compound.factory;

import com.java.designpattern.compound.adapter.Quackable;

/**
 * 使用抽象工厂模式来生成鸭子
 *
 * @author taomk
 * 2016年9月19日 下午4:26:10
 */
public abstract class AbstractDuckFactory {
	
	public abstract Quackable createMallardDuck();
	public abstract Quackable createRedheadDuck();
	public abstract Quackable createDuckCall();
	public abstract Quackable createRubberDuck();
}
