package com.java.designpattern.singleton.classic;

/**
 * <pre>使用经典模式创建一个单例</pre>
 * <blockquote>延迟加载／懒加载(lazy initialize)</blockquote>
 * <blockquote>非线程安全</blockquote>
 * @author taomk 2016年8月15日 下午10:29:52
 */
public class Singleton {

	private static Singleton uniqueInstance;

	private Singleton() {

	}

	public static Singleton getInstances() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
}
