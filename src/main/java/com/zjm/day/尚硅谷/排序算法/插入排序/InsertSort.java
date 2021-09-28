package com.zjm.day.尚硅谷.排序算法.插入排序;

import cn.hutool.core.util.ArrayUtil;

import java.util.Arrays;

/**
 * @Author zjm
 * @Description: 插入排序
 * @Date: Created in 12:55 2021/9/28
 * @Modified By:
 */
public class InsertSort {

    private final int[] arr;


    public InsertSort(int maxSize) {
        arr = new int[maxSize];
        for (int i = 0; i < arr.length; i++) {
            int v = (int) (Math.random() * maxSize);
            arr[i] = v;
        }
    }


    public void sortTwo(){
        for (int i = 1; i < arr.length; i++) {
            int value = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (value < arr[j]){
                    arr[j + 1] = arr[j];
                }else {
                    arr[j] = value;
                    break;
                }
            }
        }

    }
    public void sort(){
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
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5,2,9,7,1,0};

        int index = 1;
        int value = arr[index];

        for (int j = 1 - 1; j >= 0; j--) {
            if (value < arr[j]){
                arr[index] = arr[j];
                arr[j] = value;
            }
        }
        System.out.println("第一轮排序结果："+Arrays.toString(arr));

         index = 2;
         value = arr[index];

        for (int j = 2 - 1; j >= 0; j--) {
            if (value < arr[j]){
                arr[index] = arr[j];
                arr[j] = value;
            }
        }
        System.out.println("第二轮排序结果："+Arrays.toString(arr));


        index = 3;
        value = arr[index];

        for (int j = 3 - 1; j >= 0; j--) {
            if (value < arr[j]){
                arr[index] = arr[j];
                arr[j] = value;
            }
        }
        System.out.println("第二轮排序结果："+Arrays.toString(arr));
    }


    public void show() {
        if (ArrayUtil.isEmpty(arr)) {
            System.out.println("数组为空");
            return;
        }
        System.out.printf("结果为：%s \n", Arrays.toString(arr));
    }
}
