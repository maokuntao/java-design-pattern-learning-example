package com.java.designpattern.visitor.flower;

/**
 * 元素角色：定义一个accept接口方法，便于访问者角色来访问
 * @author taomk 2016年10月11日 下午7:24:30
 *
 */
public interface FlowerElement {
	
	/**
	 * 提供访问者角色对象操作接口
	 * @param visitor 访问者角色
	 */
	public void accept(Visitor visitor);
}
