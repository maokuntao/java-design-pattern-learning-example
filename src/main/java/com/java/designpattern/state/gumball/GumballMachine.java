package com.java.designpattern.state.gumball;

/**
 * 糖果机－含有四个状态
 *
 * @author taomk 2016年9月4日 下午9:28:08
 */
public class GumballMachine {

	// 糖果已经售罄
	final static int SOLD_OUT = 0;
	// 未投入25分硬币
	final static int NO_QUARTER = 1;
	// 已投入25分硬币
	final static int HAS_QUARTER = 2;
	// 已售出的糖果数量
	final static int SOLD = 3;

	// 初始状态为售罄
	int state = SOLD_OUT;
	// 记录机器库存
	int count = 0;

	public GumballMachine(int count) {
		// 初始化机器类的糖果数量
		this.count = count;
		// 如果当前糖果库存数量>0，状态设置为待投币
		if (count > 0) {
			state = NO_QUARTER;
		}
	}

	// 投入硬币之后逻辑
	public void insertQuarter() {

		if (state == HAS_QUARTER) {
			System.out.println("You can't insert another quarter");
		} else if (state == NO_QUARTER) {
			state = HAS_QUARTER;
			System.out.println("You inserted a quarter");
		} else if (state == SOLD_OUT) {
			System.out.println("You can't insert a quarter, the machine is sold out");
		} else if (state == SOLD) {
			System.out.println("Please wait, we're already giving you a gumball");
		}
	}

	// 退出硬币之后的操作
	public void ejectQuarter() {
		if (state == HAS_QUARTER) {
			System.out.println("Quarter returned");
			state = NO_QUARTER;
		} else if (state == NO_QUARTER) {
			System.out.println("You haven't inserted a quarter");
		} else if (state == SOLD) {
			System.out.println("Sorry, you already turned the crank");
		} else if (state == SOLD_OUT) {
			System.out.println("You can't eject, you haven't inserted a quarter yet");
		}
	}

	// 转动按钮之后的逻辑
	public void turnCrank() {
		if (state == SOLD) {
			System.out.println("Turning twice doesn't get you another gumball!");
		} else if (state == NO_QUARTER) {
			System.out.println("You turned but there's no quarter");
		} else if (state == SOLD_OUT) {
			System.out.println("You turned, but there are no gumballs");
		} else if (state == HAS_QUARTER) {
			System.out.println("You turned...");
			state = SOLD;
			dispense();
		}
	}

	// 机器内部对各种状态作出反应
	public void dispense() {
		if (state == SOLD) {
			System.out.println("A gumball comes rolling out the slot");
			count = count - 1;
			if (count == 0) {
				System.out.println("Oops, out of gumballs!");
				state = SOLD_OUT;
			} else {
				state = NO_QUARTER;
			}
		} else if (state == NO_QUARTER) {
			System.out.println("You need to pay first");
		} else if (state == SOLD_OUT) {
			System.out.println("No gumball dispensed");
		} else if (state == HAS_QUARTER) {
			System.out.println("No gumball dispensed");
		}
	}

	// 补充糖果库存
	public void refill(int numGumBalls) {
		this.count = numGumBalls;
		state = NO_QUARTER;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004\n");
		result.append("Inventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\nMachine is ");
		if (state == SOLD_OUT) {
			result.append("sold out");
		} else if (state == NO_QUARTER) {
			result.append("waiting for quarter");
		} else if (state == HAS_QUARTER) {
			result.append("waiting for turn of crank");
		} else if (state == SOLD) {
			result.append("delivering a gumball");
		}
		result.append("\n");
		return result.toString();
	}
}
