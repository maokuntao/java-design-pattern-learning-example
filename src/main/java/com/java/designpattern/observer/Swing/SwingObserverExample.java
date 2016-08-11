package com.java.designpattern.observer.Swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Swing里大量使用了观察者模式，此处是一个小示例。
 * 
 * @author taomk 2016年8月11日 上午9:53:44
 */
public class SwingObserverExample {

	JFrame frame;

	public static void main(String[] args) {
		new SwingObserverExample().start();
	}

	private void start() {
		frame = new JFrame();

		JButton button = new JButton("Should I do it ?");
		// 制造两个观察者，一个天使，一个恶魔
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());

		// Set frame properties
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.CENTER, button);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

}

class AngelListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Don't do it , you might regret it !");
	}
}

class DevilListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Come on , do it !");
	}
}
