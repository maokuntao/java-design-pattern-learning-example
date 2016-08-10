package com.java.designpattern.observer.WeatherStation;

/**
 * 显示目前信息的布告板 <br>
 * <ul>
 * <li>实现了Observer接口，所以可以从WeatherData对象中获得改变</li>
 * <li>实现了DisplayElement接口，用于展示数据</li>
 * </ul>
 * 
 * @author taomk 2016年8月10日 下午2:28:27
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

	// 当前状态布告板，只显示温度和湿度
	private float temperature;
	private float humidity;

	// 以后有可能会取消注册，此处保留这个引用便于以后调用
	@SuppressWarnings("unused")
	private Subject weatherData;

	public CurrentConditionsDisplay(WeatherData wd) {
		this.weatherData = wd;
		wd.registerObserver(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.java.designpattern.observer.weatherstation.DisplayElement#display()
	 */
	@Override
	public void display() {

		System.out.println("Current Conditions : " + temperature + "F degress and " + humidity + "% humidity .");
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
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}

}
