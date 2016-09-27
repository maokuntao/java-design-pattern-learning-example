package com.java.designpattern.flyweight.fw;

/**
 * 具体的Flyweight类
 * @author taomk 2016年9月27日 下午7:55:01
 *
 */
public class ConcreteFlyweight extends Flyweight {
	
	private String param;
	
	public ConcreteFlyweight(String param){
		this.param = param;
	}

	@Override
	public void operate() {
		System.out.println("ConcreteFlyweight : " + param);
	}

}
