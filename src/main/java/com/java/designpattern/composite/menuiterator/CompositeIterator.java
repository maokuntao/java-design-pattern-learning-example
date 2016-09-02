package com.java.designpattern.composite.menuiterator;

import java.util.Iterator;
import java.util.Stack;

/**
 * 组合迭代器
 *
 * @author taomk
 * 2016年9月1日 下午9:43:57
 */
public class CompositeIterator implements Iterator<MenuComponent> {
	
	Stack<Iterator<MenuComponent>> stack = new Stack<Iterator<MenuComponent>>();
	   
	public CompositeIterator(Iterator<MenuComponent> iterator) {
		stack.push(iterator);
	}
   
	public MenuComponent next() {
		if (hasNext()) {
			Iterator<MenuComponent> iterator = (Iterator<MenuComponent>) stack.peek();
			MenuComponent component = (MenuComponent) iterator.next();
			if (component instanceof Menu) {
				stack.push(component.createIterator());
			} 
			return component;
		} else {
			return null;
		}
	}
  
//	使用了递归来判断是否有下一个元素
	public boolean hasNext() {
		if (stack.empty()) {
			return false;
		} else {
			Iterator<MenuComponent> iterator = (Iterator<MenuComponent>) stack.peek();
			if (!iterator.hasNext()) {
				stack.pop();
				return hasNext();
			} else {
				return true;
			}
		}
	}
   
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
