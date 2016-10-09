package com.java.designpattern.memento.blackBox;

/**
 * 黑箱备忘录模式-备忘录角色接口<br>
 * 
 * @author taomk 2016年10月9日 下午8:40:35
 *
 */
public class Caretaker {

	private MementoIF memento;

	/**
	 * 备忘录取值方法
	 */
	public MementoIF retrieveMemento() {
		return memento;
	}

	/**
	 * 备忘录赋值方法
	 */
	public void saveMemento(MementoIF memento) {
		this.memento = memento;
	}
}
