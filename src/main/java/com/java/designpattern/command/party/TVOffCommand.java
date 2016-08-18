package com.java.designpattern.command.party;

/**
 * 关闭电视的命令
 * @author taomk
 * 2016年8月18日 下午3:32:29
 */
public class TVOffCommand implements Command {
	TV tv;

	public TVOffCommand(TV tv) {
		this.tv= tv;
	}

	public void execute() {
		tv.off();
	}

	public void undo() {
		tv.on();
	}
}
