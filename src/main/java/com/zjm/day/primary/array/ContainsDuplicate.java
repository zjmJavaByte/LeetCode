package com.zjm.day.primary.array;

import java.util.Arrays;

/**
 * @Author zjm
 * @Description: 存在重复元素
 * 给定一个整数数组，判断是否存在重复元素。
 * 如果存在一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
 * @Date: Created in 22:06 2021/5/19
 * @Modified By:
 */
public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] a = {1,2,3,3,4,5,4};
        System.out.println(containsDuplicate2(a));
    }

    //相互遍历
    public static boolean containsDuplicate(int[] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]){
                    return true;
                }
            }
        }
        return false;
    }

    //先排序，在判断相连的两个数是否一样
    public static boolean containsDuplicate2(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }

}
