package com.jl.set_;


import java.util.HashSet;
import java.util.Objects;

@SuppressWarnings("all")
public class HashSetExercise02 {
	public static void main(String[] args) {

		HashSet hashSet = new HashSet();
		hashSet.add(new Employee1("tom", 1800, 2003, 12, 21));
		hashSet.add(new Employee1("tom", 1800, 2003, 12, 21));
		hashSet.add(new Employee1("jack", 1800, 2004, 8, 2));

		System.out.println(hashSet);


	}


}

class Employee1 {
	private String name;
	private double sal;

	private Mydate birthday;


	@Override
	public String toString() {
		return "Employee1{" +
				"name='" + this.name + '\'' +
				", sal=" + this.sal +
				",birthday=" + this.birthday +
				'}';
	}

	public Employee1(String name, double sal, int year, int month, int day) {
		this.name = name;
		this.sal = sal;
		this.birthday = new Mydate(year, month, day);
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Employee1)) return false;
		Employee1 employee1 = (Employee1) o;
		return Double.compare(sal, employee1.sal) == 0 && Objects.equals(name, employee1.name) && Objects.equals(birthday, employee1.birthday);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, sal, birthday);
	}

	class Mydate {
		private int year;
		private int month;
		private int day;

		public Mydate(int year, int month, int day) {
			this.year = year;
			this.month = month;
			this.day = day;
		}

		@Override
		public String toString() {
			return year + "-" + month + "-" + day;

		}

		@Override
		public boolean equals(Object o) {
			if (!(o instanceof Mydate)) return false;
			Mydate mydate = (Mydate) o;
			return year == mydate.year && month == mydate.month && day == mydate.day;
		}

		@Override
		public int hashCode() {
			return Objects.hash(year, month, day);
		}
	}

}