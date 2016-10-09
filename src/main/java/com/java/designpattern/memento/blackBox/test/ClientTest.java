package com.java.designpattern.memento.blackBox.test;

import com.java.designpattern.memento.blackBox.*;

/**
 * 黑箱备忘录模式-测试类<br>
 * 备忘录角色对发起人（Originator）角色对象提供一个宽接口，而为其他对象提供一个窄接口。这样的实现叫做“黑箱实现”。
 * 在JAVA语言中，实现双重接口的办法就是将备忘录角色类设计成发起人角色类的内部成员类。
 * 将Memento设成Originator类的内部类，从而将Memento对象封装在Originator里面；在外部提供一个标识接口MementoIF给Caretaker以及其他对象。
 * 这样，Originator类看到的是Menmento的所有接口，而Caretaker以及其他对象看到的仅仅是标识接口MementoIF所暴露出来的接口。
 * 
 * @author taomk 2016年10月9日 下午8:44:29
 *
 */
public class ClientTest {

	public static void main(String[] args) {
		
		Originator o = new Originator();
		Caretaker c = new Caretaker();
		// 改变负责人对象的状态
		o.setState("On");
		// 创建备忘录对象，并将发起人对象的状态存储起来
		c.saveMemento(o.createMemento());
		// 修改发起人对象的状态
		o.setState("Off");
		// 恢复发起人对象的状态
		o.restoreMemento(c.retrieveMemento());
	}

}
