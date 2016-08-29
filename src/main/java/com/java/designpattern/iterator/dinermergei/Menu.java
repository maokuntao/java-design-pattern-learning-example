package com.java.designpattern.iterator.dinermergei;

import java.util.Iterator;

/**
 * MenuItem接口
 * @author taomk
 * 2016年8月29日 下午2:51:56
 */
public interface Menu {

	public Iterator<MenuItem> createIterator();
}
