package com.jl.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDetail {
	public static void main(String[] args) {
		f3();
	}

	public static void f3() throws ArithmeticException {
		int n1 = 10;
		int n2 = 0;
		double res = n1 / n2;

	}

	public static void f1() throws RuntimeException {
		//这里思考问题为什么会报错,原因是throws将异常抛给f1 f1必须处理
		f2();
	}

	public static void f2() throws RuntimeException {

		//FileInputStream fileInputStream = new FileInputStream();
	}

	public static void f4() {

		f5();
	}

	public static void f5() throws ArithmeticException {

	}

}

class Father {
	public void method() throws RuntimeException {

	}
}

class Son extends Father {
	//3. 子类重写父类时,对抛出异常的规定,子类重写的方法,
	//   所抛出的异常类型要么和父类抛出的异常一致,要么为了父类抛出的异常的类型的子类型
	//4. 在throws过程中,如果有方法try-catch就相当于处理异,就可以不必throws
	@Override
	public void method() throws RuntimeException {

	}
}