package com.java.designpattern.proxy.gumballmonitor;

/**
 * 已投币状态
 *
 * @author taomk
 * 2016年9月8日 下午9:43:12
 */

import java.util.Random;

public class HasQuarterState implements State {
	private static final long serialVersionUID = 1L;

	Random randomWinner = new Random(System.currentTimeMillis());

	GumballMachine gumballMachine;

	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	public void insertQuarter() {
		System.out.println("You can't insert another quarter");
	}

	public void ejectQuarter() {
		System.out.println("Quarter returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	public void turnCrank() {
		System.out.println("You turned...");
		int winner = randomWinner.nextInt(10);
		// 10%概率出现获胜者
		if (winner == 0) {
			gumballMachine.setState(gumballMachine.getWinnerState());
		} else {
			gumballMachine.setState(gumballMachine.getSoldState());
		}
	}

	public void dispense() {
		System.out.println("No gumball dispensed");
	}

	public String toString() {
		return "waiting for turn of crank";
	}
}
