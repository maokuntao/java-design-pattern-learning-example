package com.java.designpattern.command.Remote;

/**
 * 关闭吊扇命令
 * @author taomk
 * 2016年8月17日 下午9:54:20
 */
public class CeilingFanOffCommand implements Command {
	CeilingFan ceilingFan;

	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	public void execute() {
		ceilingFan.off();
	}
}
