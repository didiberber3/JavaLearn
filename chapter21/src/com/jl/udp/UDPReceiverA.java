package com.jl.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class UDPReceiverA {
	public static void main(String[] args) throws IOException {
//		1. 创建一个 DatagramSocket 对象 准备接收数据
//		   端口设置为9999
		DatagramSocket datagramSocket = new DatagramSocket(9999);
//		2. 构建一个 DatagramPacket 对象 准备接收数据
//		新建一个byte数组，一个数据报最大64k，所以数据的大小为
		byte[] bytes = new byte[64 * 1024];
//		新建数据报 但其实packet此时没有数据
		DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
//		3. 调用接收方法
//		将用过网络传输的packet对象 填充到datagramPacket对象中
		System.out.println("接收端 等待接收数据...");
		datagramSocket.receive(datagramPacket);
//		当接收到对象时,需要进行拆包,取出数据. 不取出数据的话,只是一个数据包而已,里面是没有内容的
//		4. 把Packet进行拆包 取出数据 并显示

//		实际接收到的数据字节长度
		int length = datagramPacket.getLength();
//		接收到数据
		byte[] data = datagramPacket.getData();
//		输出数据到屏幕
		String s = new String(data, 0, length);
		System.out.println(s);



		//		将需要发送的对象封装到Packet对象
		bytes = "Hello,明天吃火锅!".getBytes();
//		Packet需要添加四个变量:(需要发送的对象数组,对象数组的长度,接收端的域名,接收端的端口)
		DatagramPacket datagramPacket1 = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("172.20.10.9"), 9998);

		datagramSocket.send(datagramPacket1);




//		A端退出
		datagramSocket.close();


	}
}
