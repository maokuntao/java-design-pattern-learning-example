package com.java.designpattern.visitor.flower;

/**
 * @author taomk 2016年10月11日 下午7:25:31
 *
 */
public class ChrysanthemumConreteElement implements FlowerElement {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
