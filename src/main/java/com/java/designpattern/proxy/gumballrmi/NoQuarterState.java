package com.java.designpattern.proxy.gumballrmi;

/**
 * 糖果机处于投入硬币状态
 *
 * @author taomk
 * 2016年9月12日 下午6:55:46
 */
public class NoQuarterState implements State {
	
    private static final long serialVersionUID = 5078163044927519758L;
	
    transient GumballMachine gumballMachine;
 
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}
 
	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter");
	}
 
	public void turnCrank() {
		System.out.println("You turned, but there's no quarter");
	 }
 
	public void dispense() {
		System.out.println("You need to pay first");
	} 
 
	public String toString() {
		return "waiting for quarter";
	}
}
