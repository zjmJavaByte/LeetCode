package com.zjm.day.primary.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author zjm
 * @Description:
 * @Date: Created in 16:29 2021/5/25
 * @Modified By:
 */
public class TwoSum {

    public static void main(String[] args) {
        System.out.println(1 - '0');
    }

    public static int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++)
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
        }
        return new int[]{-1, -1};
    }

    public static int[] twoSum2(int[] nums, int target) {
        int j = 1;
        int i = 0;
        int maxArea = nums.length - 1;
        while (nums[i] + nums[j] != target){
            if(j == maxArea){
                i++;
                j = i;
            }
            j++;
        }
        return new int[]{i,j};
    }

    public int[] twoSum3(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (m.get(target - nums[i]) != null) {
                return new int[]{m.get(target - nums[i]), i};
            }
            m.put(nums[i], i);
        }
        return new int[]{0, 0};
    }
}

