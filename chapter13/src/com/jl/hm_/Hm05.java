package com.jl.hm_;

public class Hm05 {
	public static void main(String[] args) {
		String s1 = "hspedu";
		Animal a = new Animal(s1);
		Animal b = new Animal(s1);

		System.out.println(a == b); //*F* 不是同一个对象 错以为是比较地址，实际上是比较对象，两个对象是分别new的
		System.out.println(a.equals(b));//F 不是同一个对象
		System.out.println(a.name == b.name);//T 都引用了常量池中的hspedu
		String s4 = new String("hspedu");
		String s5 = "hspedu";
		System.out.println(s1 == s4);//F
		System.out.println(s5 == s4);//F

		String t1 = "hello" + s1;
		String t2 = "hellohspedu";
		System.out.println(t1.intern() == t2);//T
	}
}

class Animal {
	String name;

	public Animal(String name) {
		this.name = name;

	}


}