package com.java.designpattern.chain.handler;

/**
 * <p>
 * 	<b>具体处理者角色（ConcreteHandler）</b>：具体处理者接到请求后，可以选择将请求处理掉，或者将请求传给下家。<br>
 * 		由于处理者持有对下家的引用，因此，如果需要，具体处理者可以访问下家。
 * </p>
 * @author taomk 2016年9月27日 下午7:17:42
 *
 */
public class ConcreteHandler extends Handler {

	@Override
	public void handlerRequest() {
		
//		判断是否还有后继处理者，如果还有的话，就将请求传递给后继对象来处理
		if(getSuccessor()!=null){
			System.out.println("放过请求，由下家来处理请求...");
			getSuccessor().handlerRequest();
		}else{
			System.out.println("处理请求。");
		}
	}

}
