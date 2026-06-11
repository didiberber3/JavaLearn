package com.jl.hm.hm1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Hm1Server {
	public static void main(String[] args) throws IOException {
//		新建监听端口
		Socket socket = new Socket();
		ServerSocket serverSocket = new ServerSocket(9999);
		StreamUtils streamUtils = new StreamUtils();
		String name = "nova";
		String sendnova = "我是" + name;
		String sendhobby = "编写java程序";
		String sendwhat = "你说啥呢";

//		接收消息
		Socket accept = serverSocket.accept();
//		这个返回的是数组
//      字符流
		String s = "";
//		比较语句
		while ((s = streamUtils.receiveString(accept)) != null) {
			if (s.equals("name")) {
				streamUtils.sendString(accept, sendnova);
			} else if (s.equals("hobby")) {
				streamUtils.sendString(accept, sendhobby);
			} else {
				streamUtils.sendString(accept, sendwhat);
			}
		}
//		关闭资源
		socket.close();
		serverSocket.close();
	}
}
