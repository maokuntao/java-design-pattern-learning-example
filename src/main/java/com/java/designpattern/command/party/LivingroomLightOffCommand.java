package com.java.designpattern.command.party;

/**
 * 关闭起居室电灯的命令
 * @author taomk
 * 2016年8月18日 下午3:32:29
 */
public class LivingroomLightOffCommand implements Command {
	Light light;

	public LivingroomLightOffCommand(Light light) {
		this.light = light;
	}
	public void execute() {
		light.off();
	}
	public void undo() {
		light.on();
	}
}
