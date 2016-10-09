package com.java.designpattern.memento.whiteBox.test;

import com.java.designpattern.memento.whiteBox.*;

/**
 * 白箱备忘录模式-测试类<br>
 * 备忘录角色对任何对象都提供一个接口，即宽接口，备忘录角色的内部所存储的状态就对所有对象公开，因此这个实现又叫做“白箱实现”。
 * “白箱”实现将发起人角色的状态存储在一个大家都看得到的地方，因此是破坏封装性的。
 * 但是通过程序员自律，同样可以在一定程度上实现模式的大部分用意。因此白箱实现仍然是有意义的。
 * @author taomk 2016年10月9日 下午8:23:17
 *
 */
public class ClientTest {

	public static void main(String[] args) {

		// 发起人对象
		Originator o = new Originator();
		// 负责人对象
		Caretaker c = new Caretaker();
		
		// 设置负责人对象的状态
		o.setState("On");
		// 创建备忘录对象，并将发起人对象的状态储存起来
		c.saveMemento(o.createMemento());
		
		// 修改发起人的状态
		o.setState("Off");
		
		// 恢复发起人对象的状态
		o.restoreMemento(c.retrieveMemento());

		System.out.println(o.getState());
	}

}
