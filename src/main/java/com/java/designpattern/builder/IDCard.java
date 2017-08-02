package com.java.designpattern.builder;

/**
 * 身份证实体类
 * 
 * @author taomk 2017年8月2日 下午7:55:09
 *
 */
public class IDCard {

	String name;
	String address;
	int age;
	String IDNo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getIDNo() {
		return IDNo;
	}

	public void setIDNo(String iDNo) {
		IDNo = iDNo;
	}

	public static class Builder {
		
		String name;
		String address;
		int age;
		String IDNo;
		
		Builder(){
			
		}
		
		// 构建步骤
		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder age(int age) {
			this.age = age;
			return this;
		}

		public Builder address(String address) {
			this.address = address;
			return this;
		}

		public Builder IDNo(String IDNo) {
			this.IDNo = IDNo;
			return this;
		}

		public IDCard build() {
			return new IDCard(this);
		}
	}

	private IDCard(Builder b) {
		this.name = b.name;
		this.age = b.age;
		this.IDNo = b.IDNo;
		this.address = b.address;
	}
	
	@Override
	public String toString() {
		return "IDCard [name=" + name + ", address=" + address + ", age=" + age + ", IDNo=" + IDNo + "]";
	}

	public static void main(String[] args) {
		IDCard card =new IDCard
				.Builder()
				.name("taomk")
				.age(27)
				.address("Beijing")
				.IDNo("XXXXXXXX")
				.build();
		System.out.println(card);
	}
}
