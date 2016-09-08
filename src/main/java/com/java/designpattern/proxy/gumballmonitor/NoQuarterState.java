package com.java.designpattern.proxy.gumballmonitor;

/**
 * 未投币状态
 *
 * @author taomk
 * 2016年9月8日 下午9:43:12
 */
public class NoQuarterState implements State {
    private static final long serialVersionUID = 1L;
    
	GumballMachine gumballMachine;
 
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
