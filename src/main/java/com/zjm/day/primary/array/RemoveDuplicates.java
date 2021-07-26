package com.zjm.day.primary.array;

/**
 * @Author zjm
 * @Description: 删除排序数组中的重复项 (输入数组是以「引用」方式传递的，这意味着在函数里修改输入数组对于调用者是可见的)
 * @Date: Created in 18:45 2021/5/16
 * @Modified By:
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] a = new int[]{1, 1, 1, 4, 5, 5, 6, 7, 8, 8, 8, 9};
        //System.out.println(removeDuplicates(a));
        System.out.println(removeDuplicatesTwo(a));
    }

    //双指针解决方案一
    public static int removeDuplicates(int[] A) {
       if (A == null || A.length == 0){
           return 0;
       }
       int left = 0;
        for (int right = 1; right < A.length; right++) {
            if (A[left] != A[right]){
                A[++left] = A[right];
            }
        }
        return ++left;
    }


    //双指针解决方案一
    public static int removeDuplicatesTwo(int[] a) {
        if (a == null || a.length == 0){
            return 0;
        }
        int len = a.length;
        int left = 1, right = 1;
        while (right < len){
            if (a[right] != a[right - 1]){
                a[left] = a[right];
                ++left;
            }
            right++;
        }
        return left;
    }
}
