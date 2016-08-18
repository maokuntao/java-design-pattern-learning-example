package com.java.designpattern.command.party;

/**
 * 打开音响
 * @author taomk
 * 2016年8月18日 下午3:32:29
 */
public class StereoOnCommand implements Command {
	Stereo stereo;

	public StereoOnCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	public void execute() {
		stereo.on();
	}

	public void undo() {
		stereo.off();
	}
}
