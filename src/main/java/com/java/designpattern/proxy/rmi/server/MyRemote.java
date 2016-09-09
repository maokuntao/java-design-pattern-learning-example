package com.java.designpattern.proxy.rmi.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 远程服务接口<br>
 * <i>必须实现<code>java.rmi.Remote</code>接口</i>
 * @author taomk 2016-09-09 09:39
 *
 */
public interface MyRemote extends Remote {

	/**
	 * 所有的方法都是建立通过远程调用实现的，是建立在网络和I/O基础上的，所以抛出<code>java.rmi.RemoteException</code>是有必要的 
	 * 
	 */
	public String sayHello() throws RemoteException;
}
