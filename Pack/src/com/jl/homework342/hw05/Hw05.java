package com.jl.homework342.hw05;

public class Hw05 {
	public static void main(String[] args) {
		//3. 编写一个测试类,将各种类型的员工的全年工资打印出来
		Employee employee = new Employee("666", 1000);
//		employee.setSalMonth(15); //灵活修改带薪月份
		employee.showSal();

		Employee employee1 = new Worker("(你背叛了工人阶级 操你妈)", 2000);
		employee1.showSal();

		Employee employee3 = new Waiter("(谁还有多余资金)", 1000);
		employee3.showSal();

		new Peasant("(百万雄师都听我号令)", 3000).showSal();



		Teacher employee2 = new Teacher("(老韩)", 2000);
		employee2.setSalMonth(12);
		employee2.setClassDays(80);
		employee2.setClassSal(100);
		employee2.showSal();

		Scientist scientist = new Scientist("(大发明家)", 5000);
		scientist.setBonus(500000);
		scientist.showSal();


	}
}

//## 设计父类一员工类。
class Employee {
	private String name;
	private double basicSal;
	private int salMonth = 12;

	//写一个构造器用于接收 基础工资
	public Employee(String name, double basicSal) {
		this.name = name;
		this.basicSal = basicSal;
	}

	public double getBasicSal() {
		return basicSal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBasicSal(double basicSal) {
		this.basicSal = basicSal;
	}

	public int getSalMonth() {
		return salMonth;
	}

	public void setSalMonth(int salMonth) {
		this.salMonth = salMonth;
	}

	//写一个输出全年工资的方法
	public void showSal() {
		System.out.println(name + "全年工资为: " + (basicSal * salMonth));
	}
}

//子类:工人类
// 只有基本工资
class Worker extends Employee {

	public Worker(String name, double basicSal) {
		super(name, basicSal);
	}


	//写一个输出全年工资的方法

	@Override
	public void showSal() {
		System.out.println("工人-");
		super.showSal();
	}
}

//农民类
class Peasant extends Employee {
	public Peasant(String name, double basicSal) {
		super(name, basicSal);
	}

	@Override
	public void showSal() {
		System.out.println("农民-");
		super.showSal();
	}

}

//服务生类
class Waiter extends Employee {
	public Waiter(String name, double basicSal) {
		super(name, basicSal);
	}

	@Override
	public void showSal() {
		System.out.println("服务生-");
		super.showSal();
	}
}

// 教师除基本工资外,还有课酬(元/天)
//教师类,
class Teacher extends Employee {
	private int classDays;
	private double classSal;

	public int getClassDays() {
		return classDays;
	}

	public void setClassDays(int classDays) {
		this.classDays = classDays;
	}

	public double getClassSal() {
		return classSal;
	}

	public void setClassSal(double classSal) {
		this.classSal = classSal;
	}

	public Teacher(String name, double basicSal) {
		super(name, basicSal);
	}

	@Override
	public void showSal() { //老师工资算法不同
		System.out.println("老师-");
		System.out.println(getName() + "年工资是 " + getSalMonth() * getSalMonth() + classSal * classDays);

	}
}

//2. 科学家除基本工资外,还有年终奖
//科学家类,
class Scientist extends Employee {
	private double bonus;

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public Scientist(String name, double basicSal) {
		super(name, basicSal);
	}

	@Override
	public void showSal() {
		System.out.println("科学家-");
		System.out.println(getName() + (getBasicSal() * getSalMonth() + bonus));
	}
}

//




