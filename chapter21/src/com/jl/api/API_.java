package com.jl.api;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class API_ {
	public static void main(String[] args) throws UnknownHostException {
//		演示InetAddress 类的使用

//		获取本机的InetAddress对象
		InetAddress localHost = InetAddress.getLocalHost();
		System.out.println(localHost);

//		根据指定的主机名获取 InetAddress 对象

		InetAddress byName = InetAddress.getByName("DESKTOP-PE6VCHN");
		System.out.println(byName);

//		根据域名返回 InetAddress 对象

		InetAddress byName1 = InetAddress.getByName("www.baidu.com");
		System.out.println(byName1);

//		通过 InetAddress 对象 反向获取对应的地址
		String hostAddress = byName1.getHostAddress();//IP
		System.out.println(hostAddress);

//		通过 InetAddress 对象 获取主机名，或者是域名
		String hostName = byName1.getHostName();
		System.out.println(hostName);


	}
}
