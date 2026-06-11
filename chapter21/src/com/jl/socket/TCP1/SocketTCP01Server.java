package com.jl.socket.TCP1;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTCP01Server {
	public static void main(String[] args) throws IOException {
//		1. 在本机的9999端口监听，等待连接
//		要求在本机没有其他服务在监听9999端口
		ServerSocket serverSocket = new ServerSocket(9999);
		System.out.println("服务端在9999端口监听，等待连接...");
//      2. 当没有客户端连接9999端口时，程序会阻塞，等待连接

//		ServerSocket 可以通过serverSocket.accept() 返回多个Socket （多个客户端的并发）
		Socket socket = serverSocket.accept();
		System.out.println("服务端 socket = " + serverSocket.getClass());
//      3. socket.getInputStream()读取客户端写入到数据通道的数据，显示数据
		InputStream inputStream = socket.getInputStream();
//		IO读取
		byte[] bytes = new byte[1024];
		int readLen = 0;
		while ((readLen = inputStream.read(bytes)) != -1) {
			System.out.println(new String(bytes, 0, readLen));

		}

		inputStream.close();
		socket.close();
		serverSocket.close();
	}
}
