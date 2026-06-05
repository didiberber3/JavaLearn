package com.jl.abstract_;

abstract public class Template { //抽象类-模板设计模式
	public abstract void job();

	public void calculateTime() {
		//得到开始的时间
		//being 10000 from 0
		long start = System.currentTimeMillis();
		job();  //动态绑定机制
		//得到结束的时间
		long end = System.currentTimeMillis();
		System.out.println("执行的时间为" + (end - start));

	}

}
