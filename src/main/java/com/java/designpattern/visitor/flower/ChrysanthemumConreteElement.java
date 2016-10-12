package com.java.designpattern.visitor.flower;

/**
 * 具体的元素角色：菊花角色
 * 
 * @author taomk 2016年10月11日 下午7:25:31
 *
 */
public class ChrysanthemumConreteElement implements FlowerElement {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
