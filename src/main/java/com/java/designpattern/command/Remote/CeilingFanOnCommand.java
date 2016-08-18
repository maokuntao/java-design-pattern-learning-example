package com.java.designpattern.command.Remote;

/**
 * 打开吊扇命令
 * @author taomk
 * 2016年8月17日 下午9:54:20
 */
public class CeilingFanOnCommand implements Command {
	CeilingFan ceilingFan;

	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	public void execute() {
		ceilingFan.high();
	}
}
