package com.zjm.day.test;

/**
 * @Author zjm
 * @Description:
 * @Date: Created in 9:36 2021/7/22
 * @Modified By:
 */
public class Candy {

    public static void main(String[] args) {
        //初始值为n 从最小的开始，因为满足最小糖果
        int n = 1;
        int result;
        while((result = calculateCandyNum(n)) == -1) {
            n++;
        }
        System.out.println(result);
    }

    //当前值
    private static int calculateCandyNum(int n ) {
        int currentSum = 5 * n + 1;
        int executeNum = 5 -1;
        for (int i = 0; i < executeNum; i++) {
            // 一定要被4整除
            if (currentSum % 4 != 0) {
                return -1;
            }
            currentSum = currentSum / 4 * 5 + 1;
        }
        return currentSum;
    }
}
