package com.java.designpattern.iterator.dinermergei;

import java.util.Calendar;
import java.util.Iterator;

/**
 * 使用<code>java.util.iterator</code>来实现菜单合并
 * @author taomk
 * 2016年8月29日 下午2:51:56
 */
public class AlternatingDinerMenuIterator implements Iterator<MenuItem> {

	MenuItem[] items;
	int position;
	
	public AlternatingDinerMenuIterator(MenuItem[] items) {
		super();
		this.items = items;
		position = Calendar.DAY_OF_WEEK % 2;
	}

	@Override
	public boolean hasNext() {
		if(position >= items.length || items[position]==null){
			return false;
		}
		return true;
	}

	@Override
	public MenuItem next() {
		MenuItem item = items[position];
		position += 2;
		return item;
	}

	public void remove() {
		throw new UnsupportedOperationException(
			"Alternating Diner Menu Iterator does not support remove()");
	}
}
