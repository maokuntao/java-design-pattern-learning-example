package com.java.designpattern.observer.WeatherStation.test;

import com.java.designpattern.observer.WeatherStation.DisplayElement;
import com.java.designpattern.observer.WeatherStation.Observer;
import com.java.designpattern.observer.WeatherStation.WeatherData;

/**
 * 酷热指数布告板
 * 
 * @author taomk 2016年8月10日 下午3:38:29
 */
public class HeatIndexDisplay implements DisplayElement, Observer {

	float heatIndex = 0.0f;

	@SuppressWarnings("unused")
	private WeatherData weatherData;

	public HeatIndexDisplay(WeatherData wd) {
		this.weatherData = wd;
		wd.registerObserver(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.java.designpattern.observer.weatherstation.Observer#update(float,
	 * float, float)
	 */
	@Override
	public void update(float temp, float humidity, float pressure) {
		heatIndex = computeHeatIndex(temp , humidity);
		display();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.java.designpattern.observer.weatherstation.DisplayElement#display()
	 */
	@Override
	public void display() {
		System.out.println("HeatIndex Conditions : heatIndex = " + heatIndex);
	}

	private float computeHeatIndex(float temperature, float humidity) {
		float index = (float) ((16.923 + (0.185212 * temperature) + (5.37941 * humidity)
				- (0.100254 * temperature * humidity) + (0.00941695 * (temperature * temperature))
				+ (0.00728898 * (humidity * humidity)) + (0.000345372 * (temperature * temperature * humidity))
				- (0.000814971 * (temperature * humidity * humidity))
				+ (0.0000102102 * (temperature * temperature * humidity * humidity))
				- (0.000038646 * (temperature * temperature * temperature))
				+ (0.0000291583 * (humidity * humidity * humidity))
				+ (0.00000142721 * (temperature * temperature * temperature * humidity))
				+ (0.000000197483 * (temperature * humidity * humidity * humidity))
				- (0.0000000218429 * (temperature * temperature * temperature * humidity * humidity))
				+ 0.000000000843296 * (temperature * temperature * humidity * humidity * humidity))
				- (0.0000000000481975 * (temperature * temperature * temperature * humidity * humidity * humidity)));
		return index;
	}
}
