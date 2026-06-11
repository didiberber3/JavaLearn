package com.jl.socket.TCP3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTCP03Server {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(9999);
		System.out.println("服务端在9999端口监听，等待连接...");

		Socket socket = serverSocket.accept();

		InputStream inputStream = socket.getInputStream();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
		System.out.println("服务端接收到消息，准备打印...");




//		byte[] bytes = new byte[1024];
//		int readLen = 0;
//		while ((readLen = inputStream.read(bytes)) != -1) {
//			System.out.println(new String(bytes, 0, readLen));
//		}
		System.out.println(bufferedReader.readLine());

		System.out.println("打印完毕，准备输出消息");
		OutputStream outputStream = socket.getOutputStream();

		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream,"utf-8"));


//		outputStream.write("hello,client".getBytes());

		bufferedWriter.write("hello,client");
		bufferedWriter.newLine();
		bufferedWriter.flush();
		System.out.println("关闭socket...关闭stream...");
		socket.shutdownOutput();
		socket.close();

		serverSocket.close();
		inputStream.close();
		outputStream.close();
		bufferedReader.close();


	}

}
