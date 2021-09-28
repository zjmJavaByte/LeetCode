package com.zjm.day.尚硅谷.排序算法.插入排序;

import java.time.LocalDateTime;

/**
 * @Author zjm
 * @Description:
 * @Date: Created in 12:11 2021/9/23
 * @Modified By:
 */
public class Test {

    public static void main(String[] args) {



        InsertSort insertSort = new InsertSort(1000);
        //bubbleSort.show();
        System.out.println(LocalDateTime.now());
        insertSort.sort();
        System.out.println(LocalDateTime.now());
        insertSort.show();
    }

}
