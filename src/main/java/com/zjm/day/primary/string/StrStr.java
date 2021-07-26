package com.zjm.day.primary.string;

/**
 * @Author zjm
 * @Description: 实现 strStr()
 * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnr003/
 * @Date: Created in 15:07 2021/5/28
 * @Modified By:
 */
public class StrStr {

    public static void main(String[] args) {
       String haystack = "mississippi", needle = "pi";
        System.out.println(strStr2(haystack,needle));
    }

    public static int strStr(String haystack, String needle) {
        if ("".equals(needle) || haystack.equals(needle) || haystack.startsWith(needle)){
            return 0;
        }
        if (haystack.endsWith(needle)){
            return haystack.length() - needle.length();
        }
        String[] split = haystack.split(needle);
        int length = split.length;
        if (length == 1){
            return -1;
        }
        return split[0].length();
    }


    public static int strStr2(String haystack, String needle) {
        if ("".equals(needle)){
            return 0;
        }
        int length = haystack.length();
        for (int i = 0; i < length; i++) {
            for (int j = i + needle.length(); j <= length; j++) {
                if (haystack.substring(i,j).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }

    public static int strStr3(String haystack, String needle) {
        if (needle.length() == 0)
            return 0;
        int i = 0;
        int j = 0;
        while (i < haystack.length() && j < needle.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            } else {
                //如果不匹配，就回退，从第一次匹配的下一个开始，
                i = i - j + 1;
                j = 0;
            }
            if (j == needle.length())
                return i - j;
        }
        return -1;
    }














    public static int strStr4(String haystack, String needle) {
        if (needle.length() == 0){
            return 0;
        }
        int i = 0;
        int j = 0;
        while (i < haystack.length()){
            if (haystack.charAt(i) == needle.charAt(j)){
                i++;
                j++;
            }else {
                j = 0;
                i = i - j + 1;
            }
            if (j == needle.length()){
                return i - j;
            }
        }
        return -1;


    }





}
