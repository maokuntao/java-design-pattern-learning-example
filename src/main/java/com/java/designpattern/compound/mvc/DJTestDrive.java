package com.java.designpattern.compound.mvc;
  
/**
 * @author taomk
 * 2016年9月21日 下午8:01:08
 */  
public class DJTestDrive {

    @SuppressWarnings("unused")
	public static void main (String[] args) {
        BeatModelInterface model = new BeatModel();
		ControllerInterface controller = new BeatController(model);
    }
}
