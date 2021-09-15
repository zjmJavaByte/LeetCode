package com.zjm.day.尚硅谷.数组队列;

/**
 * @Author zjm
 * @Description:  环形数组队列
 * @Date: Created in 12:17 2021/9/15
 * @Modified By:
 */
public class CirculateArrayQueue {

    private final int maxSize;

    private int front;

    private int rear;

    private final int[] arr;


    public CirculateArrayQueue(int maxSize) {
        front = 0; //指向队列第一个元素
        rear = 0;//指向队列尾部最后一个数据的下一个位置
        arr = new int[maxSize];
        this.maxSize = maxSize;
    }


    public boolean isFull(){
        return (rear + 1) % maxSize == front;
    }

    public boolean isEmpty(){
        return rear == front;
    }


    public void add(int num){
        if (isFull()){
            throw new RuntimeException("队列已经满");
        }
        arr[rear] = num;
        rear = (rear + 1) % maxSize;
    }


    public int get(){
        if (isEmpty()){
            throw new RuntimeException("队列为空");
        }
        int value = arr[front];
        front = (front + 1) % maxSize;
        return value;
    }

    public int headQueue(){
        if (isEmpty()){
            throw new RuntimeException("队列为空");
        }
        return arr[front];
    }

    public void show(){
        if (isEmpty()){
            throw new RuntimeException("队列为空");
        }
        for (int i = front; i < front + size(); i++) {
            System.out.println(arr[i % maxSize]);
        }

    }

    public int size(){
        return (rear + maxSize - front) % maxSize;
    }
}
