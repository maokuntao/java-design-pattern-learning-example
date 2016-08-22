package com.java.designpattern.adapter.iterenum.test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

import com.java.designpattern.adapter.iterenum.EnumerationIterator;

/**
 * Enumeration-Iteration转换器测试类
 * @author taomk
 * 2016年8月22日 下午9:20:07
 */
public class EnumerationIteratorTest {

	public static void main (String args[]) {
		
		Vector<String> v = new Vector<String>(Arrays.asList(args));
		
		Iterator<?> iterator = new EnumerationIterator(v.elements());
		
		System.out.println(iterator.toString());
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
