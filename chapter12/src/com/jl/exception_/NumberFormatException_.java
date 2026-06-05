package com.jl.exception_;

public class NumberFormatException_ {
	public static void main(String[] args) {
		String name = "hsp";
		int num = 0;
		try {
			num = Integer.parseInt(name);
		} catch (NumberFormatException e) {
			throw new RuntimeException(e);
		}

	}
}
