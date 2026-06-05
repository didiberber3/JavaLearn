package com.jl.abstract_;

public class BBB extends Template{


	public void job() { //重写Template类的job()方法

		//得到开始的时间
		//being 10000 from 0

		long num = 0;
		for (long i = 0; i <= 800000; i++) {  //避免数据量过小
			num *= i;
		}

	}
}
