package com.java.designpattern.iterator.dinermerge;

/**
 * 实现了<code>com.java.designpattern.iterator.dinermerge.Iterator</code>接口的餐厅菜单
 * 
 * @author taomk 2016年8月25日 下午7:01:56
 */
public class DinerMenuIterator implements Iterator {

	private MenuItem[] items;
	private int position = 0;// 记录当前菜单元素在菜单中的坐标

	// 餐厅菜单是用菜单条目数组组成的
	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		// 因为使用的是固定长度的数组，所以不仅仅要检查坐标是否已经超出长度，还需要检查当前元素值是否为null
		if (position >= items.length || items[position] == null) {
			return false;
		}
		return true;
	}

	@Override
	public Object next() {
		MenuItem item = items[position];
		position++;
		return item;
	}

}
