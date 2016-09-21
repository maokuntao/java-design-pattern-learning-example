package com.java.designpattern.compound.mvc;
  
import javax.swing.*;

/**
 * 节拍器进度条
 * 
 * @author taomk
 * 2016年9月21日 下午8:01:08
 */
public class BeatBar extends JProgressBar implements Runnable { 
    private static final long serialVersionUID = -4726963232310569051L;
    
	JProgressBar progressBar;
	Thread thread;

//	没创建一个BeatBar对象，就新启动一个线程
	public BeatBar() {
		thread = new Thread(this);
//		设置进度条最大值
		setMaximum(100);
		thread.start();
	}

	public void run() {
		for(;;) {
//			得到当前进度条的值
			int value = getValue();
			value = (int)(value * .75);
//			设置当前进度条的值
			setValue(value);
//			重新绘制页面显示
			repaint();
			try {
				Thread.sleep(50);
			} catch (Exception e) {};
		}
	}
}
