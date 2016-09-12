package com.java.designpattern.proxy.rmi.virtualproxy;

import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.JComponent;

/**
 *  CD封面显示容器
 *
 * @author taomk
 * 2016年9月12日 下午8:55:54
 */
public class ImageComponent extends JComponent {

	private static final long serialVersionUID = 5407038997654849011L;

	private Icon icon;

	public ImageComponent(Icon icon) {
		this.icon = icon;
	}

	public void setIcon(Icon icon) {
		this.icon = icon;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int w = icon.getIconWidth();
		int h = icon.getIconHeight();
		int x = (800 - w)/2;
		int y = (600 - h)/2;
		icon.paintIcon(this, g, x, y);
	}
}
