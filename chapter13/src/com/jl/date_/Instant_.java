package com.jl.date_;

import java.util.Date;
import java.time.Instant;

public class Instant_ {
	public static void main(String[] args) {
		//1.通过静态方法now获取表示当前时间戳的对象
		Instant now = Instant.now();
		System.out.println(now);
//		2. 通过from可以把Instant转成Date
		Date date = Date.from(now);
//		3. 通过date的toInstant()可以把date转成Instant对象
		Instant instant = date.toInstant();
		System.out.println(instant);

	}
}
