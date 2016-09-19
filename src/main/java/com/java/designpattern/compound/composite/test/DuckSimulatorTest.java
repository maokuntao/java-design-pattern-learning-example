package com.java.designpattern.compound.composite.test;

import com.java.designpattern.compound.adapter.*;
import com.java.designpattern.compound.composite.Flock;
import com.java.designpattern.compound.decorator.*;
import com.java.designpattern.compound.factory.*;

/**
 * 测试类
 *
 * @author taomk 2016年9月19日 下午7:19:23
 */
public class DuckSimulatorTest {

	public static void main(String[] args) {
		AbstractDuckFactory factory = new CountingDuckFactory();
		new DuckSimulatorTest().simulate(factory);
	}

	private void simulate(AbstractDuckFactory duckFactory) {
		
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable gooseDuck = new GooseAdapter(new Goose());

		System.out.println("\nDuck Simulator: With Composite - Flocks");

		Flock flockOfDucks = new Flock();

		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(gooseDuck);

		Flock flockOfMallards = new Flock();

		Quackable mallardOne = duckFactory.createMallardDuck();
		Quackable mallardTwo = duckFactory.createMallardDuck();
		Quackable mallardThree = duckFactory.createMallardDuck();
		Quackable mallardFour = duckFactory.createMallardDuck();

		flockOfMallards.add(mallardOne);
		flockOfMallards.add(mallardTwo);
		flockOfMallards.add(mallardThree);
		flockOfMallards.add(mallardFour);

		flockOfDucks.add(flockOfMallards);

		System.out.println("\nDuck Simulator: Whole Flock Simulation");
		quack(flockOfDucks);

		System.out.println("\nDuck Simulator: Mallard Flock Simulation");
		quack(flockOfMallards);

		System.out.println("\nThe ducks quacked " + QuackCounter.getQuacks() + " times");
	}

	private void quack(Quackable quackable) {
		quackable.quack();
	}
}
