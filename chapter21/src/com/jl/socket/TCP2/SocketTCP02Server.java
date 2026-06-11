package com.jl.socket.TCP2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTCP02Server {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(9999);
		System.out.println("服务端在9999端口监听，等待连接...");

		Socket socket = serverSocket.accept();

		InputStream inputStream = socket.getInputStream();
		System.out.println("服务端接收到消息，准备打印...");
		byte[] bytes = new byte[1024];
		int readLen = 0;
		while ((readLen = inputStream.read(bytes)) != -1) {
			System.out.println(new String(bytes, 0, readLen));
		}
		socket.shutdownInput();
		System.out.println("打印完毕，准备输出消息");
		OutputStream outputStream = socket.getOutputStream();
		outputStream.write("hello,client".getBytes());

		System.out.println("关闭socket...关闭stream...");
		socket.shutdownOutput();
		socket.close();

		serverSocket.close();
		inputStream.close();
		outputStream.close();


	}

}
