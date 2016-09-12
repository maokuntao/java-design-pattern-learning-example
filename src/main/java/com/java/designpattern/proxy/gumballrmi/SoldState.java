package com.java.designpattern.proxy.gumballrmi;

/**
 * 糖果机处于待售状态
 *
 * @author taomk
 * 2016年9月12日 下午6:27:06
 */
public class SoldState implements State {

	private static final long serialVersionUID = -1078236903329562623L;
	
	transient GumballMachine gumballMachine;
	
	public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

	@Override
	public void insertQuarter() {
		System.out.println("Please wait, we're already giving you a gumball");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Sorry, you already turned the crank");
	}

	@Override
	public void turnCrank() {
		System.out.println("Turning twice doesn't get you another gumball!");
	}

	@Override
	public void dispense() {
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		} else {
			System.out.println("Oops, out of gumballs!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}

	public String toString() {
		return "dispensing a gumball";
	}
}
