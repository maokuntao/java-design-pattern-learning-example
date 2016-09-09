package com.java.designpattern.proxy.rmi.server;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

/**
 * 远程服务方法实现<br>
 * 为了成为远程服务对象，具备某些“远程”功能。最简单的方式是扩展
 * <code>java.rmi.server.UnicastRemoteObject</code>，让超类来帮助完成。
 * 
 * @author taomk
 *
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

	private static final long serialVersionUID = 1L;

	/**
	 * 因为超类的构造抛出了RemoteException，所以也必须写一个构造器。
	 * 
	 * @throws RemoteException
	 */
	public MyRemoteImpl() throws RemoteException {

	}

	@Override
	public String sayHello() throws RemoteException {
		return "Server says , 'Hey'";
	}

	public static void main(String[] args) {
		try {

			// 启动RMI注册服务，指定端口为1099 （1099为默认端口）
			// 也可以通过命令 $ java_home/bin/rmiregistry 1099启动
			// 这里用这种方式避免了再打开一个DOS窗口
			// 而且用命令rmiregistry启动注册服务还必须事先用RMIC生成一个stub类为它所用
			LocateRegistry.createRegistry(1099);

			MyRemote remote = new MyRemoteImpl();
			// 绑定服务实现对象到rmiregistry。客户将使用绑定的名称作为key来在RMI registry中寻找。
			Naming.rebind("RemoteHello", remote);
			
			System.out.println("RMI registry runing...");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
