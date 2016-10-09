package com.java.designpattern.memento.blackBox;

/**
 * 黑箱备忘录模式-发起人角色<br>
 * 
 * @author taomk 2016年10月9日 下午8:32:38
 *
 */
public class Originator {

	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		System.out.println("当前状态为：" + state);
	}

	/**
	 * 工厂方法，返还一个新的备忘录对象
	 */
	public MementoIF createMemento() {
		return new Memento(state);
	}

	/**
	 * 发起人恢复到备忘录对象记录的状态
	 */
	public void restoreMemento(MementoIF memento) {
		this.setState(((Memento) memento).getState());
	}

	private class Memento implements MementoIF {
		private String state;

		/**
		 * 构造方法
		 */
		private Memento(String state) {
			this.state = state;
		}

		private String getState() {
			return state;
		}

		@SuppressWarnings("unused")
		private void setState(String state) {
			this.state = state;
		}
	}
}
