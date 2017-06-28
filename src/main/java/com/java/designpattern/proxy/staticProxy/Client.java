package com.java.designpattern.proxy.staticProxy;

/**
 * 客户端调用
 * 
 * @author taomk 2017年6月28日 下午7:21:19
 *
 */
public class Client {

	public static void main(String[] args) {

		// 静态代理模式，此处创建 new UserManagerImpl() 时可以通过一个工程来实现
		UserManager userManager = new UserManagerImplProxy(new UserManagerImpl());
		userManager.addUser("23333", "TTT");
	}

}
