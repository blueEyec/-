package com.kk.ownPractice.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Encryption {
	private static String path="C:\\Users\\Administrator\\Desktop\\仪器采集记录.txt";
	
	static StringBuilder readFile(String path) {
		StringBuilder builder=new StringBuilder();
		try {
			InputStream in=new FileInputStream(path);
			byte[] bs=new byte[1024];
			int len=0;
			String str;
			while((len = in.read(bs))!=-1) {
				str=new String(bs,0,len,"GBK");
				builder.append(str);
				builder.append("\n");
			}
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return builder;
	}
	
	
	public static void main(String[] args) {
		StringBuilder builder=readFile(path);
		System.out.println(builder);
	}
}
