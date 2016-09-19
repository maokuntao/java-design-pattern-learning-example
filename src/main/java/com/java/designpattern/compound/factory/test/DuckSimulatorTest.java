package com.java.designpattern.compound.factory.test;

import com.java.designpattern.compound.adapter.*;
import com.java.designpattern.compound.decorator.*;
import com.java.designpattern.compound.factory.*;

/**
 * 测试类－利用工厂生成对象
 *
 * @author taomk 2016年9月19日 下午7:19:23
 */
public class DuckSimulatorTest {

	public static void main(String[] args) {
		AbstractDuckFactory factory = new CountingDuckFactory();
		new DuckSimulatorTest().simulate(factory);
	}

	private void simulate(AbstractDuckFactory duckFactory) {
		
//		使用工厂来生成对象
		Quackable mallardDuck = duckFactory.createMallardDuck();
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable gooseDuck = new GooseAdapter(new Goose());

		System.out.println("\nDuck Simulator: With Abstract Factory");

		quack(mallardDuck);
		quack(redheadDuck);
		quack(duckCall);
		quack(rubberDuck);
		quack(gooseDuck);

		System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
	}

	private void quack(Quackable quackable) {
		quackable.quack();
	}
}
