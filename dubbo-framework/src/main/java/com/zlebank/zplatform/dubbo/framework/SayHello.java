package com.zlebank.zplatform.dubbo.framework;

import java.net.InetAddress;
import java.net.UnknownHostException;

import com.zlebank.zplatform.dubbo.framework.interfaces.ISayHello;

/**
 * Hello world!
 *
 */
public class SayHello implements ISayHello {
	public void sayHello(int i) {
		try {
			System.out.println("Hello World,hehe!"+InetAddress .getLocalHost().getHostAddress());
			System.out.println("count"+i);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
