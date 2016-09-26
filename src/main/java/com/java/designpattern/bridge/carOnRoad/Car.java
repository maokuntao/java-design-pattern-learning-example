package com.java.designpattern.bridge.carOnRoad;

/**
 * 小汽车-具体的车
 * @author taomk 2016年9月26日 下午7:55:52
 *
 */
public class Car extends AbstractCar {

	@Override
	void run() {
		super.run();
		System.out.print("🚗");
	}
}
