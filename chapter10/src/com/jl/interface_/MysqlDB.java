package com.jl.interface_;

public class MysqlDB implements DBInterface {
	@Override
	public void connect() {
		System.out.println("链接MySQL");

	}

	@Override
	public void close() {
		System.out.println("关闭MySQL");
	}
}
