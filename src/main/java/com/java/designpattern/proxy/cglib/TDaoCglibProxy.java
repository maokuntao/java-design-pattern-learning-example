package com.java.designpattern.proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import net.sf.cglib.proxy.NoOp;

/**
 * 拦截器-代理
 * 
 * @author taomk 2017年4月6日 下午3:04:12
 *
 */
public class TDaoCglibProxy implements MethodInterceptor {

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.sf.cglib.proxy.MethodInterceptor#intercept(java.lang.Object,
	 * java.lang.reflect.Method, java.lang.Object[],
	 * net.sf.cglib.proxy.MethodProxy)
	 */
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {

		System.out.println(method.getName() + " is running in TDaoCglibProxy.class. ");
		
		if ("delete".equalsIgnoreCase(method.getName())) {
			System.err.println("Warnning Method：" + method.getName());
			return null;
		}

		// 使用cglib代理调用
		return proxy.invokeSuper(obj, args);
	}

	public static void main(String[] args) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(TDao.class);
		enhancer.setCallbackFilter(new TDaoCglibFilter());
		enhancer.setCallbacks(new Callback[]{
				NoOp.INSTANCE,
				new TDaoCglibProxy()
		});
		TDao tDao = (TDao) enhancer.create();
		System.out.println();
		tDao.create();
		System.out.println();
		tDao.delete();
		System.out.println();
		tDao.update();
		System.out.println();
		tDao.query();
	}
}
