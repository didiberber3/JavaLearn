package com.jl.interface_;

public class OracleDB implements DBInterface{
	@Override
	public void connect() {
		System.out.println("连接Oracle");
	}
	public void close(){
		System.out.println("关闭oracle");
	}
}
