package com.jl.poly.detail_;

public class PolyDetail03 {
	public static void main(String[] args) {
		BB bb = new BB();
		System.out.println(bb instanceof AA);
		System.out.println(bb instanceof BB);

		AA aa = new BB();
		System.out.println(aa instanceof AA);
		System.out.println(aa instanceof BB);

		Object obj = new Object();
		System.out.println(obj instanceof AA);

		String str = "Hello";
//		System.out.println(str instanceof AA);
		System.out.println(str instanceof Object);
	}
}


class AA {
}

class BB extends AA {
}