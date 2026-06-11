package com.jl.hm.hm1;

import java.io.*;
import java.net.Socket;

public class StreamUtils {


	public void sendFile(Socket socket, String filePath) throws IOException {
		//		用这个缓冲流，读取文件到缓冲流中
		OutputStream outputStream = socket.getOutputStream();
		BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(filePath));

		byte[] bytes = new byte[1024];
		int readLen = 0;
		while ((readLen = bufferedInputStream.read(bytes)) != -1) {
//		用这个发送
			outputStream.write(bytes, 0, readLen);
		}
//		发送完毕 关闭流文件

		bufferedInputStream.close();

	}

	public void sendString(Socket socket, String line) throws IOException {
		OutputStream outputStream = socket.getOutputStream();
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
//		outputStream.write("hello,server!".getBytes());
		bufferedWriter.write(line + "\n");

		bufferedWriter.flush();
	}

	public void receiveFile(Socket socket, String filePath) throws IOException {
		//      输入文件 字节流 用于保存File内容
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(filePath));

		InputStream inputStream = socket.getInputStream();
		byte[] bytes = new byte[1024];
		int readLen = 0;
		while ((readLen = inputStream.read(bytes)) != -1) {

			bufferedOutputStream.write(bytes, 0, readLen);

		}
		bufferedOutputStream.flush();
	}

	public String receiveString(Socket socket) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(socket.getInputStream()));
		String s = bufferedReader.readLine();   // 只读一次
		System.out.println(s);
		return s;
	}

}

