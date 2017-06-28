package com.java.designpattern.proxy.staticProxy;

/**
 * @author taomk 2017年6月28日 下午7:15:45
 *
 */
public interface UserManager {

	public void addUser(String userId, String userName);
	public void delUser(String userId);
	public String findUser(String userId);
	public void modifyUser(String userId, String userName);
}
