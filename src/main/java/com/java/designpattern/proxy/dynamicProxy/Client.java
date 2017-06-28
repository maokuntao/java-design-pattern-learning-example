package com.java.designpattern.proxy.dynamicProxy;

import com.java.designpattern.proxy.staticProxy.UserManager;
import com.java.designpattern.proxy.staticProxy.UserManagerImpl;

/**
 * 客户端调用
 * 
 * @author taomk 2017年6月28日 下午7:39:25
 *
 */
public class Client {

	public static void main(String[] args) {
		
		// 动态代理模式
		LogHandler logger = new LogHandler(new UserManagerImpl());
		UserManager userManager = (UserManager) logger.newProxyInstance();
		userManager.addUser("2333", "Zzz");
	}

}
