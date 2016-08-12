package com.java.designpattern.observer.WeatherStationObserver.test;

import com.java.designpattern.observer.WeatherStationObserver.CurrentConditionsDisplay;
import com.java.designpattern.observer.WeatherStationObserver.ForecastDisplay;
import com.java.designpattern.observer.WeatherStationObserver.HeatIndexDisplay;
import com.java.designpattern.observer.WeatherStationObserver.StatisticsDisplay;
import com.java.designpattern.observer.WeatherStationObserver.WeatherData;

/**
 * 气象站－测试类
 * 
 * @author taomk 2016年8月10日 下午10:03:59
 */
public class WeatherStation {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
		
	}
	
}
