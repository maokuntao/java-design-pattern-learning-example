package com.java.designpattern.bridge.carOnRoad;

/**
 * 街道-具体的道路
 * @author taomk 2016年9月26日 下午7:52:42
 *
 */
public class Street extends AbstractRoad {

	@Override
	public void run(){
		super.run();
		aCar.run();
		System.out.println("在街道上行驶");
	}
}
