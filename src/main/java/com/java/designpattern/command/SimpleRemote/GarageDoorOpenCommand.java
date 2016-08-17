package com.java.designpattern.command.SimpleRemote;

/**
 * 打开车库门命令
 * 
 * @author taomk 2016年8月17日 下午9:56:26
 */
public class GarageDoorOpenCommand implements Command {
	
	GarageDoor garageDoor;

	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}


	@Override
	public void execute() {
		garageDoor.up();
		
	}

}