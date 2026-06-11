package com.jl.socket.TCP4;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class SocketTCP04Client {
	public static void main(String[] args) throws IOException {
//		创建对象
		Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
		StreamUtils streamUtils = new StreamUtils();
		String filePath = "E:\\JavaTest\\END1.png";
//      用于发送的路径， 这里有一个文件需要发送，
		streamUtils.sendFile(socket, filePath);
		streamUtils.receiveString(socket);

		socket.close();

	}
}
