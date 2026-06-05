package com.jl.wrapper;

public class WrapperExercise03 {
	public static void main(String[] args) {

		Integer i1 = new Integer(127);
		Integer i2 = new Integer(127);
		System.out.println(i1 == i2);   //false         只要是new出来的对象一定是不同的对象,因为是引用对象

		Integer i3 = new Integer(128);
		Integer i4 = new Integer(128);
		System.out.println(i3 == i4);   //false     同上

		Integer i5 = 127;
		Integer i6 = 127;
		System.out.println(i5 == i6);   //true 范围是-128~127

		Integer i7 = 128;
		Integer i8 = 128;
		System.out.println(i7 == i8); //false 超范围 同上

		Integer i9 = 127;
		Integer i10 = new Integer(127);
		System.out.println(i9 == i10);  //true          valueOf 从底层取出...new是不同对象

		Integer i11 = 127;
		int i12 = 127;            //只要有基本数据类型,那么判断的是值是否相等
		System.out.println(i11 == i12);   //true

		Integer i13 = 128;
		int i14 = 128;
		System.out.println(i13 == i14);// true 对比数值 同上

	}
}
