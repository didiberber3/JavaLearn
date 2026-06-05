package com.jl.homework_;

import java.util.*;

public class h1 {

	public static void main(String[] args) {

		News news1 = new News("新冠确诊病例超干万，数百万印度教信徒赴恒河“圣浴”引民众担忧");
		News news2 = new News("男子突然想起2个月前钓的鱼还在网兜里，捞起一看赶紧放生");

		List list = new ArrayList();
		list.add(news1);
		list.add(news2);
		System.out.println("新闻列表" + list);

//		反转ArrayList
		Collections.reverse(list);
//		迭代器遍历
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			Object next = iterator.next();
			News newst = (News) next;
//			将标题改为15个字之后变成...
//			思考：判断条件，如果newst.getTitle().length()>=15，
			if (newst.getTitle().length() >= 15) {
//				得到对象中的标题属性，将标题属性获得一个子串为0-15区间,
				String TempList = newst.getTitle().substring(0, 15);
//				输出字符串+... 换行
				System.out.println(TempList + "...");

//			否则输出标题（标题长度<15）
			} else {
				System.out.println(newst.getTitle());
			}
		}
	}
}

class News {
	private String title;
	private String content;

	public News(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return this.title;
	}
}