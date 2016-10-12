package com.java.designpattern.visitor.flower;

/**
 * 具体的元素角色：剑兰花角色
 * 
 * @author taomk 2016年10月11日 下午7:24:58
 *
 */
public class GladiolusConcreteElement implements FlowerElement {

	@Override
	public void accept(Visitor visitor) {
		 visitor.visit(this);
	}

}
