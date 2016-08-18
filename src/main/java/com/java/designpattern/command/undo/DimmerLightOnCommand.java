package com.java.designpattern.command.undo;

/**
 * 将灯光调亮的命令
 * @author taomk
 * 2016年8月18日 下午3:14:20
 */
public class DimmerLightOnCommand implements Command {
	Light light;
	int prevLevel;

	public DimmerLightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		prevLevel = light.getLevel();
		light.dim(75);
	}

	public void undo() {
		light.dim(prevLevel);
	}
}
