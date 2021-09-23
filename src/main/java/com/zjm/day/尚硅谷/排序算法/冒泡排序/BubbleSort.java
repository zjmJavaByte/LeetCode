package com.zjm.day.尚硅谷.排序算法.冒泡排序;

import cn.hutool.core.util.ArrayUtil;
import cn.hutool.core.util.RandomUtil;

import java.util.Arrays;

/**
 * @Author zjm
 * @Description: 冒泡排序
 * @Date: Created in 12:12 2021/9/23
 * @Modified By:
 */
public class BubbleSort {


    private final int[] arr;


    public BubbleSort(int maxSize) {
        arr = new int[maxSize];
        for (int i = 0; i < arr.length; i++) {
            int v = RandomUtil.randomInt(maxSize);
            arr[i] = v;
        }
    }


    public void sort() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1 + i; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    int v = arr[i];
                    arr[i] = arr[j];
                    arr[j] = v;
                }
            }
        }
    }

    public void show() {
        if (ArrayUtil.isEmpty(arr)) {
            System.out.println("数组为空");
            return;
        }
        System.out.printf("结果为：%s \n", Arrays.toString(arr));
    }
}
