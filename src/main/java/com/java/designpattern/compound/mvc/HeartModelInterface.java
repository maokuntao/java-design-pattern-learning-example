package com.java.designpattern.compound.mvc;
  
/**
 * MVC中的M（心跳模型接口）
 * 
 * @author taomk
 * 2016年9月21日 下午8:01:08
 */
public interface HeartModelInterface {
	int getHeartRate();
	void registerObserver(BeatObserver o);
	void removeObserver(BeatObserver o);
	void registerObserver(BPMObserver o);
	void removeObserver(BPMObserver o);
}
