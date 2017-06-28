package com.java.designpattern.proxy.staticProxy;

/**
 * 具体用户管理实现类-实现了用户管理接口
 * @author taomk 2017年6月28日 下午7:16:44
 *
 */
public class UserManagerImpl implements UserManager {

	@Override
	public void addUser(String userId, String userName) {
		System.out.println("UserManagerImpl.addUser");
	}

	@Override
	public void delUser(String userId) {
		System.out.println("UserManagerImpl.delUser");
	}

	@Override
	public String findUser(String userId) {
		System.out.println("UserManagerImpl.findUser");
		return "taomk";
	}

	@Override
	public void modifyUser(String userId, String userName) {
		System.out.println("UserManagerImpl.modifyUser");

	}
}
