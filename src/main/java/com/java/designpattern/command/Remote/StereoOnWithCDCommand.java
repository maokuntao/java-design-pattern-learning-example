package com.java.designpattern.command.Remote;

/**
 * 音响相关命令
 * @author taomk
 * 2016年8月17日 下午9:54:20
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
}
