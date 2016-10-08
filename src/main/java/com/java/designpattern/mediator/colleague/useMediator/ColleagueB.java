package com.java.designpattern.mediator.colleague.useMediator;

/**
 * @author taomk 2016年10月8日 下午8:59:44
 *
 */
public class ColleagueB extends AbstractColleague {

	@Override
	public void setNumber(int number, AbstractMediator mediator) {
		this.number = number;
		mediator.BaffectA();
	}

}
