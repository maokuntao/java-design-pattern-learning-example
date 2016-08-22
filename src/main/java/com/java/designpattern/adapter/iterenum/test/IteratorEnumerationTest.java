package com.java.designpattern.adapter.iterenum.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;

import com.java.designpattern.adapter.iterenum.IteratorEnumeration;

/**
 * 
 * Iteration-Enumeration转换器测试类
 * 
 * @author taomk 2016年8月22日 下午9:29:47
 */
public class IteratorEnumerationTest {
	public static void main(String[] args) {
		List<Object> arrays = new ArrayList<Object>(Arrays.asList(args));
		Enumeration<Object> enumration = new IteratorEnumeration(arrays.iterator());
		System.out.println(enumration);
		while(enumration.hasMoreElements()){
			System.out.println(enumration.nextElement());
		}
	}
}
