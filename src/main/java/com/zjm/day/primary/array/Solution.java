package com.zjm.day.primary.array;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author zjm
 * @Description: 只出现一次的数字
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 说明：
 *
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 * @Date: Created in 0:25 2021/5/23
 * @Modified By:
 */
public class Solution {

    public static int singleNumber1(int [] a){
        int reduce = 0;
        for (int i : a) {
            reduce = reduce ^ i;
        }
        return reduce;
    }

    public int singleNumber2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                //如果添加失败，说明这个值
                //在集合Set中存在，我们要
                //把他给移除掉
                set.remove(num);
            }
        }
        //最终集合Set中只有一个元素，我们直接返回
        return (int) set.toArray()[0];
    }
}
