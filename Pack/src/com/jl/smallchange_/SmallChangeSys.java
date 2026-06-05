package com.jl.smallchange_;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
	public static void main(String[] args) {



		Scanner scanner = new Scanner(System.in);// 新建扫描器

		// 2. 完成收益明细
		String details = "\n----====\t零钱通明细\t====----\n";
		// 3. 完成入账
		double money = 0;
		double balance = 0;
		boolean loop = true;
		Date date = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh-mm");// 用于日期格式化
		// 4.消费
		// 定义新变量,保存消费的原因
		String note = "";

		// 在处理收益和入账时,判断
		do {
			System.out.println("----====\t零钱通菜单\t====----\n" +
					"\t1.零钱通明细\n" +
					"\t2.收益入账\n" +
					"\t3.消费\n" +
					"\t4.退出\n" +
					"请选择(1-4):");

			// 扫描器请求输入
			String s = scanner.nextLine();

			switch (s) {
				case "1":
					// 执行功能零钱通明细,使用Account类中的showCheck
					System.out.println(details);
					System.out.println();
					break;

				case "2":
					// 执行入账,使用Earns类中的方法
					System.out.print("请输入入账金额:");

					money = scanner.nextDouble();
					scanner.nextLine();
					// 判断输入金额是否正确
					if (money <= 0) {
						System.out.println("输入金额有误,重新输入 case2");
						break;
					}
					balance += money;
					date = new Date();
					details += "\n收益入账\t" + "+" + money + "\t" + sdf.format(date) + "\t" + balance;

					break;
				case "3":
					// 执行消费,使用Spends类中的方法
					System.out.println("输入消费金额...");
					money = scanner.nextDouble();
					scanner.nextLine();
					if (money <= 0 || money > balance) {
						System.out.println("消费金额应该在(0-" + balance + ")");
						break;
					}
					System.out.println("消费说明...");
					note = scanner.nextLine();

					balance -= money;
					date = new Date();
					details += "\n" + note + "\t" + "-" + money + "\t" + sdf.format(date) + "\t" + balance;
					break;

				case "4":
					String sQuit;
					while (true) {
						// 定义一个变量接收输入
						// 使用while和break处理接收到的这个输入是Y或者N
						System.out.println("确认退出零钱通(Y/N)");
						sQuit = scanner.nextLine();

						// if (sQuit.equals("Y") || sQuit.equals("N")) {
						// break;
						// }
						if (sQuit.equals("Y")) {
							System.out.println("成功退出,再见!");
							loop = false;
							break;

						} else if (sQuit.equals("N")) {
							break;
						}
					}

			}

		} while (loop);
		System.out.println("退出了零钱通...........");

	}

}
