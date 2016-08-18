package com.java.designpattern.command.undo;

/**
 * 打开吊扇的命令
 * @author taomk
 * 2016年8月18日 下午3:14:20
 */
public class CeilingFanOnCommand implements Command {
	CeilingFan ceilingFan;

	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	public void execute() {
		ceilingFan.high();
	}
	public void undo() {
		ceilingFan.off();
	}
}
