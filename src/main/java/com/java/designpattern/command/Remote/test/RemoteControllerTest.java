package com.java.designpattern.command.Remote.test;

import com.java.designpattern.command.Remote.CeilingFan;
import com.java.designpattern.command.Remote.CeilingFanOffCommand;
import com.java.designpattern.command.Remote.CeilingFanOnCommand;
import com.java.designpattern.command.Remote.GarageDoor;
import com.java.designpattern.command.Remote.GarageDoorDownCommand;
import com.java.designpattern.command.Remote.GarageDoorUpCommand;
import com.java.designpattern.command.Remote.Light;
import com.java.designpattern.command.Remote.LightOffCommand;
import com.java.designpattern.command.Remote.LightOnCommand;
import com.java.designpattern.command.Remote.RemoteControl;
import com.java.designpattern.command.Remote.Stereo;
import com.java.designpattern.command.Remote.StereoOffCommand;
import com.java.designpattern.command.Remote.StereoOnWithCDCommand;

/**
 * 遥控器测试类
 * @author taomk
 * 2016年8月17日 下午9:54:20
 */
public class RemoteControllerTest {
 
	public static void main(String[] args) {
		
		RemoteControl remoteControl = new RemoteControl();
 
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan= new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor("");
		Stereo stereo = new Stereo("Living Room");
  
		LightOnCommand livingRoomLightOn = 
				new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = 
				new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = 
				new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = 
				new LightOffCommand(kitchenLight);
  
		CeilingFanOnCommand ceilingFanOn = 
				new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = 
				new CeilingFanOffCommand(ceilingFan);
 
		GarageDoorUpCommand garageDoorUp =
				new GarageDoorUpCommand(garageDoor);
		GarageDoorDownCommand garageDoorDown =
				new GarageDoorDownCommand(garageDoor);
 
		StereoOnWithCDCommand stereoOnWithCD =
				new StereoOnWithCDCommand(stereo);
		StereoOffCommand  stereoOff =
				new StereoOffCommand(stereo);
 
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
		remoteControl.setCommand(3, garageDoorUp, garageDoorDown);
		remoteControl.setCommand(4, stereoOnWithCD, stereoOff);
  
		System.out.println(remoteControl);
 
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);
		remoteControl.onButtonWasPushed(4);
		remoteControl.offButtonWasPushed(4);
	}
}
