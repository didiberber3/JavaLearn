package com.jl.houserent.service;

import com.jl.homework342.hw14.C;
import com.jl.houserent.domain.House;
import com.jl.houserent.utils.Utility;
import com.jl.houserent.view.HouseView;

/*定义House[]保存房屋信息*/
public class HouseService {

	private House[] houses;//保存house对象
	private int houseNum = 1;  //记录当前有多少个房屋信息
	private int idCounter = 1;   //记录当前id增长到哪个值

	//新建数组大小构造器
	public HouseService(int size) {
		houses = new House[size];//当创建一个HouseService时指定数组的大小
		//配合测试列表信息
		//初始化一个house对象
		houses[0] = new House(1, "cxk", "112", "鸡场", 2000, "未出租");
	}

	//add方法 void
	public House[] add(House newHouse) {


		//进行数组扩容
		if (houseNum == houses.length) {    //房屋数量等于现在数组的长度

			//把数组的长度改为 ++houseNum 也就是houseNum+1的长度

			House[] houses1 = new House[houseNum + 1];
			for (int i = 0; i < houses.length; i++) {
				houses1[i] = houses[i];
			}
			houses1[houseNum++] = newHouse;  //把newHouse的信息给houses1数组的 "房屋数量"+1的元素
			newHouse.setId(++idCounter); //更新房屋id
			houses = houses1;

			System.out.println("==========添加房屋成功==========");
			return houses;


		} else {
			//添加房屋
			houses[houseNum++] = newHouse;  //把newHouse的信息给houses数组的 "房屋数量"+1的元素
			newHouse.setId(++idCounter); //更新房屋id
			System.out.println("==========添加房屋成功==========");
			return houses;
		}

	}

	public boolean edit(House editHouse) {
		for (int i = 0; i < houses.length; i++) {
			if (editHouse.getId() == houses[i].getId()) {
				houses[i] = editHouse;
				return true;
			}
		}
		return false;
	}

	public boolean delete(int delId) {
		// 应当先找到要删除的房屋信息的下标
		int index = -1;

		// 步骤1: 查找 - 遍历数组，寻找目标ID的索引
		for (int i = 0; i < houseNum; i++) {
			if (delId == houses[i].getId()) {
				index = i; // 找到了，记录下标
				break;     // 效率优化：找到后就退出循环
			}
		}

		// 步骤2: 删除 - 判断是否找到，并执行删除
		if (index == -1) {
			// 说明遍历完后也没找到，ID不存在
			return false;
		}

		// 如果找到，执行覆盖删除
		for (int j = index; j < houseNum - 1; j++) {
			houses[j] = houses[j + 1];
		}

		// 将最后一个有效位置置空，并更新房屋数量
		houses[--houseNum] = null;

		return true;
	}

	public boolean quit() {
		//这里我们使用util提供确认
		char choice = Utility.readConfirmSelection();
		if (choice == 'Y') {
			return false;
		} else {
			return true;
		}

	}


	public House find(int fid) {

		for (int i = 0; i < houses.length; i++) {   //遍历数组
			if (fid == houses[i].getId()) {

				return houses[i];


			}

		}
		return null;
	}


	//list方法 返回houses
	public House[] list() {

		return houses;


	}
}
