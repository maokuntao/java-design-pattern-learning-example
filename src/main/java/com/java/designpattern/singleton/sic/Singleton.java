package com.java.designpattern.singleton.sic;

/**
 * 单例模式－静态内部类 <br>
 * <i>这种方式利用了classloader的机制来保证了初始化instance的时候只有一个线程，也达到了lazy
 * loading的效果</i>
 * 
 * @author taomk 2016年8月16日 下午9:50:17
 */
public class Singleton {

	private static class SingletonHolder {
		private static final Singleton uniqueInstance = new Singleton();
	}

	private Singleton() {
	}

	public static Singleton getInstance() {
		return SingletonHolder.uniqueInstance;
	}
	
	
	public static void main(String[] args) {

		int i = 1;
		while(i <= 500){
			Runnable r = () -> System.out.println(Thread.currentThread().getName() + " : " + Singleton.getInstance());
			new Thread(r).start();
			i++;
		}
	}
}
