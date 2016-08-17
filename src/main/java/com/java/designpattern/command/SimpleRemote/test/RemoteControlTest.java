package com.java.designpattern.command.SimpleRemote.test;

import com.java.designpattern.command.SimpleRemote.GarageDoor;
import com.java.designpattern.command.SimpleRemote.GarageDoorOpenCommand;
import com.java.designpattern.command.SimpleRemote.Light;
import com.java.designpattern.command.SimpleRemote.LightOffCommand;
import com.java.designpattern.command.SimpleRemote.LightOnCommand;
import com.java.designpattern.command.SimpleRemote.SimpleRemoteControl;

/**
 * 命令模式－遥控器测试
 * @author taomk
 * 2016年8月17日 下午10:04:23
 */
public class RemoteControlTest {

	public static void main(String[] args) {
		
		SimpleRemoteControl controller = new SimpleRemoteControl();
		
		LightOnCommand lightOn = new LightOnCommand(new Light());
		LightOffCommand lightOff = new LightOffCommand(new Light());
		
		GarageDoorOpenCommand doorOpen = new GarageDoorOpenCommand(new GarageDoor());
		
		controller.setCommand(lightOn);
		controller.buttonWasPressed();
		
		controller.setCommand(lightOff);
		controller.buttonWasPressed();
		
		controller.setCommand(doorOpen);
		controller.buttonWasPressed();
		
	}

}
