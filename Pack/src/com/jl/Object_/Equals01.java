package com.jl.Object_;


public class Equals01 {
	public static void main(String[] args) {
		A a = new A();
		A b = a;
		A c = b;
		//此时,b和c都指向了a所新建的地址
		System.out.println(a == c);     //true
		System.out.println(b == c);     //true


		B obj = a;//需要建立继承关系
		System.out.println(obj == c);   //true
		int num = 10;
		double num1 = 10.0;
		System.out.println(num1 == num);//true

		//equals方法的源码怎么查看

		"hello".equals("abc");

		//equals的源码:
		//把object类的equals重写了,比较两个字符串的值

		/*
		    public boolean equals(Object anObject) {
        if (this == anObject) {                             //如果是同一个对象 返回true
            return true;
        }
        if (anObject instanceof String) {                   //向下转型
            String anotherString = (String)anObject;
            int n = value.length;
            if (n == anotherString.value.length) {          //如果长度相同
                char v1[] = value;
                char v2[] = anotherString.value;
                int i = 0;
                while (n-- != 0) {                          //比较字符
                    if (v1[i] != v2[i])                     //有任何一个字符不相等
                        return false;                       //返回false
                    i++;
                }
                return true;                                //如果两个字符串所有字符都相等则返回true
            }
        }
        return false;                                       //如果比较的不是字符串,返回false
    }
    */


		Object object = 1;
		//即obj的equals方法,默认就是比较对象的地址是否相同 即判断两个对象是不是同一个对象
		//    public boolean equals(Object obj) {
		//        return (this == obj);
		//    }

		Integer integer = new Integer(311);
		Integer integer1 = new Integer(311);
		System.out.println(integer == integer1);            //false
		System.out.println(integer.equals(integer1));       //true

		String string1 = new String("nb666");
		String string2 = new String("nb666");

		System.out.println(string1 == string2);             //false
		System.out.println(string1.equals(string2));        //true

		//Integer也重写了Object中的equals
		//变成了判断两个数的值是否相同
		//    public boolean equals(Object obj) {
		//        if (obj instanceof Integer) {     //传进来的这个值 如果是Integer中的值
		//            return value == ((Integer)obj).intValue();    //返回
		//        }
		//        return false;
		//    }


	}
}

class A extends B {

}

class B {

}