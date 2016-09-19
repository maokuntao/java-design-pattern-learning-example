package com.java.designpattern.compound.factory;

import com.java.designpattern.compound.adapter.*;
import com.java.designpattern.compound.decorator.*;

/**
 * 鸭子呱呱叫工厂
 *
 * @author taomk
 * 2016年9月19日 下午4:31:55
 */
public class CountingDuckFactory extends AbstractDuckFactory {

	@Override
	public Quackable createMallardDuck() {
		return new QuackCounter(new MallardDuck());
	}

	@Override
	public Quackable createRedheadDuck() {
		return new QuackCounter(new RedheadDuck());
	}

	@Override
	public Quackable createDuckCall() {
		return new QuackCounter(new DuckCall());
	}

	@Override
	public Quackable createRubberDuck() {
		return new QuackCounter(new RubberDuck());
	}

}
