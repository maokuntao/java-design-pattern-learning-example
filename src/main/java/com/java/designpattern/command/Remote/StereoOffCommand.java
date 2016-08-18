package com.java.designpattern.command.Remote;

/**
 * 音响关闭命令
 * @author taomk
 * 2016年8月17日 下午9:54:20
 */
public class StereoOffCommand implements Command {
	Stereo stereo;
 
	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}
 
	public void execute() {
		stereo.off();
	}
}
