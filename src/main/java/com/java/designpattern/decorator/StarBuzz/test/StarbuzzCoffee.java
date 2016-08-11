package com.java.designpattern.decorator.StarBuzz.test;

import com.java.designpattern.decorator.StarBuzz.Beverage;
import com.java.designpattern.decorator.StarBuzz.DarkRoast;
import com.java.designpattern.decorator.StarBuzz.Espresso;
import com.java.designpattern.decorator.StarBuzz.HouseBlend;
import com.java.designpattern.decorator.StarBuzz.Mocha;
import com.java.designpattern.decorator.StarBuzz.Soy;
import com.java.designpattern.decorator.StarBuzz.Whip;

/**
 * @author taomk
 * 2016年8月11日 下午4:41:45
 */
public class StarbuzzCoffee {

	public static void main(String[] args) {
		
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() 
				+ " $" + beverage.cost());
		
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);// 加入第一份抹茶调料
		beverage2 = new Mocha(beverage2);// 加入第二份抹茶调料
		beverage2 = new Whip(beverage2);// 加入奶泡调料
		System.out.println(beverage2.getDescription() 
				+ " $" + beverage.cost());
		
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() 
				+ " $" + beverage3.cost());
	}
}
