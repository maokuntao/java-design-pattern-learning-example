package com.java.designpattern.proxy.rmi.client;

import java.rmi.Naming;

import com.java.designpattern.proxy.rmi.server.MyRemote;

/**
 * 远程服务客户端
 * @author taomk 2016-09-09 09:58
 *
 */
public class MyRemoteClient {

	public static void main(String[] args) {
		new MyRemoteClient().go();
	}

	public void go(){
		try {
			
			// RMI registry中寻找注册的远程服务对象
			MyRemote remoteService = (MyRemote) Naming.lookup("RemoteHello");
			String result = remoteService.sayHello();
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
