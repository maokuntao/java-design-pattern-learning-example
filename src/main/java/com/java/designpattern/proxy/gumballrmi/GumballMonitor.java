package com.java.designpattern.proxy.gumballrmi;

import java.rmi.*;

/**
 * 糖果机监视器－通过此监视器来远程查看状态信息
 *
 * @author taomk
 * 2016年9月12日 下午6:55:46
 */
 
public class GumballMonitor {
	
	public GumballMachineRemote machine;
 
	public GumballMonitor(GumballMachineRemote machine) {
		this.machine = machine;
	}
 
	public void report() {
		try {
			System.out.println("Gumball Machine: " + machine.getLocation());
			System.out.println("Current inventory: " + machine.getCount() + " gumballs");
			System.out.println("Current state: " + machine.getState());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
