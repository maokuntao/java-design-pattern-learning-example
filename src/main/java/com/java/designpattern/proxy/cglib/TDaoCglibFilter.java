package com.java.designpattern.proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.CallbackFilter;

/**
 * 过滤器
 * 
 * @author taomk 2017年4月6日 下午3:00:04
 *
 */
public class TDaoCglibFilter implements CallbackFilter {

    public final static int NO_RESTRICTION = 0;
    public final static int RESTRICTION_METHOD = 1;
    public final static int RESTRICTION_OPERATOR = 2;
    
    String[] RESTRICTION_PATTERN = {"create" , "update" , "delete"};
    
	/* (non-Javadoc)
	 * @see net.sf.cglib.proxy.CallbackFilter#accept(java.lang.reflect.Method)
	 */
	@Override
	public int accept(Method method) {
		
		System.out.println("Filting method ...");
		
		if(isRestriction(method.getName())){
			System.out.printf("\t %s is filted. " , method.getName());
			return RESTRICTION_METHOD;
		}
		
		System.out.printf("\t %s is passed. " , method.getName());
		return NO_RESTRICTION;
	}

	private boolean isRestriction(String methodName){
		for (String pattern : RESTRICTION_PATTERN) {
			if(pattern.equalsIgnoreCase(methodName)){
				return true;
			}
		}
		return false;
	}
}
