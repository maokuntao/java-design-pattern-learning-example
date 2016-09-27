package com.java.designpattern.chain.handler.test;

import com.java.designpattern.chain.handler.*;

/**
 * 测试类
 * @author taomk 2016年9月27日 下午7:22:38
 *
 */
public class HandlerTest {

	public static void main(String[] args) {
		
		Handler handler1 = new ConcreteHandler();
		Handler handler2 = new ConcreteHandler();
		
		handler1.setSuccessor(handler2);
		
		handler1.handlerRequest();
	}
}
