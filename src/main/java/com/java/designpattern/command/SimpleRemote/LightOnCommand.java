package com.java.designpattern.command.SimpleRemote;

/**
 * 打开电灯命令
 * @author taomk
 * 2016年8月17日 下午9:57:49
 */
public class LightOnCommand implements Command {
	
	Light light;
	
	public LightOnCommand(Light light){
		this.light = light;
	}

	/* (non-Javadoc)
	 * @see com.java.designpattern.command.SimpleRemote.Command#excute()
	 */
	@Override
	public void execute() {
		light.on();
	}

}
