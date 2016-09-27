package com.java.designpattern.chain.handler;

/**
 * <p>
 * 	<b>抽象处理者角色（Handler）</b>：定义一个处理请求的接口。<br>
 * 	如果需要，接口可以定义出一个方法以设定和返回对下家的引用。<br>
 * 	这个角色通常由一个Java抽象类或者Java接口实现。
 * </p>
 * @author taomk 2016年9月27日 下午7:09:00
 *
 */
public abstract class Handler {

	
	/**
	 * 持有后继的责任对象
	 */
	public Handler successor;
	
	/**
	 * 处理请求的方法。<br>
	 * 虽然这个方法没有传入参数，但是是可以传入的，根据具体需要来选择是否传递参数
	 */
	public abstract void handlerRequest();
	
	/**
	 * 取值方法
	 * @return 
	 */
	public Handler getSuccessor(){
		return successor;
	}
	
	/**
	 * 赋值方法，设置后继的责任对象
	 */
	public void setSuccessor(Handler successor){
		this.successor = successor;
	}
}
