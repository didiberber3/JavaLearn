package com.jl.codeblock;
public class BlockDetail {
	public static void main(String[] args) {

//		AA aa = new AA();

//		System.out.println();
		BB bb = new BB();   //父类先被加载,子类后被加载

		System.out.println(Cat.n1); //当然被加载了,使用了静态成员

		DD dd = new DD();
		DD dd1 = new DD();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println(DD.num1);
	}}

class Animal {
	static {System.out.println("Animal的静态代码块被执行");}
}
class Cat extends Animal {
	static {System.out.println("Cat的静态代码块被执行");}

	public static int n1 = 999;
}

class AA {
	static {System.out.println("AA的静态代码块1被执行");}
}



class BB extends AA {
	static {System.out.println("BB的静态代码块被执行");}
}


class DD {
	public static int num1=10;
	static {System.out.println("DD的静态代码块1被执行");}
	{System.out.println("DD的非静态代码块1被执行");}      //在类创建的时候会被调用,每创建一次调用一次

}
