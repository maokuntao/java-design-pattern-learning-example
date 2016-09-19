package com.java.designpattern.compound.factory;

import com.java.designpattern.compound.adapter.*;

/**
 * 实际的鸭子生成工厂
 *
 * @author taomk
 * 2016年9月19日 下午4:28:39
 */
public class DuckFactory extends AbstractDuckFactory {

	@Override
	public Quackable createMallardDuck() {
		return new MallardDuck();
	}

	@Override
	public Quackable createRedheadDuck() {
		return new RedheadDuck();
	}

	@Override
	public Quackable createDuckCall() {
		return new DuckCall();
	}

	@Override
	public Quackable createRubberDuck() {
		return new RubberDuck();
	}

}
