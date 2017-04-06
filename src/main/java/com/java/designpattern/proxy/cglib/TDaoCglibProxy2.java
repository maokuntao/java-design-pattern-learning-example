package com.java.designpattern.proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * 拦截器-代理2
 * 
 * @author taomk 2017年4月6日 下午3:23:01
 *
 */
public class TDaoCglibProxy2 implements MethodInterceptor {
	
	String operatorName;
	
	TDaoCglibProxy2(String operatorName){
		this.operatorName = operatorName;
	}

	/* (non-Javadoc)
	 * @see net.sf.cglib.proxy.MethodInterceptor#intercept(java.lang.Object, java.lang.reflect.Method, java.lang.Object[], net.sf.cglib.proxy.MethodProxy)
	 */
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {

		System.out.println(method.getName() + " is running in TDaoCglibProxy.class. ");
		
		if(!operatorName.equalsIgnoreCase("taomk")){
			System.err.println("No authority：" + operatorName);
			return null;
		}
		
		// 使用反射调用
		return method.invoke(obj, args);
	}

}
