package com.jl.annotation;

public class Deprecated_ {
	public static void main(String[] args) {

		A a = new A();
		a.hi();
	}
}

//@Deprecated 修饰某个元素,表示该元素已经过时了.
//即在不推荐使用,但是仍然可以使用
// 可以在版本升级中使用
/*
	@Documented
	@Retention(RetentionPolicy.RUNTIME)
	@Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, PARAMETER, TYPE})
	public @interface Deprecated {
	}

*/
@Deprecated
class A {
	public int n1 = 10;

	@Deprecated
	public void hi() {
	}
}