package com.jl.final_;

public class Final01 {
	public static void main(String[] args) {
		E e = new E();

//		e.TAX_RATE = 0.09;
	}
}


class E {
	//final 不希望类中的属性被修改。
	public final double TAX_RATE = 0.08;
}

class F extends E {

}


//final 不希望A类被继承。
final class A {


}
// inherit from final class 'com.jl.final_.A'

//class B extends A {
//
//}

class C {
	//final 不允许其他类重写此方法。
	final public void hi() {
	}
}

class D extends C {

//	@Override
//	public void hi() {
//		super.hi();
//	}

}

class G {
	public void cry() {
//final 不希望某个局部变量被修改,这时NUM为 局部常量
		final double NUM = 0.01;
//		NUM = 0.09;
		System.out.println("Number=" + NUM);
	}

}