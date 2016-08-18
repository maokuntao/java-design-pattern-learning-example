package com.java.designpattern.command.party;

/**
 * 浴室打开的命令
 * @author taomk
 * 2016年8月18日 下午3:32:29
 */
public class HottubOffCommand implements Command {
	Hottub hottub;

	public HottubOffCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	public void execute() {
		hottub.setTemperature(98);
		hottub.off();
	}
	public void undo() {
		hottub.on();
	}
}
