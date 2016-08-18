package com.java.designpattern.command.Remote;

/**
 * 车库门下降命令
 * @author taomk
 * 2016年8月17日 下午9:54:20
 */
public class GarageDoorDownCommand implements Command {
	GarageDoor garageDoor;

	public GarageDoorDownCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.up();
	}
}
