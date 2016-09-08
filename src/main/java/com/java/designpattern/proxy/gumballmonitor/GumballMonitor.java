package com.java.designpattern.proxy.gumballmonitor;

/**
 * 糖果机
 *
 * @author taomk
 * 2016年9月8日 下午9:43:12
 */ 
public class GumballMonitor {
	GumballMachine machine;
 
	public GumballMonitor(GumballMachine machine) {
		this.machine = machine;
	}
 
	public void report() {
		System.out.println("Gumball Machine: " + machine.getLocation());
		System.out.println("Current inventory: " + machine.getCount() + " gumballs");
		System.out.println("Current state: " + machine.getState());
	}
}
