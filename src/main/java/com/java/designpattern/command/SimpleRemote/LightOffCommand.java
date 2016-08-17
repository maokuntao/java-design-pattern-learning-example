package com.java.designpattern.command.SimpleRemote;

/**
 * 关闭电灯命令
 * @author taomk
 * 2016年8月17日 下午9:57:49
 */
public class LightOffCommand implements Command {
	
	Light light;
	
	public LightOffCommand(Light light){
		this.light = light;
	}

	/* (non-Javadoc)
	 * @see com.java.designpattern.command.SimpleRemote.Command#excute()
	 */
	@Override
	public void execute() {
		light.off();
	}

}
