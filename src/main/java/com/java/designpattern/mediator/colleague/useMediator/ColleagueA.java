package com.java.designpattern.mediator.colleague.useMediator;

/**
 * 同事A。
 * 
 * @author taomk 2016年10月8日 下午8:58:28
 *
 */
public class ColleagueA extends AbstractColleague {

	@Override
	public void setNumber(int number, AbstractMediator mediator) {
		this.number = number;
		mediator.AaffectB();
	}

}
