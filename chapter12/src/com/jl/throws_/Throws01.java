package com.jl.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws01 {
	public static void main(String[] args) {

	}

	public void f2() throws FileNotFoundException {
		/**
		 * 这里的异常是一个FileNotFoundException
		 * 1. try catch
		 * 2. 使用throws,抛出异常,让调用f2方法的调用者处理
		 * 3. Throws 抛出 将异常抛到上一层
		 * 4. throws后面的异常类型可以是方法中产生的异常类型,也可以是他的父类
		 * 5. 可以是异常列表,即可以抛出多个异常
		 */
		FileInputStream fis = new FileInputStream("d://aa.txt");
	}
}
