package com.jl.enum_;

/**
 * 演示enum的各种方法
 */
public class EnumMethod {
	public static void main(String[] args) {
		//使用Season3 演示方法

		//1.name()输出名字
		Season3 spring = Season3.SPRING;
		System.out.println(spring.name());  //SPRING

		//2.ordinal()输出该枚举对象的次序
		Season3 summer = Season3.SUMMER;
		System.out.println(summer.ordinal());   //1 按数组的方式,第一个是0

		//3.values()方法,返回Season2[]
		Season3[] values = Season3.values();
		System.out.println("========遍历取出枚举对象========");
		for (Season3 season3 : values) {   //增强for循环
			System.out.println(season3);
		}

		//4.valueOf():将字符串转换成枚举对象,要求字符串必须为已有的常量名,否则报异常
		//  1.根据你输入的名称"SUMMER"到Season3的枚举对象去查找
		//  2.如果找到了就返回,没有找到就报错
		Season3 season3 = Season3.valueOf("SUMMER");
		System.out.println("season3=" + season3);

		//5.compareTo():比较两个常量,比较的是编号.
		/**
		 *     public final int compareTo(E o) {
		 *
		 *         return self.ordinal - other.ordinal;
		 *     }
		 */
		//调用方法的那个对象的编号-传入参数的编号
		System.out.println(Season3.SPRING.compareTo(Season3.SUMMER));


//		//补充增强for循环
//		int[] nums = {1, 2, 9};
//		for (int i = 0; i < nums.length; i++) {
//			System.out.println(nums[i]);
//
//		}
//		System.out.println("增强for循环");
//		for (int i : nums) {    //依次从nums数组中获取元素赋给i,如果取出完毕则退出for循环
//			System.out.println("i=" + i);
//		}


	}
}

enum Season3 {
	SPRING("Spring", "warm"), SUMMER("Summer", "hot");

	private String name;
	private String desc;


//	public final static Season SPRING = new Season("Spring", "warm");
//	public final static Season SUMMER = new Season("Summer", "hot");
//	public final static Season AUTUMN = new Season("Autumn", "cool");
//	public final static Season WINTER = new Season("Winter", "cold");

	//如果使用enum实现枚举类,


	Season3() {
	}

	private Season3(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}

	public String getName() {
		return name;
	}

	public String getDesc() {
		return desc;
	}

	//重写toString测试
	@Override
	public String toString() {
		return "Season{" +
				"name='" + name + '\'' +
				", desc='" + desc + '\'' +
				'}';
	}

}