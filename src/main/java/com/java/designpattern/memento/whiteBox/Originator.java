package com.java.designpattern.memento.whiteBox;

/**
 * 白箱备忘录模式-发起人角色类<br>
 * 发起人角色利用一个新创建的备忘录对象将自己的内部状态存储起来。
 * 
 * @author taomk 2016年10月9日 下午8:00:38
 *
 */
public class Originator {

	private String state;

	/**
	 * Factory method
	 * @return 新的备忘录对象
	 */
	public Memento createMemento(){
		return new Memento(this.state);
	}
	
	/**
	 * 将发起人状态恢复到备忘录记载的状态
	 * @param memento
	 */
	public void restoreMemento(Memento memento){
		this.state = memento.getState();
	}
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		System.out.println("当前状态为：" + state);
	}
	
	
}
