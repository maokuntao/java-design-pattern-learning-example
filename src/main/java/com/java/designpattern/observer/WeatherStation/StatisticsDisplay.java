package com.java.designpattern.observer.WeatherStation;

/**
 * 显示统计信息的布告板
 * 
 * @author taomk 2016年8月10日 下午3:02:27
 */
public class StatisticsDisplay implements DisplayElement, Observer {

	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum = 0.0f;

	private int numberReadings = 0;

	@SuppressWarnings("unused")
	private WeatherData weatherData;

	public StatisticsDisplay(WeatherData wd) {
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
		tempSum += temp;
		numberReadings++;

		if (temp > maxTemp) {
			maxTemp = temp;
		}

		if (temp < minTemp) {
			minTemp = temp;
		}

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
		System.out.println("Statistics Conditions : Avg/Max/Min temperature = " + (tempSum / numberReadings) + "/" + maxTemp + "/" + minTemp);
	}

}
