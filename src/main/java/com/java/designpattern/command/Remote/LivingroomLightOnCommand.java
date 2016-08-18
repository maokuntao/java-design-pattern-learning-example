package com.java.designpattern.command.Remote;

/**
 * 起居室电灯打开命令
 * @author taomk
 * 2016年8月17日 下午9:54:20
 */
public class LivingroomLightOnCommand implements Command {
	Light light;

	public LivingroomLightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.on();
	}
}
