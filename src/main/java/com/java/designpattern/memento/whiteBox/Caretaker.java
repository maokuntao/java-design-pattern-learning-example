package com.java.designpattern.memento.whiteBox;

/**
 * 白箱备忘录模式-负责人角色类<br>
 * 负责人角色负责保存备忘录对象，但是从不修改（甚至不查看）备忘录对象的内容。
 * @author taomk 2016年10月9日 下午8:18:12
 *
 */
public class Caretaker {

	private Memento memento;
	
	/**
	 * @return 备忘录角色对象
	 */
	public Memento retrieveMemento(){
		return this.memento;
	}
	
	/**
	 * 备忘录的赋值方法
	 * @param memento
	 */
	public void saveMemento(Memento memento){
		this.memento = memento;
	}
}
