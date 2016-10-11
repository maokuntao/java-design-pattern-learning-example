package com.java.designpattern.visitor.flower;

/**
 * @author taomk 2016年10月11日 下午7:24:58
 *
 */
public class GladiolusConcreteElement implements FlowerElement {

	@Override
	public void accept(Visitor visitor) {
		 visitor.visit(this);
	}

}
