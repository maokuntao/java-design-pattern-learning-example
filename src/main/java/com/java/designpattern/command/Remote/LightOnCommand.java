package com.java.designpattern.command.Remote;

/**
 * 电灯打开命令
 * @author taomk
 * 2016年8月17日 下午9:54:20
 */
public class LightOnCommand implements Command {
	Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.on();
	}
}
