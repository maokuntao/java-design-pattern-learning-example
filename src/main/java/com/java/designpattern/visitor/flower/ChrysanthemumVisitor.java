package com.java.designpattern.visitor.flower;

/**
 * 具体访问者角色：实现了菊花对象访问者的具体访问操作
 * 
 * @author taomk 2016年10月11日 下午7:29:14
 *
 */
public class ChrysanthemumVisitor implements Visitor{


	@Override
	public void visit(GladiolusConcreteElement gladiolus) {
		System.out.println(this.getClass().getSimpleName() + " access " + gladiolus.getClass().getSimpleName());
	}

	@Override
	public void visit(ChrysanthemumConreteElement chrysanthemum) {
		System.out.println(this.getClass().getSimpleName() + " access " + chrysanthemum.getClass().getSimpleName());
	}


}
