package com.zjm.day.primary.array;

/**
 * @Author zjm 旋转图像
 * @Description:
 * @Date: Created in 23:02 2021/5/26
 * @Modified By:
 */
public class RotateTwo {

    public static void main(String[] args) {
        int [][] a = {{1,2,3},{2,3,4},{7,8,9}};
        System.out.println(a.length);
    }


    public void test(int [][] m){
        int length = m.length;
        for (int i = 0; i <length / 2; i++) {
            int[] temp = m[i];
            m[i]=m[length - 1 - i];
            m[length - 1 - i] = temp;
        }

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                int temp = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = temp;
            }
        }
    }
}
