package com.zjm.day.primary.string;

/**
 * @Author zjm
 * @Description: 整数反转
 * @Date: Created in 15:32 2021/5/27
 * @Modified By:
 */
public class ReverseNum {

    //1234

    public int reverse(int x) {
        int res = 0;
        while (x != 0) {
            int t = x % 10;
            int newRes = res * 10 + t;
            //如果数字溢出，直接返回0
            if ((newRes - t) / 10 != res)
                return 0;
            res = newRes;
            x = x / 10;
        }
        return res;
    }

    public static void main(String... args) {
        int i = reverseTwo(-1230);
        System.out.println(i);
    }


    public static int reverseTwo(int x) {
        int res = 0;
        while (x != 0){
            //取余获取该数字的最后一位
            int i = x % 10;
            //将上一步返回的数字向左移动一位，也就是乘10
            int newNum = res * 10 + i;
            if ((newNum - i) / 10 != newNum){
                return 0;
            }
            res = newNum;
            x = x / 10;
        }
        return res;
    }

}
