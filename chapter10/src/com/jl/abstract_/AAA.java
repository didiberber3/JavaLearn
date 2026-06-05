package com.jl.abstract_;

public class AAA extends Template{


	//提取job()中共有的部分,将job()塞进去


	public void job() { //重写template中的job方法
		long num = 0;
		for (long i = 0; i <= 100000; i++) {  //避免数据量过小
			num += i;
		}


	}


}
