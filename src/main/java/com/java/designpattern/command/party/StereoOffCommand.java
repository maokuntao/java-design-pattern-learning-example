package com.java.designpattern.command.party;

/**
 * 关闭音响
 * @author taomk
 * 2016年8月18日 下午3:32:29
 */
public class StereoOffCommand implements Command {
	Stereo stereo;
 
	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}
 
	public void execute() {
		stereo.off();
	}

	public void undo() {
		stereo.on();
	}
}
