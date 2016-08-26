package com.java.designpattern.iterator.dinermerge;

/**
 * 菜单接口
 * @author taomk
 * 2016年8月25日 下午7:22:58
 */
public interface Menu {

	/**
	 * @return 封装的迭代器
	 */
	public Iterator createIterator();
}
