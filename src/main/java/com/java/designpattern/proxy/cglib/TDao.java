package com.java.designpattern.proxy.cglib;

/**
 * 被代理目标类
 * 
 * @author taomk 2017年4月6日 下午2:57:21
 *
 */
public class TDao {

	public void create() {

		System.out.println("TDao.create() is running. ");
	}

	public void delete() {

		System.out.println("TDao.delete() is running. ");
	}
	
	public void update() {

		System.out.println("TDao.update() is running. ");
	}
	
	public void query() {

		System.out.println("TDao.query() is running. ");
	}
}
