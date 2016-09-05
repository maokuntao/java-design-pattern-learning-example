package com.java.designpattern.state.gumballstatewinner;

import java.util.Random;

/**
 * 投入硬币之后的状态
 *
 * @author taomk
 * 2016年9月4日 下午10:10:26
 */
public class HasQuarterState implements State {

	Random randomWinner = new Random(System.currentTimeMillis());
	
	GumballMachine gumballMachine;
	
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("You can't insert another quarter");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Quarter returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned...");
		int winner = randomWinner.nextInt(10);
		// 10%概率获得2颗糖果
		if ((winner == 0) && (gumballMachine.getCount() > 1)) {
			gumballMachine.setState(gumballMachine.getWinnerState());
		} else {
			gumballMachine.setState(gumballMachine.getSoldState());
		}
	}

	@Override
	public void dispense() {
        System.out.println("No gumball dispensed");
	}
	
	public String toString() {
		return "waiting for turn of crank";
	}

}
