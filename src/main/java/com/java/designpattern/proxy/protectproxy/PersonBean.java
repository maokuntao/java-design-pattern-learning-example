package com.java.designpattern.proxy.protectproxy;

/**
 * Person接口
 *
 * @author taomk
 * 2016年9月12日 下午10:14:27
 */
public interface PersonBean {

	String getName();
	String getGender();
	String getInterests();
	int getHotOrNotRating();
 
    void setName(String name);
    void setGender(String gender);
    void setInterests(String interests);
    void setHotOrNotRating(int rating);
    
}
