package com.java.designpattern.builder.personBuilder.test;

import com.java.designpattern.builder.personBuilder.*;

/**
 * 测试类
 * @author taomk 2016年9月26日 下午8:47:53
 *
 */
public class PersonBuilderTest {

	public static void main(String[] args) {

		PersonDirector director = new PersonDirector();
		
		Person man = director.constructPerson(new ManBuilder()); 
		System.out.println(man.getHead() + "," + man.getBody() + "," + man.getFoot());
		
		Person woman = director.constructPerson(new WomanBuilder()); 
		System.out.println(woman.getHead() + "," + woman.getBody() + "," + woman.getFoot());
	}

}
