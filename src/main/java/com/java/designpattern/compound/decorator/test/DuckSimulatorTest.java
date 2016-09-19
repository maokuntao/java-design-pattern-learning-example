package com.java.designpattern.compound.decorator.test;

import com.java.designpattern.compound.adapter.*;
import com.java.designpattern.compound.decorator.QuackCounter;

/**
 * 测试类－鸭子模拟器
 *
 * @author taomk
 * 2016年9月19日 下午3:55:01
 */
public class DuckSimulatorTest {
	public static void main(String[] args) {
		DuckSimulatorTest simulator = new DuckSimulatorTest();
		simulator.simulate();
	}

	void simulate() {
		
//		每次创建一只Quackable之后，用这个新的装饰者QuackCounter来装饰，使之具备计数功能
		Quackable mallardDuck = new QuackCounter(new MallardDuck());
		Quackable redheadDuck = new QuackCounter(new RedheadDuck());
		Quackable duckCall = new QuackCounter(new DuckCall());
		Quackable rubberDuck = new QuackCounter(new RubberDuck());
		Quackable gooseDuck = new GooseAdapter(new Goose());
 
		System.out.println("\nDuck Simulator: With Goose Adapter");
 
		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseDuck);
		
		System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times.");
	}
 
	void simulate(Quackable duck) {
		duck.quack();
	}
}
