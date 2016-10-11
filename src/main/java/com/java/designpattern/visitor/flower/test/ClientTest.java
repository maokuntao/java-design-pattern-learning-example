package com.java.designpattern.visitor.flower.test;

import com.java.designpattern.visitor.flower.*;

/**
 * @author taomk 2016年10月11日 下午7:28:13
 *
 */
public class ClientTest {
	public static void main(final String[] args)
    {
        final ObjectStructure os = new ObjectStructure();
        os.addElement(new GladiolusConcreteElement());
        os.addElement(new ChrysanthemumConreteElement());

        final GladiolusVisitor gVisitor = new GladiolusVisitor();
        final ChrysanthemumVisitor chVisitor = new ChrysanthemumVisitor();

        os.accept(gVisitor);
        os.accept(chVisitor);

    }
}
