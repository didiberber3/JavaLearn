package com.jl.Object_;

public class ToString {
	public static void main(String[] args) {

		//Object toString的源码

		//    public String toString() {    //返回字符串getClass() 类的全类名,包名+类名
		//        return getClass().getName()
		//        + "@"         //做间隔
		//        + Integer.toHexString(hashCode());
		//    }
		Monster monster = new Monster("小妖", "巡山", 200);
		System.out.println(monster.toString() + "\nhashcode=" + monster.hashCode());
		System.out.println(monster);//默认等价monster.toString()
	}
}

class Monster {
	private String name;
	private String job;
	private double salary;

	public Monster() {
	}

	public Monster(String name, String job, double salary) {
		this.name = name;
		this.job = job;
		this.salary = salary;
	}
	//重写toString方法,输出对象的属性
	//使用快捷键即可生成

	@Override
	public String toString() {  //重写后一般默认写出对象的属性
		return "Monster{" +
				"name='" + name + '\'' +
				", job='" + job + '\'' +
				", salary=" + salary +
				'}';
	}
}
