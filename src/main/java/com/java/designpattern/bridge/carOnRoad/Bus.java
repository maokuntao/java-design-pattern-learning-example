package com.java.designpattern.bridge.carOnRoad;

/**
 * 公交车-具体的车
 * @author taomk 2016年9月26日 下午7:57:31
 *
 */
public class Bus extends AbstractCar {

	@Override
	void run() {
		super.run();
		System.out.print("🚌");
	}
}
