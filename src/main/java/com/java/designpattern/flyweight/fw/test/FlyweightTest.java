package com.java.designpattern.flyweight.fw.test;

import com.java.designpattern.flyweight.fw.*;

/**
 * 测试类
 * @author taomk 2016年9月27日 下午8:03:22
 *
 */
public class FlyweightTest {

	public static void main(String[] args) {
		
		FlyweightFactory factory = new FlyweightFactory();
		
		Flyweight fw1 = factory.getFlyweight("Google");
		Flyweight fw2 = factory.getFlyweight("Apple");
		Flyweight fw3 = factory.getFlyweight("Facebook");
		Flyweight fw4 = factory.getFlyweight("Google");
		Flyweight fw5 = factory.getFlyweight("Google");
		Flyweight fw6 = factory.getFlyweight("Google");
		
		System.out.println("Flyweight's size = " + factory.getFlyweightSize());
		
		fw1.operate();
		fw2.operate();
		fw3.operate();
		fw4.operate();
		fw5.operate();
		fw6.operate();
		
	}

}
