package com.java.designpattern.mediator.colleague.notUseMediator;

/**
 * @author taomk 2016年10月8日 下午7:55:31
 *
 */
public class ColleagueA extends AbstractColleague{

	@Override
	public void setNumber(int number, AbstractColleague colleague) {
		this.number = number;
		colleague.setNumber(number*100);
	}
	
}
