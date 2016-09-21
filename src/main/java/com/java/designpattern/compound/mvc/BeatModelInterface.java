package com.java.designpattern.compound.mvc;
  
/**
 * MVC中的M（节拍模型接口）
 * 
 * @author taomk
 * 2016年9月21日 下午8:01:08
 */
public interface BeatModelInterface {
	void initialize();
  
	void on();
  
	void off();
  
    void setBPM(int bpm);
  
	int getBPM();
  
	void registerObserver(BeatObserver o);
  
	void removeObserver(BeatObserver o);
  
	void registerObserver(BPMObserver o);
  
	void removeObserver(BPMObserver o);
}
