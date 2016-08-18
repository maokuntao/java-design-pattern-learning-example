package com.java.designpattern.command.party;

/**
 * 用CD打开音响命令
 * @author taomk
 * 2016年8月18日 下午3:32:29
 */
public class StereoOnWithCDCommand implements Command {
	Stereo stereo;
 
	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}
 
	public void execute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume(11);
	}

	public void undo() {
		stereo.off();
	}
}
