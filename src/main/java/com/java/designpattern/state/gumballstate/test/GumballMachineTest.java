package com.java.designpattern.state.gumballstate.test;

import com.java.designpattern.state.gumballstate.GumballMachine;

/**
 * 测试类
 *
 * @author taomk
 * 2016年9月4日 下午10:18:12
 */
public class GumballMachineTest {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5);

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);
	}
}
