package com.java.designpattern.compound.mvc;
  
import javax.swing.*;

/**
 * @author taomk
 * 2016年9月21日 下午8:01:08
 */
public class BeatBar extends JProgressBar implements Runnable { 
    private static final long serialVersionUID = -4726963232310569051L;
    
	JProgressBar progressBar;
	Thread thread;

	public BeatBar() {
		thread = new Thread(this);
		setMaximum(100);
		thread.start();
	}

	public void run() {
		for(;;) {
			int value = getValue();
			value = (int)(value * .75);
			setValue(value);
			repaint();
			try {
				Thread.sleep(50);
			} catch (Exception e) {};
		}
	}
}
