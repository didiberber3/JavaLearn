package com.jl.tankgame5;

import java.io.*;
import java.util.Vector;

// 该类用于记录相关信息，与文件交互
public class Recorder {


    private static int allEnemyTankNum = 0;
    //    定义IO对象
    private static FileWriter fw = null;
    private static BufferedWriter bw = null;
    private static BufferedReader br = null;
    private static String recordFile = "src\\recorder.txt";
    private static Vector<EnemyTank> enemyTanks = null;
    private static Vector<Node> nodes = new Vector<>();

    public static Vector<EnemyTank> getEnemyTanks() {
        return enemyTanks;
    }

    public static void setEnemyTanks(Vector<EnemyTank> enemyTanks) {
        Recorder.enemyTanks = enemyTanks;
    }

    public static int getAllEnemyTankNum() {
        return allEnemyTankNum;
    }

    public static void setAllEnemyTankNum(int allEnemyTankNum) {
        Recorder.allEnemyTankNum = allEnemyTankNum;
    }

    public static FileWriter getFw() {
        return fw;
    }

    public static void setFw(FileWriter fw) {
        Recorder.fw = fw;
    }

    public static BufferedWriter getBw() {
        return bw;
    }

    public static void setBw(BufferedWriter bw) {
        Recorder.bw = bw;
    }

    public static String getRecordFile() {
        return recordFile;
    }

    public static void setRecordFile(String recordFile) {
        Recorder.recordFile = recordFile;
    }

    //    当我方坦克击中敌方坦克，就应当++
    public static void addAllEnemyTank() {
        allEnemyTankNum++;
    }

    public static String getRecordFileName() {
        return recordFile;
    }
    public static void setRecordFileName(String recordFileName) {}


    //该方法在继续上局时调用
    public static Vector<Node> getNodesAndEnemies() {

        try {

                br = new BufferedReader(new FileReader(recordFile));



            allEnemyTankNum = Integer.parseInt(br.readLine());


//            循环读取文件，生成node集合
            String line = "";

            while ((line = br.readLine()) != null) {
                String[] xyd = line.split(" ");
                Node node = new Node(Integer.parseInt(xyd[0]), Integer.parseInt(xyd[1]), Integer.parseInt(xyd[2]));

                nodes.add(node);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


        return nodes;
    }

    //    定义一个Node Vector 用于保存信息node


    //    增加一个方法，让退出时，将 AllEnemyTank 保存到文件中
    public static void saveRecord() {


        try {
            bw = new BufferedWriter(new FileWriter(recordFile));
            bw.write(allEnemyTankNum + "\r\n");
//            遍历敌人的坦克Vector，根据情况保存即可
//            OOP思想：定义一个属性，然后通过set方法得到敌人的Vector

            for (int i = 0; i < enemyTanks.size(); i++) {
//                取出敌人坦克
                EnemyTank enemyTank = enemyTanks.get(i);

                if (enemyTank.isLive) {
//                    保存该enemyTank的信息
                    String record = enemyTank.getX() + " " + enemyTank.getY() + " " + enemyTank.getDirection();
                    bw.write(record + "\r\n");
                }

            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                }
            }
        }

    }
}
