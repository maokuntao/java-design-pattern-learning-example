package com.java.designpattern.iterator.dinermergei;

import java.util.Iterator;

/**
 * 
 * @author taomk
 * 2016年8月29日 下午7:48:30
 */
public class DinerMenuIterator implements Iterable<MenuItem> {

	MenuItem[] list;
	int position = 0;
 
	public DinerMenuIterator(MenuItem[] list) {
		this.list = list;
	}
 
	public Object next() {
		MenuItem menuItem = list[position];
		position = position + 1;
		return menuItem;
	}
 
	public boolean hasNext() {
		if (position >= list.length || list[position] == null) {
			return false;
		} else {
			return true;
		}
	}
  
//	将后面的元素都向前移动一个下标位置，实际上删除的是第一个元素
	public void remove() {
		if (position <= 0) {
			throw new IllegalStateException
				("You can't remove an item until you've done at least one next()");
		}
		if (list[position-1] != null) {
			for (int i = position-1; i < (list.length-1); i++) {
				list[i] = list[i+1];
			}
			list[list.length-1] = null;
		}
	}

	@Override
	public Iterator<MenuItem> iterator() {
		return null;
	}

}
