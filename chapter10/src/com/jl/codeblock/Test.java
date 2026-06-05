package com.jl.codeblock;

class Test {
	//主方法
	public static void main(String[] args) {
		Test a = new Test();//无参构造器
		/*new Test对象a,调用午餐构造器 看Test
		 * Test中new 了Sample对象sam1 普通对象,传入参数"sam1成员初始化" 看Sample
		 * Sample中String s构造器   sout打印"sam1成员初始化"
		 * Test中new 了静态对象static sam,传参"静态成员sam初始化"看Sample
		 * Sample中String s构造器   sout打印"静态成员sam初始化"
		 * Test中静态代码块 sout"static块执行" 判断sam==null如果是sout"sam is null"
		 * 看顺序 静态,普通,看定义顺序
		 *
		 * Test静态 成员 代码块
		 * sout"静态成员sam初始化"
		 * sout"static块执行"
		 * "sam1成员初始化"
		 * "Test默认构造函数被调用"
		 */
		System.out.println(sam);//sam现在不为空
	}

	Sample sam1 = new Sample("sam1成员初始化");//
	static Sample sam = new Sample("静态成员sam初始化 ");//

	static {
		System.out.println("static块执行");//
		if (sam == null) System.out.println("sam is null");
	}

	Test() {
		System.out.println("Test默认构造函数被调用");//
	}


}

class Sample {
	Sample(String s) {
		System.out.println(s);
	}

	Sample() {
		System.out.println("Sample默认构造函数被调用");
	}
}
