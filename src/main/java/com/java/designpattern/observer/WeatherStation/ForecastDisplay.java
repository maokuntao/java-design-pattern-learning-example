package com.java.designpattern.observer.WeatherStation;

/**
 * 显示预报信息的布告板
 * 
 * @author taomk
 * 2016年8月10日 下午2:54:01
 */
public class ForecastDisplay implements DisplayElement, Observer {

	private float currentPressure=29.2f;
	private float lastPressure;
	
	@SuppressWarnings("unused")
	private WeatherData weatherData;
	
	public ForecastDisplay(WeatherData wd) {
		this.weatherData = wd;
		wd.registerObserver(this);
	}
	
	/* (non-Javadoc)
	 * @see com.java.designpattern.observer.weatherstation.Observer#update(float, float, float)
	 */
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.lastPressure = currentPressure;
		this.currentPressure = pressure;
		display();
	}

	/* (non-Javadoc)
	 * @see com.java.designpattern.observer.weatherstation.DisplayElement#display()
	 */
	@Override
	public void display() {
		System.out.print("Forecast Conditions : ");
		if(currentPressure > lastPressure){
			System.out.println("Improving weather on the way !");
		}else if(currentPressure == lastPressure){
			System.out.println("More of the same !");
		}else{
			System.out.println("Watch our for cooler , rainy weather !");
		}
	}

}
