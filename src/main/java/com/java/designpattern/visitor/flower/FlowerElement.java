package com.java.designpattern.visitor.flower;

/**
 * @author taomk 2016年10月11日 下午7:24:30
 *
 */
public interface FlowerElement {
	public void accept(Visitor visitor);
}
