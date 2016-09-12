package com.java.designpattern.proxy.gumballrmi.test;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import com.java.designpattern.proxy.gumballrmi.GumballMachine;
import com.java.designpattern.proxy.gumballrmi.GumballMachineRemote;
import com.java.designpattern.proxy.gumballrmi.GumballMonitor;

/**
 * 糖果机测试类
 *
 * @author taomk 2016年9月12日 下午6:55:46
 */

public class GumballMonitorTest {

	public static void main(String[] args) {

		// 开启rmi注册服务
		try {
			LocateRegistry.createRegistry(1099);
			System.out.println("RMI registry runing...");
		} catch (RemoteException e1) {
			System.err.println(e1);
		}

		// 被监视的位置，元素是每一台机器的位置
//		String[] location = { 
//				"//santafe.mightygumball.com/gumballmachine",
//				"//boulder.mightygumball.com/gumballmachine", 
//				"//seattle.mightygumball.com/gumballmachine" };
		String[] location = { 
				"a",
				"b", 
				"c" };

		try {
			
			Naming.rebind(location[0], new GumballMachine(location[0], 100));
			Naming.rebind(location[1], new GumballMachine(location[1], 100));
			Naming.rebind(location[2], new GumballMachine(location[2], 250));
			
		} catch (RemoteException e1) {
			e1.printStackTrace();
		} 
		catch (MalformedURLException e) {
			e.printStackTrace();
		}

		// 创建监视器数组
		GumballMonitor[] monitor = new GumballMonitor[location.length];

		for (int i = 0; i < location.length; i++) {
			try {
				// 为每一个远程机器创建一个代理
				GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location[i]);
				monitor[i] = new GumballMonitor(machine);
				System.out.println(monitor[i]);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		// 遍历每台机器，将报告打印出来
		for (int i = 0; i < monitor.length; i++) {
			monitor[i].report();
		}
	}
}
