package com.jl.interface_;

public class Computer {
	//编写一个方法
	public void work(UsbInterface UsbInterface) {
		//通过接口,来调用方法
		UsbInterface.start();
		UsbInterface.stop();
	}
}
