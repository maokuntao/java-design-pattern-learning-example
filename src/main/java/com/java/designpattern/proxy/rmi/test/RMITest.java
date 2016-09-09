package com.java.designpattern.proxy.rmi.test;

import com.java.designpattern.proxy.rmi.client.MyRemoteClient;
import com.java.designpattern.proxy.rmi.server.MyRemoteImpl;

/**
 * 测试类
 *
 * @author taomk
 * 2016年9月9日 上午10:32:37
 */
public class RMITest {

	public static void main(String[] args) {
		MyRemoteImpl.main(args);
		MyRemoteClient.main(args);
	}

}
