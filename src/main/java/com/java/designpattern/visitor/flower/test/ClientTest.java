package com.java.designpattern.visitor.flower.test;

import com.java.designpattern.visitor.flower.*;

/**
 * 测试类
 * 
 * @author taomk 2016年10月11日 下午7:28:13
 *
 */
public class ClientTest {

	public static void main(final String[] args) {

		// 实例化对象结构角色对象，并添加元素角色
		final ObjectStructure os = new ObjectStructure();
		os.addElement(new GladiolusConcreteElement());
		os.addElement(new ChrysanthemumConreteElement());

		// 实例化具体的访问者对象
		final GladiolusVisitor gVisitor = new GladiolusVisitor();
		final ChrysanthemumVisitor chVisitor = new ChrysanthemumVisitor();

		// 被访问元素接受访问者访问
		os.accept(gVisitor);
		os.accept(chVisitor);

	}
}
