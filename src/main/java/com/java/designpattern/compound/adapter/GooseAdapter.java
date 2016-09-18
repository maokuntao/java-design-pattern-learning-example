package com.java.designpattern.compound.adapter;

/**
 * 鹅－适配鸭子，使鹅具备鸭子的特征
 *
 * @author taomk
 * 2016年9月18日 下午7:38:12
 */
public class GooseAdapter implements Quackable {
	Goose goose;
 
	public GooseAdapter(Goose goose) {
		this.goose = goose;
	}
 
	public void quack() {
		goose.honk();
	}

	public String toString() {
		return "Goose pretending to be a Duck";
	}
}
