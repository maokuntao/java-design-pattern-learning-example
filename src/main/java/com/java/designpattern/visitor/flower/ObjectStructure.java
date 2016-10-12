package com.java.designpattern.visitor.flower;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象结构角色<br>
 * <li>能够枚举它的元素</li>
 * <li>提供一个高层的接口以允许该访问者访问它的元素</li>
 * <li>可以是一个复合(组合模式)或是一个集合, 如一个列表或一个无序集合</li>
 * 
 * 
 * @author taomk 2016年10月11日 下午7:27:31
 *
 */
public class ObjectStructure {

	// 属性元素，是一个集合
	private final List<FlowerElement> elements = new ArrayList<FlowerElement>();

	// 添加属性元素
	public void addElement(final FlowerElement e) {
		elements.add(e);
	}

	// 移除属性元素
	public void removeElement(final FlowerElement e) {
		elements.remove(e);
	}

	// 每一个属性元素都可以接受一个访问者角色，执行接口方法
	public void accept(final Visitor visitor) {
		for (final FlowerElement e : elements) {
			e.accept(visitor);
		}
	}
}
