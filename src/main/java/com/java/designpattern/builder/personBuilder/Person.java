package com.java.designpattern.builder.personBuilder;

/**
 * 
 * <pre>Product：表示被构造的复杂对象。</pre>
 * <em>Person-需要被构造的复杂对象。</em>
 * 
 * @author taomk 2016年9月26日 下午8:32:09
 *
 */
public class Person {

	private String head;
	private String body;
	private String foot;
	
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getFoot() {
		return foot;
	}
	public void setFoot(String foot) {
		this.foot = foot;
	}
}	
