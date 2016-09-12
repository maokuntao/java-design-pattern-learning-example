package com.java.designpattern.proxy.gumballrmi;

/**
 * 糖果机处于售罄状态
 *
 * @author taomk
 * 2016年9月12日 下午6:55:46
 */
public class SoldOutState implements State {

	private static final long serialVersionUID = 8451136162929734992L;

	transient GumballMachine gumballMachine;
	
	public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
	
	@Override
	public void insertQuarter() {
		System.out.println("You can't insert a quarter, the machine is sold out");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You can't eject, you haven't inserted a quarter yet");
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned, but there are no gumballs");
	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispensed");
	}

	public String toString() {
		return "sold out";
	}
}
