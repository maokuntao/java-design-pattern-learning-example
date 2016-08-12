package com.java.designpattern.decorator.IO;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 将大写字母去全部转换为小写字母的FilterInputStream装饰者
 * @author taomk
 * 2016年8月12日 上午9:52:52
 */
public class LowerCaseInputStream extends FilterInputStream {

	public LowerCaseInputStream(InputStream in) {
		super(in);
	}
	
	public int read() throws IOException{
		int c = super.read();
		return (c==-1 ? c : Character.toLowerCase((char)c));
	}
	
	public int read(byte[] b , int offset , int len) throws IOException{
		int result = super.read(b, offset, len);
		for(int i = offset ; i < offset+result ; i++){
			b[i] = (byte)Character.toLowerCase((char)b[i]);
		}
		return result;
	}

}
