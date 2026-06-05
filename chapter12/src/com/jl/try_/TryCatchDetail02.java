package com.jl.try_;

public class TryCatchDetail02 {
	public static void main(String[] args) {

		try {
			Person person = new Person();
//			person = null;
			System.out.println(person.getName());
			int n1 = 10;
			int n2 = 0;
			int res = n1 / n2;

		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println(123);
		}

	}
}

class Person {
	private String name;

	public String getName() {
		return name;
	}
}
