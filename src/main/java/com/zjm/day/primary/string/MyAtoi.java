package com.zjm.day.primary.string;/**
*@Author zjm
*@Description: 字符串转为整数
*@Date: Created in 9:56 2021/5/28
@Modified By:
*/
public class MyAtoi {

    public static void main(String[] args) {
        //myAtoi("675456345675");
        float a = 16;
        float b = 10;
        float c = a / b;
        System.out.println(c);
    }


        public static int myAtoi(String s) {
            char[] chars = s.toCharArray();
            int length = chars.length;
            int index = 0;
            // 先去除空格
            while (index < length && chars[index] == ' '){
                index++;
            }
            // 极端情况 "  " 和""
            if(index >= length){
                return 0;
            }
            // 再判断符号
            int sign =  1;
            if(chars[index] == '-' || chars[index] == '+'){
                if(chars[index] == '-'){
                    sign = -1;
                }
                index++;
            }
            int result = 0;
            int temp = 0;
            while (index < length){
                int num = chars[index] - '0';
                if(num > 9 || num < 0){
                    break;
                }
                temp = result;
                result = result * 10 + num;
                // 越界后，数值和期望数值发生变化，取余再除10获取原始值，比对判断
                //两个int型的result和10相除，最后的结果相当于result取余再除10
                if(result/10 !=temp){
                    if(sign > 0){
                        return Integer.MAX_VALUE;
                    }else {
                        return Integer.MIN_VALUE;
                    }
                }
                index++;
            }
            return result*sign;
        }
}
