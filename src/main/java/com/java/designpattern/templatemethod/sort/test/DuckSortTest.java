package com.java.designpattern.templatemethod.sort.test;

import java.util.Arrays;

import com.java.designpattern.templatemethod.sort.Duck;

/**
 * Duck排序测试类
 * @author taomk
 * 2016年8月24日 下午3:39:00
 */
public class DuckSortTest {

	public static void main(String[] args) {
		Duck[] ducks = { 
				new Duck("Daffy", 8), 
				new Duck("Dewey", 2),
				new Duck("Howard", 7),
				new Duck("Louie", 2),
				new Duck("Donald", 10), 
				new Duck("Huey", 2)
		};
		
		System.out.println("Before sorting: ");
		display(ducks);
		
		Arrays.sort(ducks);
		
		System.out.println("After sorting: ");
		display(ducks);
	}
	
	private static void display(Duck[] ducks) {
		for (int i = 0; i < ducks.length; i++) {
			System.out.println(ducks[i]);
		}
	}
}
