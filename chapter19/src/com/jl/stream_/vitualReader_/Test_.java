package com.jl.stream_.vitualReader_;


public class Test_ {

    public static void main(String[] args) {


        BufferedReader_ bufferedReader = new BufferedReader_(new FileReader_());

        bufferedReader.readFiles(3);

        BufferedReader_ bufferedReader1 = new BufferedReader_(new StringReader_());


        bufferedReader1.readStrings(10);


    }
}
