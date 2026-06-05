package properties_hm;


import java.io.*;
import java.util.Properties;

public class hm3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String filePath = "src\\mytemp\\dog.properties";

        File file = new File(filePath);


        Properties properties = new Properties();

        properties.setProperty("name", "大黄");
        properties.setProperty("age", String.valueOf(3));
        properties.setProperty("color", "黑色");

        properties.store(new FileOutputStream(file), "hm3 properties output.");

        properties.load(new FileReader(file));

        String name = properties.getProperty("name");
        int age = Integer.parseInt(properties.getProperty("age"));
        String color = properties.getProperty("color");

        Dog dog = new Dog(name, age, color);

        System.out.println(dog);

//        将创建的Dog对象,序列化保存到文件dog.dat文件

        System.out.println("正在将创建的 Dog对象 序列化保存到文件dog.dat文件...");

        String dogData = "src\\mytemp\\dog.dat";

        System.out.println("正在创建输出流");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(dogData));

        System.out.println("正在保存对象");
        oos.writeObject(dog);

        System.out.println("正在创建输入流");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(dogData));
        System.out.println("正在读取对象");
        Object o = ois.readObject();

        System.out.println("转换对象运行类型...");
        Dog d = (Dog) o;

        System.out.println("dog.dat反序列化成功,读取内容如下");

        System.out.println(d);


    }
}

class Dog implements Serializable {
    private String name;
    private int age;
    private String color;


    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" + "name='" + name + '\'' + ", age=" + age + ", color='" + color + '\'' + '}';
    }
}