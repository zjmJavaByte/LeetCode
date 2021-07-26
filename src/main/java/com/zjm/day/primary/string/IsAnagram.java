package com.zjm.day.primary.string;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author zjm
 * @Description: 有效的字母异位词
 * @Date: Created in 17:00 2021/5/27
 * @Modified By:
 */
public class IsAnagram {

    public static void main(String[] args) {
       String s = "rat", t = "car";


        boolean test = test(s, t);
        System.out.println(test);
    }



    public static boolean test(String s,String t){
        Map<Character, Integer> cm = new HashMap<>();
        char[] c1 = s.toCharArray();
        char[] c2 = s.toCharArray();
        if (c1.length != c2.length){
            return false;
        }
        for (char c : c1) {
            cm.put(c,cm.getOrDefault(c,0)+1);
        }
        for (char c : c2) {
            if (cm.get(c) == null){
                return false;
            }
            cm.put(c,cm.get(c)-1);
        }
        return cm.values().stream().allMatch(a -> a == 0);

    }



}
