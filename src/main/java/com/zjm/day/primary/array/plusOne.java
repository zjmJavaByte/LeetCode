package com.zjm.day.primary.array;

/**
 * @Author zjm
 * @Description:
 * @Date: Created in 17:53 2021/5/24
 * @Modified By:
 */
public class plusOne {

    public static void main(String[] args) {
        int[] a = {9, 9};
        int[] test = test2(a);
        for (int i : test) {
            System.out.println(i);
        }
    }

    public static int[] test1(int[] a) {
        int length = a.length;
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] != 9) {
                a[i]++;
                return a;
            } else {
                a[i] = 0;
            }
        }
        int[] ints = new int[length + 1];
        ints[0] = 1;
        return ints;
    }


    public static int[] test2(int[] digits) {
        int length = digits.length;
        for (int i = length - 1; i >= 0; i--) {
            digits[i] = digits[i] + 1;//先在原基础上家1
            digits[i] = digits[i] % 10;//再跟10取余
            if (digits[i] != 0) {//如果取余后不等于0，那说明该数字不是9
                return digits;
            }
        }
        int[] ints = new int[length + 1];
        ints[0] = 1;
        return ints;
    }

}
