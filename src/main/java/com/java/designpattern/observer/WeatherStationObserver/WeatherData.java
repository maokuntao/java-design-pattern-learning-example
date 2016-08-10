package com.java.designpattern.observer.WeatherStationObserver;

import java.util.Observable;

/**
 * 使用<code>java.util.Observable</code>来创建可观察者
 * 
 * @author taomk 2016年8月10日 下午7:52:25
 */
public class WeatherData extends Observable {

	private float temperature;
	private float humidity;
	private float pressure;

	/**
	 * 继承java.util.Observable之后，不需要再写注册、删除、通知观察者的逻辑。 因为在父类中，已经包含了上述逻辑。
	 * 
	 */

	// 不需要为了记住观察者而建立数据结构
	public WeatherData() {

	}

	public void measurementsChanged() {
		// 指示状态发生了改变
		setChanged();
		// 采用“拉取”的方式，来传递数据
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	public float getTemperature() {
		return temperature;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}
}
