package com.java.designpattern.templatemethod.sort;

/**
 * <code>Arrays.sort(Object)</code>使用了模版方法。<br>
 * 在此方法内部使用了<code>java.util.Arrays.mergeSort(Object[], Object[], int, int, int)</code>来实现具体的比较。<br>
 * 而上述方法内部又使用了<code>compareTo(Object)</code>接口。
 * 
 * @author taomk
 * 2016年8月24日 上午11:20:11
 */
public class Duck implements Comparable<Object> {
	
	String name;
	int weight;
  
	public Duck(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
 
	public String toString() {
		return name + " weighs " + weight;
	}

	@Override
	public int compareTo(Object o) {
		Duck otherDuck = (Duck) o;
		if(this.weight < otherDuck.weight){
			return -1;
		}else if(this.weight == otherDuck.weight){
			return 0;
		}else{
			return 1;
		}
		
	}

}
