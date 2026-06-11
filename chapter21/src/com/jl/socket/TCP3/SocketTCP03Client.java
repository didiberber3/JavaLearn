package com.jl.socket.TCP3;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class SocketTCP03Client {
	public static void main(String[] args) throws IOException {

		System.out.println("连接端口...");
		Socket socket = new Socket(InetAddress.getLocalHost(), 9999);

		System.out.println("输出消息...");
		OutputStream outputStream = socket.getOutputStream();
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
//		outputStream.write("hello,server!".getBytes());
		bufferedWriter.write("hello,server！");
		bufferedWriter.newLine();
		bufferedWriter.flush();

		InputStream inputStream = socket.getInputStream();
		System.out.println("服务端接收到消息，准备打印...");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

		System.out.println(bufferedReader.readLine());
		bufferedReader.close();
//		byte[] bytes = new byte[1024];
//		int readLen = 0;
//		while ((readLen = inputStream1.read(bytes)) != -1) {
//			System.out.println(new String(bytes, 0, readLen));
//		}



		socket.close();
		outputStream.close();
		inputStream.close();

	}
}
