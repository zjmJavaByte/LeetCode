package com.zjm.day.尚硅谷.数组队列;

/**
 * @Author zjm
 * @Description:
 * @Date: Created in 12:43 2021/9/14
 * @Modified By:
 */
public class Test {


    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(5);

        arrayQueue.add(1);
        arrayQueue.add(3);
        arrayQueue.add(2);
        arrayQueue.show();

        System.out.println();

        System.out.println(arrayQueue.get());
        arrayQueue.show();

        System.out.println();

        System.out.println(arrayQueue.headQueue());
    }


}
