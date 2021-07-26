package com.zjm.day.primary.array;

/**
 * @Author zjm
 * @Description: 反转数组
 * @Date: Created in 21:58 2021/5/18
 * @Modified By:
 */
public class Rotate {
    public static void main(String[] args) {
        int [] a = new int[]{1,2,3,4,5,6,7,8};
        rotate2(a,15);
        for (int i : a) {
            System.out.println(i);
        }
    }


    //数组赋值
    public static void rotate(int[] nums, int k) {
        int length = nums.length;
        int[] temp = new int[length];
        //把原数组值放到一个临时数组中，
        System.arraycopy(nums, 0, temp, 0, length);
        //然后在把临时数组的值重新放到原数组，并且往右移动k位
        for (int i = 0; i < length; i++) {
            nums[(i + k) % length] = temp[i];
        }
    }


    //多次反转
    public static void rotate2(int[] nums, int k) {
        int length = nums.length;
        k %= length;
        reverse(nums, 0, length - k - 1);//先反转前面的
        reverse(nums, length - k, length - 1);//接着反转后面k个
        reverse(nums, 0, length - 1);//最后在反转全部的元素
    }


    static void reverse(int[] nums,int start,int end){
        while (start < end){
            int num = nums[start];
            nums[start++] = nums[end];
            nums[end--] = num;
        }
    }
}
