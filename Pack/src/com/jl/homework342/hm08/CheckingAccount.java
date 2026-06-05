package com.jl.homework342.hm08;

public class CheckingAccount extends BankAccount {
	private double checkingAmount = 1;

	public double getCheckingAmount() {
		return checkingAmount;
	}

	public void setCheckingAmount(double checkingAmount) {
		this.checkingAmount = checkingAmount;
	}

	public CheckingAccount(double initialBalance) {
		super(initialBalance);
	}

	//通过重写存取款方法收取手续费


	@Override//重写存款
	public void deposit(double amount) {
		super.deposit(amount - 1);      //巧妙的使用了父类的deposit
	}

	@Override//重写取款
	public void withdraw(double amount) {
		super.withdraw(amount + 1);
	}
}
