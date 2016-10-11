package com.java.designpattern.visitor.flower;

/**
 * @author taomk 2016年10月11日 下午7:23:55
 *
 */
public interface Visitor {
	
	public void visit(GladiolusConcreteElement gladiolus);

	public void visit(ChrysanthemumConreteElement chrysanthemum);
}
