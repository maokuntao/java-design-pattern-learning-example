package com.java.designpattern.mediator.colleague.notUseMediator.test;

import com.java.designpattern.mediator.colleague.notUseMediator.*;

/**
 * 测试类
 * @author taomk 2016年10月8日 下午8:37:41
 *
 */
public class ClientTest {

	public static void main(String[] args) {
		
		AbstractColleague colleagueA = new ColleagueA();
		AbstractColleague colleagueB = new ColleagueB();
		
		System.out.println("==========设置A影响B==========");
		colleagueA.setNumber(9527, colleagueB);
		System.out.println("colleagueA的值："+ colleagueA.getNumber());
		System.out.println("colleagueB的值："+ colleagueB.getNumber());
		
		System.out.println("==========设置B影响A==========");
		colleagueB.setNumber(12300 , colleagueA);
		System.out.println("colleagueA的值："+ colleagueA.getNumber());
		System.out.println("colleagueB的值："+ colleagueB.getNumber());
	}

}

/**
 * 
 * 上面的代码中，类A类B通过直接的关联发生关系。
 * 假如我们要使用中介者模式，类A类B之间则不可以直接关联。
 * 他们之间必须要通过一个中介者来达到关联的目的。
 * 
 * 
 */
