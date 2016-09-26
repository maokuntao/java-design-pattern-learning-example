package com.java.designpattern.builder.personBuilder;

/**
 * <p>Director：构造一个使用Builder接口的对象，指导构建过程。</p>
 * <em>PersonDirector-直到构建Person的过程</em>
 * @author taomk 2016年9月26日 下午8:43:51
 *
 */
public class PersonDirector {

	/**
	 * 按照构建过程来构建对象
	 * @param builder 
	 * @return
	 */
	public Person constructPerson(PersonBuilder builder){
		builder.buildHead();
		builder.buildBody();
		builder.buildFoot();
		return builder.buildPerson();
	}
}
