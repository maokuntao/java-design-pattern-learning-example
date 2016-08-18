package com.java.designpattern.command.Remote;

/**
 * 车库门上升命令
 * @author taomk
 * 2016年8月17日 下午9:54:20
 */
public class GarageDoorUpCommand implements Command {
	GarageDoor garageDoor;

	public GarageDoorUpCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.up();
	}
}
