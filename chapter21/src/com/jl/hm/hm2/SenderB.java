package com.jl.hm.hm2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

@SuppressWarnings("all")
public class SenderB {
	public static void main(String[] args) throws IOException {

		DatagramSocket datagramSocket = new DatagramSocket();

//		将需要发送的对象封装到Packet对象
		Scanner scanner = new Scanner(System.in);
		String answer = scanner.next();
		byte[] bytes = answer.getBytes();
//		Packet需要添加四个变量:(需要发送的对象数组,对象数组的长度,接收端的域名,接收端的端口)
		DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(), 8888);

		datagramSocket.send(datagramPacket);


		//		2. 构建一个 DatagramPacket 对象 准备接收数据
//		新建一个byte数组，一个数据报最大64k，所以数据的大小为
		bytes = new byte[64 * 1024];
//		新建数据报 但其实packet此时没有数据
		DatagramPacket datagramPacket1 = new DatagramPacket(bytes, bytes.length);
//		3. 调用接收方法
//		将用过网络传输的packet对象 填充到datagramPacket对象中
		System.out.println("接收端 等待接收数据...");
		datagramSocket.receive(datagramPacket1);
//		当接收到对象时,需要进行拆包,取出数据. 不取出数据的话,只是一个数据包而已,里面是没有内容的
//		4. 把Packet进行拆包 取出数据 并显示

//		实际接收到的数据字节长度
		int length = datagramPacket1.getLength();
//		接收到数据
		byte[] data = datagramPacket1.getData();
//		输出数据到屏幕
		String s = new String(data, 0, length);
		System.out.println(s);


//		B端退出
//		关闭资源
		datagramSocket.close();

	}
}
