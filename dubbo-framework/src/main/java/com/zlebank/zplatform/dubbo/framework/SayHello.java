package com.zlebank.zplatform.dubbo.framework;

import java.net.InetAddress;
import java.net.UnknownHostException;

import com.alibaba.dubbo.config.annotation.Service;
import com.zlebank.zplatform.dubbo.framework.interfaces.ISayHello;

/**
 * Hello world!
 *
 */
@Service(provider="business_4_all")
public class SayHello implements ISayHello {
	public void sayHello() {
		try {
			System.out.println("Hello World,hehe!"+InetAddress .getLocalHost().getHostName());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
