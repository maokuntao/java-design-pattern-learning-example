package com.java.designpattern.composite.menuiterator;

import java.util.Iterator;
import java.util.Stack;

/**
 *
 *
 * @author taomk
 * 2016年9月1日 下午9:43:57
 */
public class CompositeIterator implements Iterator<Object> {
	Stack stack = new Stack();
	   
	public CompositeIterator(Iterator iterator) {
		stack.push(iterator);
	}
   
	public Object next() {
		if (hasNext()) {
			Iterator iterator = (Iterator) stack.peek();
			MenuComponent component = (MenuComponent) iterator.next();
			if (component instanceof Menu) {
				stack.push(component.createIterator());
			} 
			return component;
		} else {
			return null;
		}
	}
  
	public boolean hasNext() {
		if (stack.empty()) {
			return false;
		} else {
			Iterator iterator = (Iterator) stack.peek();
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
