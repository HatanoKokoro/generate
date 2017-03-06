package com.test;

import org.codeGenerator.MyFreeMarker;

public class classTest {
	
	public static void main(String[] args) {
		
		MyFreeMarker my = new MyFreeMarker();
		try {
			my.CreateFile("test", "Artoria", "com", "cs");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
