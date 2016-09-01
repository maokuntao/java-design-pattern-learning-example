package com.java.designpattern.composite.menuiterator;

import java.util.Iterator;

/**
 *
 *
 * @author taomk
 * 2016年9月1日 下午9:47:37
 */
public class NullIterator implements Iterator<Object> {

	public Object next() {
		return null;
	}
  
	public boolean hasNext() {
		return false;
	}
   
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
