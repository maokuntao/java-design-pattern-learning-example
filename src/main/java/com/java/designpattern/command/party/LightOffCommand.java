package com.java.designpattern.command.party;

/**
 * 关闭电灯的命令
 * @author taomk
 * 2016年8月18日 下午3:32:29
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
