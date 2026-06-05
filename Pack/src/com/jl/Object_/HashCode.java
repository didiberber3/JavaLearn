package com.jl.Object_;

public class HashCode {
	public static void main(String[] args) {
		AA aa = new AA();
		AA aa2 = new AA();
		System.out.println("aa.hashCode()=\t" + aa.hashCode());
		System.out.println("aa2.hashCode()=\t" + aa2.hashCode());
		AA aa3 = aa;
		System.out.println("aa3.hashCode()=\t" + aa3.hashCode());

	}
}

class AA {

}