package com.java.designpattern.visitor.flower;

/**
 * 访问者角色：为具体的元素角色声明访问操作接口
 * 
 * @author taomk 2016年10月11日 下午7:23:55
 *
 */
public interface Visitor {
	
	/**
	 * 为具体的元素角色（剑兰花）声明访问操作接口
	 * 
	 * @param gladiolus 剑兰花对象
	 */
	public void visit(GladiolusConcreteElement gladiolus);

	/**
	 * 为具体的元素角色（菊花）声明访问操作接口
	 * 
	 * @param chrysanthemum 菊花对象
	 */
	public void visit(ChrysanthemumConreteElement chrysanthemum);
}
