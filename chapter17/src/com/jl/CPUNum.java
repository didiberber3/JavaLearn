package com.jl;

public class CPUNum {
    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();

        int cpuNums=runtime.availableProcessors();
        System.out.println("cpuNums: "+cpuNums);


    }
}
