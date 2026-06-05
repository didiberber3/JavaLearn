package com.jl.innerclass_;

public class InnerClassExercise {

}

class Test {
	public Test() {
		InnerA1 innerA1 = new InnerA1();
		innerA1.a = 10; //只修改了对象实例中的a值,不改变地址原值
		InnerA1 innerA2 = new InnerA1();
		System.out.println(innerA2.a);//输出的是新建对象innerA2对象中的a值=5
	}

	class InnerA1 {
		public int a = 5;
	}

	public static void main(String[] args) {
		Test test = new Test();
		InnerA1 r = test.new InnerA1();
		System.out.println(r.a);    //输出的是内部对象InnerA1中的值r.a=5;
	}


}

