package com.java.designpattern.command.SimpleRemote;

/**
 * This is the invoker
 * 
 * @author taomk 2016年8月17日 下午10:00:23
 */
public class SimpleRemoteControl {

	// 一个持有命令的插槽
	Command slot;

	// 设置插槽持有的命令
	public void setCommand(Command command) {
		this.slot = command;
	}

	// 按下按钮，触发命令
	public void buttonWasPressed() {
		slot.execute();
	}
}
