package com.java.designpattern.templatemethod.jframe;

import java.awt.Graphics;

import javax.swing.JFrame;

/**
 * JFrame中的模版方法模式
 * @author taomk
 * 2016年8月24日 下午3:46:56
 */
public class MyFrame extends JFrame {

	private static final long serialVersionUID = -3581937486249372724L;
	
	public MyFrame(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setSize(300,300);
		this.setVisible(true);
	}
	
//	JFrame提供的钩子
	public void paint(Graphics graphics) {
		super.paint(graphics);
		String msg = "I rule!!";
		graphics.drawString(msg, 100, 100);
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		MyFrame myFrame = new MyFrame("Head First Design Patterns");
	}
}
