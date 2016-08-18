package com.java.designpattern.command.Remote;

/**
 * 浴室加热命令
 * @author taomk
 * 2016年8月17日 下午9:54:20
 */
public class HottubOnCommand implements Command {
	Hottub hottub;

	public HottubOnCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	public void execute() {
		hottub.on();
		hottub.heat();
		hottub.bubblesOn();
	}
}
