package com.java.designpattern.compound.mvc;
  
/**
 * @author taomk
 * 2016年9月21日 下午8:01:08
 */  
public interface ControllerInterface {
	void start();
	void stop();
	void increaseBPM();
	void decreaseBPM();
 	void setBPM(int bpm);
}
