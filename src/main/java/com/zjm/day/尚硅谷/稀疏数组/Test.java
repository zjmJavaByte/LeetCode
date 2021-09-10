package com.zjm.day.尚硅谷.稀疏数组;

import cn.hutool.core.io.IoUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author zjm
 * @Description:  原始数组与稀疏数组之间的转换
 * @Date: Created in 12:15 2021/9/2
 * @Modified By:
 */
public class Test {

    public static void main(String[] args) throws FileNotFoundException {
        int [][] arr = new int[11][11];
        arr[1][5] = 8;
        arr[6][9] = 6;
        arr[7][5] = 9;

        System.out.println("-------------原始数组---------");
        for (int[] ints : arr) {
            System.out.println();
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
        }

        System.out.println("-------------原始数组---------");
        System.out.println();
        System.out.println("-------------稀疏数组---------");

        int count = 0;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt != 0){
                    count++;
                }
            }
        }

        int [][] sparse = new int[count + 1][3];

        sparse[0][0] = 11;
        sparse[0][1] = 11;
        sparse[0][2] = count;


        int num = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int i1 = 0; i1 < arr[i].length; i1++) {
                if (arr[i][i1] != 0){
                    num++;
                    sparse[num][0] = i;
                    sparse[num][1] = i1;
                    sparse[num][2] = arr[i][i1];
                }
            }
        }



        for (int[] ints : sparse) {
            System.out.println();
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
        }

        System.out.println();
        System.out.println("将稀疏数组转为文件存储--------------开始");
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\temp.txt");
        for (int i = 0; i < sparse.length; i++) {
            IoUtil.write(fileOutputStream, Charset.defaultCharset(),false,sparse[i][0]+"\t"+sparse[i][1]+"\t"+sparse[i][2]+"\n");
        }
        IoUtil.close(fileOutputStream);
        System.out.println("将稀疏数组转为文件存储--------------结束");

        System.out.println("读取文件--------------开始");
        FileInputStream inputStream = new FileInputStream("D:\\temp.txt");
        List<String> str = new ArrayList<>();
        for (int i = 0; i < sparse.length; i++) {
            IoUtil.readUtf8Lines(inputStream,str);
        }
        IoUtil.close(inputStream);
        int [][] readSparse = new int[str.size()][3];
        for (int i = 0; i < str.size(); i++) {
            String[] s1 = str.get(i).split("\t");
            readSparse[i][0] = Integer.parseInt(s1[0].trim());
            readSparse[i][1] = Integer.parseInt(s1[1].trim());
            readSparse[i][2] = Integer.parseInt(s1[2].trim());
        }

        for (int[] ints : readSparse) {
            System.out.println();
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
        }
        System.out.println();
        System.out.println("读取文件--------------结束");


        System.out.println("-------------稀疏数组---------");
        System.out.println("--------------将稀疏数组转为原始数组-----------------");

        int [][] chees = new int[sparse[0][0]][sparse[0][1]];

        for (int i = 1; i < sparse.length; i++) {
            chees[sparse[i][0]][sparse[i][1]] = sparse[i][2];
        }

        for (int[] ints : chees) {
            System.out.println();
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
        }
        System.out.println("--------------将稀疏数组转为原始数组-----------------");
    }

}

