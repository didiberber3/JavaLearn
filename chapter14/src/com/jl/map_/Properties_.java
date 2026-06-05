package com.jl.map_;

import java.util.Properties;

public class Properties_ {

	public static void main(String[] args) {

		Properties p = new Properties();

		p.put("john", 100);
		p.put("lucy", 100);
		p.put("lic", 100);
		p.put("lic", 88);
		p.put("jason", 100);

		System.out.println(p);
		System.out.println(p.getProperty("john"));//100

	}
}
