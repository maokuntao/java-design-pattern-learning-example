package com.java.designpattern.compound.mvc.test;

import com.java.designpattern.compound.mvc.*;
  
/**
 * @author taomk
 * 2016年9月21日 下午8:01:08
 */  
public class HeartTestDrive {

    @SuppressWarnings("unused")
	public static void main (String[] args) {
		HeartModel heartModel = new HeartModel();
        ControllerInterface model = new HeartController(heartModel);
    }
}
