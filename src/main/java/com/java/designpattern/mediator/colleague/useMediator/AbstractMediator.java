package com.java.designpattern.mediator.colleague.useMediator;

/**
 * 抽象中介者。
 * 
 * @author taomk 2016年10月8日 下午8:50:57
 *
 */
public abstract class AbstractMediator {

	protected AbstractColleague colleagueA;
	protected AbstractColleague colleagueB;
	
	public AbstractMediator(AbstractColleague colleagueA , AbstractColleague colleagueB){
		this.colleagueA = colleagueA;
		this.colleagueB = colleagueB;
	}
	
	/**
	 * A影响B
	 */
	public abstract void AaffectB();
	
	
	/**
	 * B影响A
	 */
	public abstract void BaffectA();
}
