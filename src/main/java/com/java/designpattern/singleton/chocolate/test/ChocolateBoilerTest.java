package com.java.designpattern.singleton.chocolate.test;

import com.java.designpattern.singleton.chocolate.ChocolateBoiler;

/**
 * ChocolateBoiler（巧克力锅炉）单例测试类
 * @author taomk
 * 2016年8月16日 下午2:49:04
 */
public class ChocolateBoilerTest {

	public static void main(String[] args) {
		
		ChocolateBoiler boiler = ChocolateBoiler.getInstance();
		boiler.fill();
		boiler.boil();
		boiler.drain();
		
		System.out.println("______________________");
		
		// will return the existing instance
		ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
		System.out.println(boiler == boiler2);
	}

}
