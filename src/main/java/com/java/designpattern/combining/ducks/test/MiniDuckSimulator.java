package com.java.designpattern.combining.ducks.test;

import com.java.designpattern.combining.ducks.Duck;
import com.java.designpattern.combining.ducks.FlyRocketPower;
import com.java.designpattern.combining.ducks.MallardDuck;
import com.java.designpattern.combining.ducks.ModelDuck;

/**
 * 测试类
 * 
 * @author taomk 2016年8月8日 下午10:00:41
 */
public class MiniDuckSimulator {

	public static void main(String[] args) {

		// 绿头鸭
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.performFly();
		mallard.performQuack();

		System.out.println();

		// 模型鸭
		Duck modelDuck = new ModelDuck();
		modelDuck.display();
		modelDuck.performQuack();
		// 一开始，模型鸭并不会飞
		modelDuck.performFly();
		System.out.println("I could fly with rocket before long . ");
		// 给模型鸭装上🚀动力之后，
		modelDuck.setFlyBehavior(new FlyRocketPower());
		modelDuck.performFly();

	}
}
