package com.java.designpattern.state.gumballstatewinner;

/**
 * 未投入硬币状态
 *
 * @author taomk
 * 2016年9月4日 下午10:13:55
 */
public class NoQuarterState implements State {

	GumballMachine gumballMachine;
	 
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    
	@Override
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter");
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned, but there's no quarter");
	}

	@Override
	public void dispense() {
		System.out.println("You need to pay first");
	}

	public String toString() {
		return "waiting for quarter";
	}
}
