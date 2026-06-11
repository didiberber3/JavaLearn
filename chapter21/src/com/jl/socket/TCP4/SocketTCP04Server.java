package com.jl.socket.TCP4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTCP04Server {
	public static void main(String[] args) throws IOException {

		ServerSocket serverSocket = new ServerSocket(9999);
		Socket socket = serverSocket.accept();
		StreamUtils streamUtils = new StreamUtils();
		String filePath = "D:\\JavaProject\\chapter21\\src\\END1.png";
		String line = "收到图片!";

//		输出
		streamUtils.receiveFile(socket, filePath);
		streamUtils.sendString(socket, line);


		serverSocket.close();


	}
}
