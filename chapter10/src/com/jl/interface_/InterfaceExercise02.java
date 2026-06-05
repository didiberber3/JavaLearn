package com.jl.interface_;

public class InterfaceExercise02 {
	public static void main(String[] args) {
		BC bc = new BC();
		bc.pX();
	}
}

interface BA {
	int x = 0;
}

class BB {
	int x = 1;

}

class BC extends BB implements BA {
	public void pX() {
		System.out.println(BA.x);//接口直接用名访问
		System.out.println(super.x);//类用super访问
		//Reference to 'x' is ambiguous, both 'BA.x' and 'BB.x' match
		//ambiguous,模棱两可的,不清楚x到底是BA,x还是BB.x
		//此处问题在于 interface中的x是final static.
		// 类中重复使用了x,所以此处重复了x
	}

}