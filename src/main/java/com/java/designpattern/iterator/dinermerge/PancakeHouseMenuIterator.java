package com.java.designpattern.iterator.dinermerge;

import java.util.ArrayList;

/**
 * 实现了<code>com.java.designpattern.iterator.dinermerge.Iterator</code>接口的煎饼屋菜单
 * @author taomk
 * 2016年8月25日 下午7:34:00
 */
public class PancakeHouseMenuIterator implements Iterator {

	private ArrayList<MenuItem> menuItems;
	int position = 0;
	
	public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems){
		this.menuItems = menuItems;
	}
	
	@Override
	public boolean hasNext() {
		if(position>=menuItems.size()){
			return false;
		}
		return true;
	}

	@Override
	public Object next() {
		MenuItem item = menuItems.get(position);
		position++;
		return item;
	}

}
