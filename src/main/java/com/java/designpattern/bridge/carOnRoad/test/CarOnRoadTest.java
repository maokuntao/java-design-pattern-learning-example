package com.java.designpattern.bridge.carOnRoad.test;

import com.java.designpattern.bridge.carOnRoad.*;

/**
 * 测试类
 * @author taomk 2016年9月26日 下午7:59:10
 *
 */
public class CarOnRoadTest {

	public static void main(String[] args) {
		
		AbstractCar car = new Car();
		AbstractCar bus = new Bus();
		
		AbstractRoad highWay = new HighWay();
		AbstractRoad street = new Street();

		highWay.aCar = car;
		highWay.run();
		
		highWay.aCar = bus;
		highWay.run();
		
		street.aCar = car;
		street.run();
		
		street.aCar = bus;
		street.run();
	}

}
