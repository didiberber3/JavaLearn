package com.jl.homework342.hm10;

public class Homework10 {
	public static void main(String[] args) {
		Doctor doctor1 = new Doctor("牙科医生", 18, "口腔", '男', 2000);
		Doctor doctor2 = new Doctor("牙科医生", 18, "口腔", '男', 2000);
		Doctor doctor3 = new Doctor("牙科医生", 20, "口腔", '男', 2000);
		System.out.println(doctor3.equals(doctor2));
	}
}
