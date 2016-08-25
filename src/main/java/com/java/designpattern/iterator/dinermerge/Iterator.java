package com.java.designpattern.iterator.dinermerge;

/**
 * 迭代器接口
 * @author taomk
 * 2016年8月25日 下午6:58:25
 */
public interface Iterator {

	/**
	 * @return true:还有更多的元素；false:已经没有更多的元素了
	 */
	public boolean hasNext();
	
	/**
	 * @return 下一个元素
	 */
	public Object next();
}
