package com.jl.stream_.outputstream_;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStream_ {
    public static void main(String[] args) throws IOException {

//        序列化后，保存的文件格式不是纯文本，而是按照它的格式来保存
        String filePath = "E:\\JavaTest\\data.txt";

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));

//        序列化文件到 filePath

        oos.writeInt(100); //int -> Integer (实现了 Serializable 接口)
        oos.writeBoolean(true); //boolean ->Boolean
        oos.writeDouble(123.45);
        oos.writeFloat(123.45F);
        oos.writeChar('h');
        oos.writeUTF("hello"); //String 实现了Serializable

//        保存一个Dog对象
        oos.writeObject(new Dog("旺财", 10, "Japan日本", "White白色")); // Dog对象没有实现Serializable接口会抛出异常
        // NotSerializableException
        // 需要对类进行实现


        oos.close();

        System.out.println("保存完毕.");

    }
}
