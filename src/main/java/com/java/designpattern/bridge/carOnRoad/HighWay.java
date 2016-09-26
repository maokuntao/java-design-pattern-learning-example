package com.java.designpattern.bridge.carOnRoad;

/**
 * 高速公路-具体的道路
 * @author taomk 2016年9月26日 下午7:54:28
 *
 */
public class HighWay extends AbstractRoad {

	@Override
	public void run(){
		super.run();
		aCar.run();
		System.out.println("在高速公路上行驶");
	}
}
