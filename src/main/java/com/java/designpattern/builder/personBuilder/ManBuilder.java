package com.java.designpattern.builder.personBuilder;

/**
 * <p>ConcreteBuilder：实现Builder的接口以构造和装配该产品的各个部件，定义并明确它所创建的表示，并提供一个检索产品的接口。</p>
 * <em>ManBuilder-构造男人</em>
 * @author taomk 2016年9月26日 下午8:37:17
 *
 */
public class ManBuilder implements PersonBuilder {

	Person man;
	
	public ManBuilder(){
		this.man = new Man();
	}
	
	@Override
	public void buildHead() {
		man.setHead("男人的头部");
	}

	@Override
	public void buildBody() {
		man.setBody("男人的身体");
	}

	@Override
	public void buildFoot() {
		man.setFoot("男人的脚");
	}

	@Override
	public Person buildPerson() {
		System.out.println("构建男人完成。");
		return man;
	}

}
