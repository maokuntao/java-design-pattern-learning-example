package com.java.designpattern.command.Remote;

/**
 * 浴室降温命令
 * @author taomk
 * 2016年8月17日 下午9:54:20
 */
public class HottubOffCommand implements Command {
	Hottub hottub;

	public HottubOffCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	public void execute() {
		hottub.cool();
		hottub.off();
	}
}
