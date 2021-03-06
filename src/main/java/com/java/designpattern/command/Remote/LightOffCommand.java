package com.java.designpattern.command.Remote;

/**
 * 起居室电灯关闭命令
 * @author taomk
 * 2016年8月17日 下午9:54:20
 */
public class LightOffCommand implements Command {
	Light light;
 
	public LightOffCommand(Light light) {
		this.light = light;
	}
 
	public void execute() {
		light.off();
	}
}
