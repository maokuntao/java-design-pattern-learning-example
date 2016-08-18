package com.java.designpattern.command.undo;

/**
 * 命令
 * @author taomk
 * 2016年8月18日 下午3:14:20
 */
public interface Command {
	public void execute();
	public void undo();
}
