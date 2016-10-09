package com.java.designpattern.memento.whiteBox;

/**
 * 白箱备忘录模式-备忘录角色类<br>
 * 备忘录对象将发起人对象传入的状态存储起来。
 * @author taomk 2016年10月9日 下午8:02:54
 *
 */
public class Memento {

	private String state;

	public Memento(String state) {
		super();
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
}
