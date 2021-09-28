package com.zjm.day.尚硅谷.排序算法.选择排序;

import cn.hutool.core.util.ArrayUtil;
import cn.hutool.core.util.RandomUtil;

import java.util.Arrays;

/**
 * @Author zjm
 * @Description: 选择排序
 * @Date: Created in 12:05 2021/9/28
 * @Modified By:
 */
public class SelectSort {


    private final int[] arr;


    public SelectSort(int maxSize) {
        arr = new int[maxSize];
        for (int i = 0; i < arr.length; i++) {
            int v = RandomUtil.randomInt(maxSize);
            arr[i] = v;
        }
    }


    public void sort(){
        int minIndex;
        int min;
        for (int i = 0; i < arr.length; i++) {
            minIndex = i;
            min = arr[minIndex];
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]){
                    min = arr[j];
                    minIndex = j;
                }
            }
            if (minIndex != i){
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
        }

    }

    public static void main(String[] args) {
       int[]  arr = new int[]{7,20,9,1};
        int minIndex = 0;
        int min = arr[minIndex];

        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]){
                min = arr[i];
                minIndex = i;
            }
        }
        if (minIndex != 0){
            arr[minIndex] = arr[0];
            arr[0] = min;
        }
        System.out.println("第一轮排序结果："+Arrays.toString(arr));

        minIndex = 1;
        min = arr[minIndex];
        for (int i = 2; i < arr.length; i++) {
            if (min > arr[i]){
                min = arr[i];
                minIndex = i;
            }
        }
        if (minIndex != 1){
            arr[minIndex] = arr[1];
            arr[1] = min;
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
