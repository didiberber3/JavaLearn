package com.jl.hm.hm1;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class Hm1Client {
	public static void main(String[] args) throws IOException {

		Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
		StreamUtils streamUtils = new StreamUtils();
		String strName = "name";
		String strHobby = "hobby";
		String test = "SendTest...";
		streamUtils.sendString(socket, strName);
		streamUtils.receiveString(socket);
		streamUtils.sendString(socket, strHobby);
		streamUtils.receiveString(socket);
		streamUtils.sendString(socket, test);
		streamUtils.receiveString(socket);

		socket.close();


	}
}
