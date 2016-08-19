package com.java.designpattern.adapter.ducks.test;

import com.java.designpattern.adapter.ducks.Duck;
import com.java.designpattern.adapter.ducks.MallardDuck;
import com.java.designpattern.adapter.ducks.TurkeyAdapter;
import com.java.designpattern.adapter.ducks.WildTurkey;

/**
 * 火鸡适配器
 * 
 * @author taomk 2016年8月19日 上午10:30:01
 */
public class TurkeyAdapterTest {

	public static void main(String[] args) {

		System.out.println("The mallard says...");
		MallardDuck mallard = new MallardDuck();
		mallard.quack();
		mallard.fly();

		System.out.println("The turkey says...");
		WildTurkey wildTurkey = new WildTurkey();
		wildTurkey.gobble();
		wildTurkey.fly();

		System.out.println("Ater adapted, the turkeyDuck says...");
		// 将火鸡转换为鸭子µ
		Duck turkeyDuck = new TurkeyAdapter(wildTurkey);
		turkeyDuck.quack();
		turkeyDuck.fly();
	}

}
