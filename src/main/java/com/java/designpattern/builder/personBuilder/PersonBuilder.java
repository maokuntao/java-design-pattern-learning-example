package com.java.designpattern.builder.personBuilder;

/**
 * <p>Builder：为创建一个产品对象的各个部件指定抽象接口。</p>
 * <em>为创建<code>com.java.designpattern.builder.personBuilder.Person</code>的各个部分而创建的抽象接口</em>
 * 
 * @author taomk 2016年9月26日 下午8:30:33
 *
 */
public interface PersonBuilder {

	public void buildHead();
	public void buildBody();
	public void buildFoot();
	Person buildPerson();
}
