package com.java.designpattern.observer.WeatherStation.test;

import com.java.designpattern.observer.WeatherStation.CurrentConditionsDisplay;
import com.java.designpattern.observer.WeatherStation.ForecastDisplay;
import com.java.designpattern.observer.WeatherStation.StatisticsDisplay;
import com.java.designpattern.observer.WeatherStation.WeatherData;

/**
 * 气象站－测试类
 * 
 * @author taomk 2016年8月10日 下午2:43:15
 */
public class WeatherStation {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// 建立WeatherData对象
		WeatherData wd = new WeatherData();
		// 创建各观察者对象（同时保证了该对象已经注册成为观察者）
		CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(wd);
		ForecastDisplay fd = new ForecastDisplay(wd);
		StatisticsDisplay sd = new StatisticsDisplay(wd);
		HeatIndexDisplay hd = new HeatIndexDisplay(wd);

		// 模拟改变观测值
		wd.setMeasurements(80, 65, 30.4F);
		wd.setMeasurements(82, 75, 29.2F);
		wd.setMeasurements(78, 90, 29.5F);

	}

}
