package com.java.designpattern.observer.WeatherStation;

import java.util.ArrayList;
import java.util.List;

/**
 * WeatherData作为一个主题
 * 
 * @author taomk 2016年8月9日 下午6:37:20
 */
public class WeatherData implements Subject {

	// 用于记录观察者
	private List<Observer> observerList;
	// 温度值
	private float temperature;
	// 气压
	private float pressure;
	// 湿度
	private float humidity;

	public WeatherData() {
		// 初始化建立观察者集合
		observerList = new ArrayList<Observer>();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.java.designpattern.observer.weatherstation.Subject#registerObserver(
	 * com.java.designpattern.observer.weatherstation.Observer)
	 */
	@Override
	public void registerObserver(Observer o) {
		observerList.add(o);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.java.designpattern.observer.weatherstation.Subject#removeObserver(com
	 * .java.designpattern.observer.weatherstation.Observer)
	 */
	@Override
	public void removeObserver(Observer o) {
		if(o==null || !observerList.contains(o)){
			return ;
		}else{
			observerList.remove(o);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.java.designpattern.observer.weatherstation.Subject#notifyObservers()
	 */
	@Override
	public void notifyObservers() {
		for (Observer observer : observerList) {
			observer.update(temperature, humidity, pressure);
		}
	}
	
	/**
	 *  当更新观测值时，通知所有的观察者
	 */
	public void measurementChanged(){
		notifyObservers();
	}
	
	/**
	 * 更新观测值，并通知所有的观察者
	 * 
	 * @param temperature
	 * @param pressure
	 * @param humidity
	 */
	public void setMeasurements(float temperature , float pressure , float humidity){
		this.humidity = humidity;
		this.pressure = pressure;
		this.temperature = temperature;
		measurementChanged();
	}

}
