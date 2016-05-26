package com.zlebank.zplatform.dubbo.framework;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Porvider {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] {"/spring/dubbo-base.xml" });
		context.start();
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 按任意键退出
	}

}
