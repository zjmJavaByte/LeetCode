package com.zjm.day.primary.string;

import java.util.HashMap;

/**
 * @Author zjm
 * @Description: 字符串中的第一个唯一字符
 * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xn96us/
 * @Date: Created in 16:24 2021/5/27
 * @Modified By:
 */
public class FirstUniqChar {

    public static void main(String[] args) {
        Integer leetcode = firstUniqChar("aadadaad");
        System.out.println(leetcode);
    }

    public static Integer firstUniqChar(String s){
        HashMap<Character, Integer> objectObjectHashMap = new HashMap<>();
        char[] chars = s.toCharArray();

        for (char aChar : chars) {
                objectObjectHashMap.put(aChar,objectObjectHashMap.getOrDefault(aChar,0) + 1);
        }

        for (int i = 0; i < chars.length; i++) {
            if (objectObjectHashMap.get(chars[i]) == 1){
                return i;
            }
        }
        return -1;
    }
}
