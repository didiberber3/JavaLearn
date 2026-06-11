package com.jl.socket.TCP1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
public class SocketTCP01Client {
	public static void main(String[] args) throws IOException {
//		1. 连接服务器（IP，端口）
//		连接 InetAddress.getLocalHost()的 9999端口，如果连接成功，返回Socket对象
		Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
		System.out.println("客户端 socket返回= " + socket.getClass());
//      2. 连接上后通过生成Socket 通过，socket.getOutputStream()
//		得到和Socket关联的输出流output stream
		OutputStream outputStream = socket.getOutputStream();

//      3. 通过输出流，写入数据到数据通道
		outputStream.write("hello,server!".getBytes());
//		4. 关闭流对象和Socket
		outputStream.close();

	}
}
