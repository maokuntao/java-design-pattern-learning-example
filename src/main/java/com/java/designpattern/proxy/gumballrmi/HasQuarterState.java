package com.java.designpattern.proxy.gumballrmi;

import java.util.Random;


/**
 * 糖果机处于投入硬币状态
 *
 * @author taomk
 * 2016年9月12日 下午6:55:46
 */
public class HasQuarterState implements State {
	
	private static final long serialVersionUID = 1887912554236869680L;
	
	Random randomWinner = new Random(System.currentTimeMillis());
	
	transient GumballMachine gumballMachine;
 
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
