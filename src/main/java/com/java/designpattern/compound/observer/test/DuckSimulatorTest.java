package com.java.designpattern.compound.observer.test;

import com.java.designpattern.compound.observer.AbstractDuckFactory;
import com.java.designpattern.compound.observer.CountingDuckFactory;
import com.java.designpattern.compound.observer.Flock;
import com.java.designpattern.compound.observer.Goose;
import com.java.designpattern.compound.observer.GooseAdapter;
import com.java.designpattern.compound.observer.QuackCounter;
import com.java.designpattern.compound.observer.Quackable;
import com.java.designpattern.compound.observer.Quackologist;

/**
 * 测试类
 *
 * @author taomk 2016年9月20日 下午7:39:52
 */
public class DuckSimulatorTest {
	
	public static void main(String[] args) {
		
		AbstractDuckFactory duckFactory = new CountingDuckFactory();

		new DuckSimulatorTest().simulate(duckFactory);
	}

	void simulate(AbstractDuckFactory duckFactory) {

		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable gooseDuck = new GooseAdapter(new Goose());

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

		System.out.println("\nDuck Simulator: With Observer");

		Quackologist quackologist = new Quackologist();
		flockOfDucks.registerObserver(quackologist);

		simulate(flockOfDucks);

		System.out.println("\nThe ducks quacked " + QuackCounter.getQuacks() + " times");
	}

	void simulate(Quackable duck) {
		duck.quack();
	}
}
