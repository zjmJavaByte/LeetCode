package com.zjm.day.primary.string;

/**
 * @Author zjm
 * @Description: 最长公共前缀
 * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnmav1/
 * @Date: Created in 16:23 2021/5/28
 * @Modified By:
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String s = longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        System.out.println(s);

    }


    public static String longestCommonPrefix(String[] strs) {
        //边界条件判断
        if (strs == null || strs.length == 0)
            return "";
        //默认第一个字符串是他们的公共前缀
        String pre = strs[0];
        int i = 1;
        while (i < strs.length) {
            //不断的截取
            while (strs[i].indexOf(pre) != 0)
                pre = pre.substring(0, pre.length() - 1);
            i++;
        }
        return pre;
    }
}