package com.java.designpattern.command.party;

/**
 * 打开电视的命令
 * @author taomk
 * 2016年8月18日 下午3:32:29
 */
public class TVOnCommand implements Command {
	TV tv;

	public TVOnCommand(TV tv) {
		this.tv= tv;
	}

	public void execute() {
		tv.on();
		tv.setInputChannel();
	}

	public void undo() {
		tv.off();
	}
}
