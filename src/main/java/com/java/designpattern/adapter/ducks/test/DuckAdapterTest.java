package com.java.designpattern.adapter.ducks.test;

import com.java.designpattern.adapter.ducks.DuckAdapter;
import com.java.designpattern.adapter.ducks.MallardDuck;
import com.java.designpattern.adapter.ducks.Turkey;
import com.java.designpattern.adapter.ducks.WildTurkey;

/**
 * 鸭子适配器测试类
 * 
 * @author taomk 2016年8月19日 上午10:20:41
 */
public class DuckAdapterTest {

	public static void main(String[] args) {

		System.out.println("The turkey says...");
		WildTurkey wildTurkey = new WildTurkey();
		wildTurkey.gobble();
		wildTurkey.fly();

		System.out.println("The duck says...");
		MallardDuck mallard = new MallardDuck();
		mallard.quack();
		mallard.fly();

		System.out.println("After adapted, the duckTurkey says...");
		// 将一只鸭子转换为一只火鸡
		Turkey duckTurkey = new DuckAdapter(mallard);
		duckTurkey.gobble();
		duckTurkey.fly();
	}

}
