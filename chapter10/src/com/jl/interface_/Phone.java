package com.jl.interface_;

//Phone类 实现(implements) UsbInterface
public class Phone implements UsbInterface {
	@Override
	public void start() {
		System.out.println("手机开始工作");
	}

	@Override
	public void stop() {
		System.out.println("手机停止工作");
	}
}
