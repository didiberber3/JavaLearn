package com.jl.hm.hm3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Hm3Server {
	public static void main(String[] args) throws Exception {
//		1.监听 9999 端口，等待客户连接，并读取 发送的 下载文件的名字
		ServerSocket serverSocket = new ServerSocket(9999);

//		2.等待客户端连接
		Socket socket = serverSocket.accept();
//		3.读取客户端发送的要下载的文件名
		InputStream inputStream = socket.getInputStream();
//		写入到字节数组中
//		使用while读取文件名,是考虑将来文件名比较大的情况.
		byte[] bytes = new byte[1024];
		int lens = 0;
		String downloadFilename = "";
		while ((lens = inputStream.read(bytes)) != -1) {
			downloadFilename += new String(bytes, 0, lens);

		}
		System.out.println("客户端希望下载的文件名是" + downloadFilename);

//		如果客户下载的是原色,就返回      原色.mp3
//		否则一律返回                  咖啡因乐队 - 成长的路口.mp3
		String resFilename = "";
		if ("原色".equals(downloadFilename)) {
			resFilename = "src\\原色.mp3";
		} else {
			resFilename = "src\\咖啡因乐队 - 成长的路口.mp3";
		}
//		4.开始读文件 创建一个输入流,读取文件
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(resFilename));

//		5.使用工具数组
		byte[] bytes1 = StreamUtils.streamToByteArray(bis);
//		6.得到一个socket关联的输出流
		BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
//		7.写入到数据通道 返回给客户端
		bos.write(bytes1);
		bos.flush();
		socket.shutdownOutput();
		bis.close();
		inputStream.close();
		socket.close();
		serverSocket.close();
		System.out.println("服务端关闭");


	}
}
