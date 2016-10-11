package com.java.designpattern.visitor.flower;

/**
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
