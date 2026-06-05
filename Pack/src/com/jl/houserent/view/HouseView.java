package com.jl.houserent.view;


import com.jl.houserent.domain.House;
import com.jl.houserent.service.HouseService;
import com.jl.houserent.utils.Utility;

/*
 * 显示界面
 * 调用HouseService界面的信息*/
public class HouseView {

	private boolean loop = true;
	private char key = ' ';
	private HouseService houseService = new HouseService(1);       //假定设置数组的最大大小为10

	//添加房屋信息
	public void addHouses() {
		System.out.println("==========添加房屋==========");
		System.out.println("姓名: ");
		String name = Utility.readString(8);
		System.out.println("电话: ");
		String phone = Utility.readString(12);
		System.out.println("地址: ");
		String address = Utility.readString(16);
		System.out.println("租金: ");
		int rent = Utility.readInt(16);

		System.out.println("状态: ");
		String state = Utility.readString(3);

		House newHouse = new House(0, name, phone, address, rent, state);


		houseService.add(newHouse);

	}

	public void deleteHouse() {//接收输入id,调用service delete方法
		System.out.println("==========删除房屋信息==========");
		System.out.println("请输入带删除房屋的编号(-1表示退出):");
		int deleteId = Utility.readInt();
		if (deleteId == -1) {
			System.out.println("你放弃了删除");
		}
		char choice = Utility.readConfirmSelection();    //该方法本身就有循环判断的逻辑
		if (choice == 'Y') {
			if (houseService.delete(deleteId)) {
				System.out.println("删除房屋信息成功");

			} else {
				System.out.println("删除信息不存在");
			}

		} else {
			System.out.println("放弃删除房屋信息");
		}

	}

	public void findHouse() {
		System.out.println("请输入想要查找的房屋id");
		int fid = Utility.readInt();

		if (houseService.find(fid) != null) {
			System.out.println("==========房屋信息==========");
			System.out.println(houseService.find(fid));
		} else {
			System.out.println("==========查找失败==========");
			System.out.println("无id为" + fid + "的房屋!");
		}

	}

	public void editHouse() {
		System.out.println("请输入想要修改的房屋id");
		int eId = Utility.readInt();
		if (houseService.find(eId) != null) {
			System.out.println("请输入修改后的房屋信息");
			System.out.println("==========添加房屋==========");
			System.out.println("姓名: ");
			String name = Utility.readString(8);
			System.out.println("电话: ");
			String phone = Utility.readString(12);
			System.out.println("地址: ");
			String address = Utility.readString(16);
			System.out.println("租金: ");
			int rent = Utility.readInt(16);

			System.out.println("状态: ");
			String state = Utility.readString(3);

			House editHouse = new House(eId, name, phone, address, rent, state);

			if (houseService.edit(editHouse)) {
				System.out.println("修改成功!");
				System.out.println("修改后的房屋信息为");
				System.out.println(houseService.find(eId));
			}
		} else {
			System.out.println("房屋id不存在");
		}

	}

	//编写房屋列表
	public void listHouses() {
		System.out.println("==========房屋列表==========");
		System.out.println("编号\t\t\t房主\t\t\t电话\t\t\t地址\t\t\t租金\t\t\t\t状态");
		House[] houses = houseService.list();

		for (int i = 0; i < houses.length; i++) {       //埋雷了说是
			if (houses[i] == null) {
				break;
			}
			System.out.println(houses[i]);


		}
	}


	public void mainMenu() {

		do {

			System.out.println("==========房屋出租系统==========");
			System.out.println("\t1. 新  增  房  源");
			System.out.println("\t2. 查  找  房  屋");
			System.out.println("\t3. 删  除  房  屋  信  息");
			System.out.println("\t4. 修  改  房  屋  信  息");
			System.out.println("\t5. 显  示  房  屋  信  息");
			System.out.println("\t6. 退         出");
			System.out.println("\t请输入你的选择(1-6):");

			key = Utility.readChar();
			switch (key) {
				case '1':
					System.out.println("新增");
					addHouses();
					break;
				case '2':
					System.out.println("查找");
					findHouse();
					break;
				case '3':
					System.out.println("删除");
					deleteHouse();
					break;
				case '4':
					System.out.println("修改");
					editHouse();
					break;
				case '5':
					System.out.println("显示");
					listHouses();
					break;
				case '6':
					loop = (houseService.quit());
					break;
			}
		} while (loop);
	}

}
