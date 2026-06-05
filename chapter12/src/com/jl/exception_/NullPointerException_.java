package com.jl.exception_;

public class NullPointerException_ {
	public static void main(String[] args) {
		String name = null;

		try {
			System.out.println(name.length());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}


	}
}
