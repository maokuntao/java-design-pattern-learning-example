package com.java.designpattern.facade.test;

import com.java.designpattern.facade.*;

/**
 * 
 * 家庭影院门面模式测试类
 * 
 * @author taomk 2016年8月22日 下午9:53:41
 */
public class HomeTheaterTest {
	
	public static void main(String[] args) {
		
		Amplifier amp = new Amplifier("Top-O-Line Amplifier");
		Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
		DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
		CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);
		Projector projector = new Projector("Top-O-Line Projector", dvd);
		TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
		Screen screen = new Screen("Theater Screen");
		PopcornPopper popper = new PopcornPopper("Popcorn Popper");

		// 构造门面对象
		HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, cd, projector, screen, lights, popper);

		// 打开观看电影开关
		homeTheater.watchMovie("Raiders of the Lost Ark");
		// 打开关闭电影开关
		homeTheater.endMovie();
	}
}
