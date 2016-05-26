package com.zlebank.zplatform.dubbo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zlebank.zplatform.dubbo.framework.interfaces.ISayHello;

@Component
public class Consumer {
	@Reference
	private ISayHello sayhelloService;
	
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] {"/spring/dubbo-base.xml" });
		context.start();
		
		Consumer consumer = context.getBean(Consumer.class);
		while (true) {
			consumer.consume();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void consume(){
		sayhelloService.sayHello();
	}
}
