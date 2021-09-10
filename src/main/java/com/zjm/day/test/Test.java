package com.zjm.day.test;

import cn.hutool.core.date.DateUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @Author zjm
 * @Description:
 * @Date: Created in 14:52 2021/7/23
 * @Modified By:
 */
public class Test {

    /*给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。

说明：

你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
*/

    public static void main(String[] args) {
        int i = DateUtil.ageOfNow("2000-12-09");
        System.out.println(i);

    }


    public static int[] intersect(int[] nums1, int[] nums2) {
        // 先对两个数组进行排序
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        List<Integer> list = new ArrayList<>();
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                // 如果i指向的值小于j指向的值，，说明i指向
                // 的值小了，i往后移一步
                i++;
            } else if (nums1[i] > nums2[j]) {
                // 如果i指向的值大于j指向的值，说明j指向的值
                // 小了，j往后移一步
                j++;
            } else {
                // 如果i和j指向的值相同，说明这两个值是重复的，
                // 把他加入到集合list中，然后i和j同时都往后移一步
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        //把list转化为数组
        int index = 0;
        int[] res = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            res[index++] = list.get(k);
        }
        return res;
    }

    public static ArrayList<Integer> intersectTwo(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> add = new HashMap<>();
        for (int i : nums1) {
            add.merge(i, 1, Integer::sum);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if (add.getOrDefault(nums2[i], 0) > 0) {
                list.add(nums2[i]);
                add.put(nums2[i], add.get(nums2[i]) - 1);
            }
        }
        return list;
    }

    public static ArrayList<Integer> intersectThree(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int length1 = nums1.length;
        int length2 = nums2.length;
        int index1 = 0;
        int index2 = 0;
        ArrayList<Integer> integers = new ArrayList<>();
        while (index1 < length1 && index2 < length2){
            if (nums1[index1] > nums2[index2]){
                index2++;
            }else if (nums1[index1] < nums2[index2]){
                index1++;
            }else if (nums1[index1] == nums2[index2]){
                integers.add(nums2[index2]);
                index1++;
                index2++;
            }
        }
        return integers;
    }
}
