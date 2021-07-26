package com.zjm.day.primary.string;

import java.util.Locale;

/**
 * @Author zjm
 * @Description: 验证回文串
 * @Date: Created in 17:31 2021/5/27
 * @Modified By:
 */
public class IsPalindrome {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean test = test(s);
        System.out.println(test);
    }


    public static boolean test(String s){
        char[] s1 = s.toLowerCase(Locale.ROOT).replaceAll("[^A-Za-z0-9]", "").toCharArray();
        int length = s1.length;
        for (int i = 0; i < length; i++) {
            if (Character.isLetterOrDigit(s1[i]) && Character.isLetterOrDigit(s1[length -i - 1])){
                if (s1[i] != s1[length -i - 1]){
                    return false;
                }
            }
        }
        return true;
    }
}
