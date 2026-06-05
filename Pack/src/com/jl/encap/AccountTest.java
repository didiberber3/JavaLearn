package com.jl.encap;

public class AccountTest {
	public static void main(String[] args) {

		//创建一个account
		Account account = new Account();
		account.setName("jack666");
		account.setBalance(15);
		account.setPassword("jackie1");
		account.showInfo();
	}
}
