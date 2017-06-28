package com.java.designpattern.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * <pre>
 * 动态代理实现日志记录
 * 
 * 动态代理类只能代理接口（不支持抽象类），代理类都需要实现InvocationHandler类，实现invoke方法。
 * 该invoke方法就是调用被代理接口的所有方法时需要调用的，该invoke方法返回的值是被代理接口的一个实现类
 * </pre>
 * 
 * @author taomk 2017年6月28日 下午7:28:04
 *
 */
public class LogHandler implements InvocationHandler {

	// 目标对象
	private Object targetObject;

	public LogHandler(Object targetObject) {
		this.targetObject = targetObject;
	}

	public Object newProxyInstance() {
		// 该方法用于为指定类装载器、一组接口及调用处理器生成动态代理类实例
		// 第一个参数指定产生代理对象的类加载器，需要将其指定为和目标对象同一个类加载器
		// 第二个参数要实现和目标对象一样的接口，所以只需要拿到目标对象的实现接口
		// 第三个参数表明这些被拦截的方法在被拦截时需要执行哪个InvocationHandler的invoke方法
		// 根据传入的目标返回一个代理对象
		return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), targetObject.getClass().getInterfaces(),
				this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object,
	 * java.lang.reflect.Method, java.lang.Object[])
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		System.out.println("LogHandler.invoke()-->>");

		System.out.println("\t args:-->>");
		for (int i = 0; i < args.length; i++) {
			System.out.println("\t\t" + args[i]);
		}

		try {

			/* 原对象方法调用前处理日志信息 */
			System.out.println("satrt-->>");

			Object result = method.invoke(targetObject, args);

			/* 原对象方法调用后处理日志信息 */
			System.out.println("success-->>");

			return result;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error-->>");
			return null;
		}

	}

}
