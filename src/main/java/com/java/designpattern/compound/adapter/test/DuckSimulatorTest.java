package com.java.designpattern.compound.adapter.test;

import com.java.designpattern.compound.adapter.*;

/**
 * 测试类－鸭子模拟器
 *
 * @author taomk
 * 2016年9月18日 下午7:38:12
 */
public class DuckSimulatorTest {
	public static void main(String[] args) {
		DuckSimulatorTest simulator = new DuckSimulatorTest();
		simulator.simulate();
	}

	void simulate() {
		Quackable mallardDuck = new MallardDuck();
		Quackable redheadDuck = new RedheadDuck();
		Quackable duckCall = new DuckCall();
		Quackable rubberDuck = new RubberDuck();
		Quackable gooseDuck = new GooseAdapter(new Goose());
 
		System.out.println("\nDuck Simulator: With Goose Adapter");
 
		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseDuck);
	}
 
	void simulate(Quackable duck) {
		duck.quack();
	}
}
