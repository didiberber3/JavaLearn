package com.jl.stream_.vitualReader_;

//处理流：包含了一个Reader_属性，是Reader_的子类

public class BufferedReader_ extends Reader_ {


    private Reader_ reader_;

//    接收Reader的子类
    public BufferedReader_(Reader_ reader) {
        reader_ = reader;
    }

    public void readFiles(){
        reader_.readFile();
    }

    //    让方法更灵活
    public void readFiles(int num) {

        for (int i = 0; i < num; i++) {
            reader_.readFile();
        }
    }


    public void readStrings(int num) {

        for (int i = 0; i < num; i++) {

            reader_.readString();

        }
    }
}
