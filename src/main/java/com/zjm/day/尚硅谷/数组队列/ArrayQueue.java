package com.zjm.day.尚硅谷.数组队列;

/**
 * @Author zjm
 * @Description:  数组模拟队列
 *                队列遵循先入先出的原则
 * @Date: Created in 12:26 2021/9/14
 * @Modified By:
 */
public class ArrayQueue {

    private final int maxSize;

    private int front;

    private int rear;

    private final int[] arr;


    public ArrayQueue(int maxSize) {
        front = -1; //指向队列头的前一个位置
        rear = -1;//指向队列尾部最后一个数据
        arr = new int[maxSize];
        this.maxSize = maxSize;
    }

    /**
     * 判断队列是否满的
     * @return
     */
    public boolean isFull(){
        return rear == maxSize - 1; // 如果队列最后一个数据下标位于maxSize - 1，队列满
    }

    /**
     * 判断队列是否为空
     * @return
     */
    public boolean isEmpty(){
        return rear == front;
    }

    /**
     * 添加数据到队列
     */
    public void add(int num){
        if (isFull()){
            System.out.println("队列已经满了");
            return;
        }
        arr[++rear] = num;
    }

    public int get(){
        if (isEmpty()){
            throw new RuntimeException("队列为空");
        }
        return arr[++front];
    }


    /**
     * 获取队列所有的数据
     */
    public void show(){
        if (isEmpty()){
            throw new RuntimeException("队列为空");
        }
        for (int i = front; i < rear; i++) {
            System.out.println(arr[i + 1]);
        }
    }

    public int headQueue(){
        if (isEmpty()){
            throw new RuntimeException("队列为空");
        }
        return arr[front + 1];
    }

    public int size(){
        return rear - front;
    }


}
