package com.java.designpattern.adapter.iterenum;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Enumeration-Iteration转换器
 * @author taomk
 * 2016年8月22日 下午9:12:10
 */
public class EnumerationIterator implements Iterator<Object> {

	Enumeration<?> enumeration;
	
	public EnumerationIterator(Enumeration<?> enumer) {
		this.enumeration = enumer;
	}
	
	@Override
	public boolean hasNext() {
		return enumeration.hasMoreElements();
	}

	@Override
	public Object next() {
		return  enumeration.nextElement();
	}

	public void remove(){
		throw new UnsupportedOperationException();
	}
}
