package com.zjm.day.primary.string;

/**
 * @Author zjm
 * @Description: 反转字符串
 * @Date: Created in 15:20 2021/5/27
 * @Modified By:
 */
public class ReverseString {

    public static void main(String[] args) {
        String [] a = new String[]{"h","e","l","l","o"};
        reverseStringTwo(a);
        for (String s : a) {
            System.out.println(s);
        }
    }

    public static void reverseString(String [] str){
        int length = str.length;
        for (int i = 0; i < length / 2; i++) {
            String temp = str[i];
            str[i] = str[length - i - 1];
            str[length - i - 1] = temp;
        }
    }

    public static void reverseStringTwo(String [] str){
        int start = 0;
        int end = str.length - 1;
        while (start < end){
            re(str,start++,end--);
        }
    }

    private static void re(String [] str,int start,int end){
        String temp = str[start];
        str[start] = str[end];
        str[end] = temp;
    }
}
