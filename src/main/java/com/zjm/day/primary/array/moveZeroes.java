package com.zjm.day.primary.array;

/**
 * @Author zjm
 * @Description:
 * @Date: Created in 18:18 2021/5/24
 * @Modified By:
 */
public class moveZeroes {

    public static void main(String[] args) {
        int [] a = {0,1,0,3,12};
        moveZeroes(a);
        for (int i : a) {
            System.out.println(i);
        }
    }


    /**
     * 只要不为0 ，就往前移动
     * @param nums
     */
    public static void moveZeroes(int [] nums) {
        if (nums == null || nums.length == 0)
            return;
        int index = 0;
        //一次遍历，把非零的都往前挪
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                nums[index++] = nums[i];
        }
        //后面的都是0,
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }
}
