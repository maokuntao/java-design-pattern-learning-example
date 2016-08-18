package com.java.designpattern.command.undo;

/**
 * 关闭电灯命令
 * @author taomk
 * 2016年8月18日 下午3:14:20
 */
public class LightOffCommand implements Command {
	Light light;
 
	public LightOffCommand(Light light) {
		this.light = light;
	}
 
	public void execute() {
		light.off();
	}
 
	public void undo() {
		light.on();
	}
}
