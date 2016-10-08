package com.java.designpattern.mediator.colleague.useMediator.test;

import com.java.designpattern.mediator.colleague.useMediator.*;

/**
 * 测试类。
 * 
 * @author taomk 2016年10月8日 下午9:02:00
 *
 */
public class ClientTest {

	public static void main(String[] args) {
		
		AbstractColleague colleagueA = new ColleagueA();
		AbstractColleague colleagueB = new ColleagueB();
		
		AbstractMediator mediator = new Mediator(colleagueA , colleagueB);
		
		System.out.println("==========通过设置A影响B==========");
		colleagueA.setNumber(9527, mediator);
		System.out.println("colleagueA的number值为："+colleagueA.getNumber());  
        System.out.println("colleagueA的number值为A的10倍："+colleagueB.getNumber()); 
        
        System.out.println("==========通过设置B影响A==========");
		colleagueB.setNumber(12500, mediator);
		System.out.println("colleagueA的number值为B的1/100："+colleagueA.getNumber());  
        System.out.println("colleagueB的number值："+colleagueB.getNumber()); 
        
	}

}
