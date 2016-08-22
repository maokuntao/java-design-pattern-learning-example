package com.java.designpattern.adapter.iterenum;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Iteration-Enumeration转换器
 * @author taomk
 * 2016年8月22日 下午9:25:53
 */
public class IteratorEnumeration implements Enumeration<Object> {

	Iterator<Object> iterator;
	
	public IteratorEnumeration(Iterator<Object> iter){
		this.iterator = iter;
	}
	
	@Override
	public boolean hasMoreElements() {
		return iterator.hasNext();
	}

	@Override
	public Object nextElement() {
		return iterator.next();
	}

}
