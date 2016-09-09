package com.java.designpattern.proxy.rmi.test;

import com.java.designpattern.proxy.rmi.client.MyRemoteClient;
import com.java.designpattern.proxy.rmi.server.MyRemoteImpl;

/**
 * 测试类<br>
 * <p><b>RMI</b> &nbsp;  参考地址 : <a>http://blog.csdn.net/a19881029/article/details/9465663</a></p>
 * 	
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
