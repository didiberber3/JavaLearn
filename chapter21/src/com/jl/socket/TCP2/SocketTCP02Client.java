package com.jl.socket.TCP2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketTCP02Client {
	public static void main(String[] args) throws IOException {

		System.out.println("连接端口...");
		Socket socket = new Socket(InetAddress.getLocalHost(), 9999);

		System.out.println("输出消息...");
		OutputStream outputStream = socket.getOutputStream();
		outputStream.write("hello,server!".getBytes());

		socket.shutdownOutput();

		InputStream inputStream1 = socket.getInputStream();
		System.out.println("服务端接收到消息，准备打印...");
		byte[] bytes = new byte[1024];
		int readLen = 0;
		while ((readLen = inputStream1.read(bytes)) != -1) {
			System.out.println(new String(bytes, 0, readLen));
		}
		socket.shutdownInput();


		socket.close();
		outputStream.close();
		inputStream1.close();

	}
}
