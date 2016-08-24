package com.java.designpattern.templatemethod.applet;

import java.applet.Applet;
import java.awt.Graphics;

/**
 * Applet中的模版方法模式
 * @author taomk
 * 2016年8月24日 下午3:50:29
 */
public class MyApplet extends Applet {

	private static final long serialVersionUID = -3287315966461412492L;

	String message;
	 
//	init钩子用来进行applet的初始化操作，它会在applet一开始的时候被调用一次
    public void init() {
        message = "Hello World, I'm alive!";
//        让applet的上层组件知道这个组件需要重绘
        repaint();
    }
 
//    start钩子可以让applet正要被显示在网页上时，让applet做一些动作
    public void start() {
        message = "Now I'm starting up...";
        repaint();
    }
 
//    stop钩子在用户调到别的网页时会被调用，applet可以在此做一些事情来停止它的动作
    public void stop() {
        message = "Oh, now I'm being stopped...";
        repaint();
    }
 
//    destroy钩子在applet即将被销毁时（例如，关闭浏览器）被调用
    public void destroy() {
        message = "Goodbye, cruel world";
        repaint();
    }
 
//    paint钩子
    public void paint(Graphics g) {
        g.drawString(message, 5, 15);
    }
}
