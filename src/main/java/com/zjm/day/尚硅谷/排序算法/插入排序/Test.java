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



        InsertSort insertSort = new InsertSort(100);
        //bubbleSort.show();
        System.out.println(LocalDateTime.now());
        insertSort.sort();
        System.out.println(LocalDateTime.now());
        insertSort.show();
    }

   /* public void sortTwo(){


        for (int i = 1; i < arr.length; i++) {
            int index = i - 1;
            int value = arr[i];
            while (index >= 0 && value < arr[index]){
                arr[index + 1] = arr[index];
                index--;
            }
            if (index != i- 1){
                arr[index + 1] = value;
            }

        }
    }*/
}
