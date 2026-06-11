package com.jl.hm.hm3;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Hm3Client {
	public static void main(String[] args) throws Exception {
//		1.创建一个Scanner接收用户输入的文本
		System.out.println("服务端在9999端口监听。");
		System.out.println("请输入文本");
		Scanner scanner = new Scanner(System.in);
		String fileName = scanner.next();
//		2.客户端连接服务器,准备发送文件名称
		Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
//		3.接收到的数据打入到数据通道 获取和socket关联的输出流
		OutputStream outputStream = socket.getOutputStream();
		outputStream.write(fileName.getBytes());
//		4.设置写入结束标志
		socket.shutdownOutput();

		BufferedInputStream bufferedInputStream = new BufferedInputStream(socket.getInputStream());
		byte[] bytes = StreamUtils.streamToByteArray(bufferedInputStream);

		String filePath = "E:\\" + fileName + ".mp3";
//		5.得到一个输出流,准备讲bytes内容写入到磁盘文件
//		如果下载的是原色，就是原色，
//		如果是x，那就是 咖啡因乐队 - 成长的路口
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath));
		bos.write(bytes);

//		6.关闭相关资源
		bufferedInputStream.close();
		bos.close();
		socket.close();
		scanner.close();


	}
}
