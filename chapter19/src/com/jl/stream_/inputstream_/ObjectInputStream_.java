package com.jl.stream_.inputstream_;


import com.jl.stream_.outputstream_.Dog;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStream_ {
    public static void main(String[] args) throws Exception {

        String filePath = "E:\\JavaTest\\data.txt";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));

//        读取数据的反序列化的顺序需要和序列化时的顺序一致
//        否则会出现异常
//
//        更改了序列化的类等之后,需要重新序列化,再进行反序列化

        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readDouble());
        System.out.println(ois.readFloat());
        System.out.println(ois.readChar());
        System.out.println(ois.readUTF());


//        Dog的编译类型是Object,运行类型是Dog
        Object o = ois.readObject();
        System.out.println(o.getClass());
        System.out.println(o);

//        如果我们需要调用Dog的方法,需要进行向下转型
//        还需要将类进行公有化,因为类会就近选择
        Dog dog = (Dog) o;
        System.out.println(dog.getName());
        System.out.println(dog.getAge());


    }
}
