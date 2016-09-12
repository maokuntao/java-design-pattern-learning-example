package com.java.designpattern.proxy.protectproxy;

/**
 * 具体的Person实现
 *
 * @author taomk
 * 2016年9月12日 下午10:15:10
 */
public class PersonBeanImpl implements PersonBean {

	String name;
	String gender;
	String interests;
//	评分
	int rating;
	int ratingCount = 0;
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getGender() {
		return gender;
	}

	@Override
	public String getInterests() {
		return interests;
	}

	@Override
	public int getHotOrNotRating() {
		if (ratingCount == 0) return 0;
		return (rating/ratingCount);
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public void setInterests(String interests) {
		this.interests = interests;
	}

	@Override
	public void setHotOrNotRating(int rating) {
		this.rating += rating;
		this.ratingCount++;
		
	}

}
