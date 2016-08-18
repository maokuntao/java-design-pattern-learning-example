package com.java.designpattern.command.party;

/**
 * 打开起居室电灯的命令
 * @author taomk
 * 2016年8月18日 下午3:32:29
 */
public class LivingroomLightOnCommand implements Command {
	Light light;

	public LivingroomLightOnCommand(Light light) {
		this.light = light;
	}
	public void execute() {
		light.on();
	}
	public void undo() {
		light.off();
	}
}
