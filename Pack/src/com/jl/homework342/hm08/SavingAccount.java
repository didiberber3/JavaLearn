package com.jl.homework342.hm08;

public class SavingAccount extends BankAccount {
	//老韩分析
	//新增加属性
	private int count=3;
	private double rate = 0.01;

	public SavingAccount(double initialBalance) {

		super(initialBalance);

	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void earnMonthlyInterest() {
		count=3;
		super.deposit(getBalance() * rate);
	}

	@Override
	public void deposit(double amount) {
		//判断是否可以免手续费
		if (getCount() > 0) {
			super.deposit(amount);
		} else {
			super.deposit(amount - 1);
		}
		count--;
	}

	@Override
	public void withdraw(double amount) {
		if (count > 0) {
			super.withdraw(amount);
		} else {
			withdraw(amount + 1);
		}
		count--;
	}

}
