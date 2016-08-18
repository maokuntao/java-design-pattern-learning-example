package com.java.designpattern.command.party;

/**
 * 浴室关闭的命令
 * @author taomk
 * 2016年8月18日 下午3:32:29
 */
public class HottubOnCommand implements Command {
	Hottub hottub;

	public HottubOnCommand(Hottub hottub) {
		this.hottub = hottub;
	}
	public void execute() {
		hottub.on();
		hottub.setTemperature(104);
		hottub.circulate();
	}
	public void undo() {
		hottub.off();
	}
}
