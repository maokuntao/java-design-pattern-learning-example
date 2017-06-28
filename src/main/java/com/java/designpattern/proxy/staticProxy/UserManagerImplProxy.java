package com.java.designpattern.proxy.staticProxy;

/**
 * 代理类--代理用户管理实现类
 * 
 * @author taomk 2017年6月28日 下午7:19:08
 *
 */
public class UserManagerImplProxy implements UserManager {

	// 目标对象
	private UserManager userManager;

	// 通过构造方法传入目标对象
	public UserManagerImplProxy(UserManager userManager) {
		this.userManager = userManager;
	}

	@Override
	public void addUser(String userId, String userName) {
		try {
			// 添加打印日志的功能
			// 开始添加用户
			System.out.println("start-->addUser()");
			userManager.addUser(userId, userName);
			// 添加用户成功
			System.out.println("success-->addUser()");
		} catch (Exception e) {
			// 添加用户失败
			System.out.println("error-->addUser()");
		}
	}

	@Override
	public void delUser(String userId) {
		userManager.delUser(userId);
	}

	@Override
	public String findUser(String userId) {
		userManager.findUser(userId);
		return "taomk from proxy";
	}

	@Override
	public void modifyUser(String userId, String userName) {
		userManager.modifyUser(userId, userName);
	}
}
