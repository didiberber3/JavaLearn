// 声明(public)一个公共类(class) Main。类名需要与文件名相同。
public class Main {

    // main 方法是 Java 程序的入口点。每个 Java 应用程序都必须有一个 main 方法。
    // 该方法接收一个字符串数组作为参数，用于接收命令行输入。
    // static 是 Java 中的一个关键字，它用于声明类的成员（字段、方法、代码块等）为 静态的，使得该成员不依赖于类的实例，而是与类本身相关联。
    public static void main(String[] args) {

        // 使用 System.out.println() 输出 "Hello, World!" 到控制台。
        // println() 方法用于打印文本并换行。
        System.out.println("Hello, World!");

        // 注意：System 是一个类，out 是它的静态成员，println() 是 out 对象的方法。
        // 这个语句的作用是向控制台打印出文本信息。
    }
}
