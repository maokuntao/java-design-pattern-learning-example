package com.java.designpattern.observer.WeatherStation;

/**
 * 观察者接口，所有的具体观察者都必须实现此接口
 * 
 * @author taomk 2016年8月9日 下午6:24:45
 */
public interface Observer {

	/**
	 * 当观测值发生变化时，主题( {@link com.java.designpattern.observer.WeatherStation.Subject} )
	 * 会把这些状态值当作方法的参数，传送给观察者( {@link com.java.designpattern.observer.WeatherStation.Observer} )
	 * 
	 * @param temp 观测值1-温度
	 * @param humidity 观测值2-湿度
	 * @param pressure 观测值3-气压
	 */
	public void update(float temp, float humidity, float pressure);
}
