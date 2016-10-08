package com.java.designpattern.mediator.colleague.useMediator;

/**
 * <b>实际中介者。<b>
 * 此处将同事之间的关联影响转移到此中介者对象中来实现，避免了同事类之间的耦合。
 * 
 * @author taomk 2016年10月8日 下午8:54:13
 *
 */
public class Mediator extends AbstractMediator {

	public Mediator(AbstractColleague colleagueA, AbstractColleague colleagueB) {
		super(colleagueA, colleagueB);
	}

	@Override
	public void AaffectB() {
		colleagueB.setNumber(colleagueA.getNumber()*100);
	}

	@Override
	public void BaffectA() {
		colleagueA.setNumber(colleagueB.getNumber()/100);
	}


}
