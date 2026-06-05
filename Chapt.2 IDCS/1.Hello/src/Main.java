// public class Main 表示Main是一个类，是一个public公有的类
// Main{ } 表示一个类的开始和结束
// public static void main(String[] args) 表示一个主方法，即程序的入口
// { }方法的开始和方法的结束
// System.out.println("Hello World"); 输出一个"Hello World"到屏幕
// ;代表语句的结束

public class Main {

    //编写一个 main 方法
    public static void main(String[] args) {
        //记录人的信息
        int age = 30 ;
        double score = 88.2;
        char gender = '男';
        String name = "king" ;

        System.out.println("人的信息如下");
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(score);


    }
}