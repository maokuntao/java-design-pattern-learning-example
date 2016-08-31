package com.java.designpattern.composite.menu;

/**
 * 菜单组件－为叶子节点和组合节点提供的一个共同的接口。<br>
 * 为了代码的复用，所以写成了抽象类，提供了一套默认的方法实现。
 * 
 * @author taomk 2016年8月31日 下午9:12:01
 */
public abstract class MenuComponent {

	// “组合”方法，新增、删除、取得
	public void add(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}

	public void remove(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}

	public MenuComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}

	// “操作”方法，基本用于菜单项上
	public String getName() {
		throw new UnsupportedOperationException();
	}

	public String getDescription() {
		throw new UnsupportedOperationException();
	}

	public double getPrice() {
		throw new UnsupportedOperationException();
	}

	public boolean isVegetarian() {
		throw new UnsupportedOperationException();
	}

	public void print() {
		throw new UnsupportedOperationException();
	}
}
