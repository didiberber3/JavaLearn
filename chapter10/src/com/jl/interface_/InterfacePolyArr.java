package com.jl.interface_;

public class InterfacePolyArr {
	public static void main(String[] args) {

		//多态数组: 接口类型的数组
		Usb[] usbs = new Usb[2];
		usbs[0] = new MyPhone();
		usbs[1] = new MyCamera();
		/*遍历多态数组,调用其中的方法*/
		for (int i = 0; i < usbs.length; i++) {
			usbs[i].work();
			if (usbs[i] instanceof MyPhone) {   //向下转型
				((MyPhone) usbs[i]).call();
			}
		}

	}
}


interface Usb {
	void work();
}

class MyPhone implements Usb {
	@Override
	public void work() {
		System.out.println("手机工作中");
	}

	public void call() {
		System.out.println("手机可以打电话");
	}
}

class MyCamera implements Usb {
	@Override
	public void work() {
		System.out.println("相机工作中");
	}

}

