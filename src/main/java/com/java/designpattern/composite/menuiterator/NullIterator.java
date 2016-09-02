package com.java.designpattern.composite.menuiterator;

import java.util.Iterator;

/**
 * 空迭代器－解决返回null的问题<br>
 * 一种比较优雅的解决迭代器返回null的问题
 * @author taomk
 * 2016年9月1日 下午9:47:37
 */
public class NullIterator implements Iterator<MenuComponent> {

	public MenuComponent next() {
		return null;
	}
  
	public boolean hasNext() {
		return false;
	}
   
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
