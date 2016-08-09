package com.java.designpattern.combining.ducks;

/**
 * 
 * 
 * @author taomk 2016年8月8日 下午9:40:53
 */
public abstract class Duck {

	// 为行为接口类型声明两个引用变量

	// 为飞行行为声明一个引用变量
	FlyBehavior flyBehavior;
	// 为呱呱叫行为声明一个引用变量
	QuackBehavior quackBehavior;

	// 为了更加灵活地设置飞行和呱呱叫行为，创建set方法
	public void setFlyBehavior(FlyBehavior fb) {
		this.flyBehavior = fb;
	}

	public void setQuackBehavior(QuackBehavior qb) {
		this.quackBehavior = qb;
	}

	/**
	 * 鸭子的飞行行为
	 */
	public void performFly() {
		// 委托给具体的实现类来实现飞行行为
		flyBehavior.fly();
	}

	/**
	 * 鸭子的呱呱叫行为
	 */
	public void performQuack() {
		// 委托给具体的实现类来实现呱呱叫行为
		quackBehavior.quack();
	}

	/**
	 * 每个鸭子的自我描述都不一样，所以设定为抽象方法
	 */
	public abstract void display();

	/**
	 * 每一只鸭子生下来应该就会游泳，即使是一只冒牌鸭子
	 */
	public void swim() {
		System.out.println("Every duck can swim , even decoys ! ");
	}
}
