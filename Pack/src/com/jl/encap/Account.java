package com.jl.encap;

public class Account {
	private String name;
	private double balance = 20;
	private String password;

	public Account() {
	}

	public Account(String name, double balance, String password) {
		this.setName(name);
		this.setBalance(balance);
		this.setPassword(name);
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public String getPassword() {
		return password;
	}

	public void setName(String name) {
		if (name.length() >= 2 && name.length() <= 4) {
			this.name = name;
		} else {
			System.out.println("超过字符限制（2~4），已返回默认值：def");
			this.name = "def";
		}

	}

	public void setBalance(double balance) {
		if (balance >= 20) {
			this.balance = balance;
		} else {
			System.out.println("余额不足（大于20），已返回默认值：20");
			this.balance = 20;
		}
	}

	public void setPassword(String password) {
		if (password.length() == 6) {
			this.password = password;
		} else {
			System.out.println("密码长度错误（6位），已返回默认值：123456");
			this.password = "123456";
		}

	}

	public void showInfo() {
		//此处添加权限验证if：验证通过，执行语句 else：权限不足
		System.out.println("账号信息为：");
		System.out.println("姓名：" + name);
		System.out.println("余额：" + balance);
		System.out.println("密码：" + password);
	}
}
