package com.java.designpattern.decorator.IO.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.java.designpattern.decorator.IO.LowerCaseInputStream;

/**
 * 测试LowerCaseInputStream装饰者
 * @author taomk
 * 2016年8月12日 上午10:02:25
 */
public class InputTest {

	public static void main(String[] args) {
		InputStream in = null;
		int c = 0;
		try {
			in = new LowerCaseInputStream(new FileInputStream("/Users/Dev/github/java-design-pattern-learning-example/src/main/resources/com/java/designpattern/decorator/IO/test/test.txt"));
			while((c = in.read()) > 0){
				System.out.print((char)c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(in != null){
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
