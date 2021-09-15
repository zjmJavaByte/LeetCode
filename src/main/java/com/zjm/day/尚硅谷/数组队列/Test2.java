package com.zjm.day.尚硅谷.数组队列;

/**
 * @Author zjm
 * @Description:
 * @Date: Created in 12:43 2021/9/14
 * @Modified By:
 */
public class Test2 {


    public static void main(String[] args) {
        CirculateArrayQueue circulateArrayQueue = new CirculateArrayQueue(5);

        circulateArrayQueue.add(1);
        circulateArrayQueue.add(3);
        circulateArrayQueue.add(2);
        circulateArrayQueue.add(7);
        circulateArrayQueue.show();

        System.out.println();

        System.out.println(circulateArrayQueue.get());
        circulateArrayQueue.add(5);
        System.out.println();
        circulateArrayQueue.show();

        System.out.println();

        System.out.println(circulateArrayQueue.headQueue());

        System.out.println();

        System.out.println(circulateArrayQueue.size());
    }


}
