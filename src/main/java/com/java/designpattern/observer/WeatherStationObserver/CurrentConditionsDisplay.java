package com.java.designpattern.observer.WeatherStationObserver;

import java.util.Observable;
import java.util.Observer;

/**
 * 显示目前信息的布告板 <br>
 * <ul>
 * <li>实现了<code>java.util.Observer</code>接口</li>
 * <li>实现了DisplayElement接口，用于展示数据</li>
 * </ul>
 * 
 * @author taomk 2016年8月10日 下午7:45:27
 */
public class CurrentConditionsDisplay implements DisplayElement, Observer {

	/**
	 * 引入可观察者
	 */
	Observable observable;

	private float temperature;
	private float humidity;

	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Observable obs, Object arg) {
		if(obs instanceof WeatherData){
			WeatherData weatherData = (WeatherData)obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
		}
		
		display();
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
	}

}
