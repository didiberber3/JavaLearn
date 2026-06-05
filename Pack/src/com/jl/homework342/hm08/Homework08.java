package com.jl.homework342.hm08;


import java.sql.Savepoint;

public class Homework08 {
	public static void main(String[] args) {
//		CheckingAccount checkingAccount = new CheckingAccount(1000);
//		checkingAccount.deposit(100);
//		System.out.println(checkingAccount.getBalance());
//
//		checkingAccount.withdraw(100);
//		System.out.println(checkingAccount.getBalance());

		SavingAccount savingAccount = new SavingAccount(1000);
		savingAccount.deposit(100);
		savingAccount.deposit(100);
		savingAccount.deposit(100);
		System.out.println(savingAccount.getBalance());//1300
		savingAccount.deposit(100);
		System.out.println(savingAccount.getBalance());//1399=1400-1
		//月初定时器自动调用
		savingAccount.earnMonthlyInterest();//count恢复成3
		System.out.println(savingAccount.getBalance());
		savingAccount.withdraw(100);
		savingAccount.withdraw(100);
		savingAccount.withdraw(100);
		System.out.println(savingAccount.getBalance());
		savingAccount.deposit(100);
		savingAccount.deposit(100);
		savingAccount.deposit(100);
	}
}
