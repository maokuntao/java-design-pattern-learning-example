package com.java.designpattern.templatemethod.barista;

import java.io.*;

/**
 * 茶－客户可以决定是否需要添加配料
 * @author taomk
 * 2016年8月24日 上午10:34:30
 */
public class TeaWithHook extends CaffeineBeverageWithHook {

	@Override
	void brew() {
		System.out.println("Steeping the tea");
	}

	@Override
	void addCondiments() {
		System.out.println("Adding Lemon");
	}

	@Override
	public boolean customerWantsCondiments(){
		
		String answer = getUserInput();
		if(answer.startsWith("y") || answer.startsWith("Y")){
			return true;
		}
		return false;
	}
	
//	由客户决定是否需要添加milk和sugar
	private String getUserInput(){
		String answer = null;
		System.out.println("Would you like milk and sugar with your tea (y/n)? ");
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			answer = input.readLine();
		} catch (IOException e) {
			System.err.println("IO error trying to read your answer");
		}
		
		return answer==null?"n":answer;
	}
}
