package com.jl.override_;

public class OverrideExercise {
	public static void main(String[] args) {
		//new一个Person对象
		Person person = new Person();
		//set person对象的name,age
		person.setName("jack");
		person.setAge(18);
		//print say方法
		System.out.println(person.say());

		//如上
		Student student = new Student();
		student.setName("kobe");
		student.setAge(24);
		student.setId(10086);
		student.setScore(24.3);
		System.out.println();
		System.out.println(student.say());

		/*log
		韩老师的教程没有使用到set和get方法,我并没有细看
		在自己写的时候发现没有太大的编译的bug和不理解的地方,根据idea都能知道报错在什么地方
		重点在于,使用set传入参数这一步,我没有想到在student对象中仍然需要set person中的参数
		后看老韩讲解时发现老师没有使用set和get方法,而是使用super传入参数,其本质没有太大差别
		此处老韩用意旨在让学生了解方法重写,重点在say方法的重写.
		 */

	}
}
