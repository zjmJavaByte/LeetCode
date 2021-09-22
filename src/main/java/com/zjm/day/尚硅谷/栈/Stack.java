package com.zjm.day.尚硅谷.栈;

public class Stack {

    private int maxSize;//栈的大小

    private int[] arr;//数组模拟栈

    private int top = -1;//表示栈顶

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.arr = new int[maxSize];
    }

    /**
     * 是否满
     * @return
     */
    public boolean isFull(){
        return top == maxSize - 1;
    }

    /**
     * 是否为空
     * @return
     */
    public boolean isEmpty(){
        return top == -1;
    }

    /**
     * 入栈
     * @param num
     */
    public void push(int num){
        if (isFull()){
            System.out.println("满了");
            return;
        }
        arr[++top] = num;
    }

    /**
     * 出栈
     * @return
     */
    public int pop(){
        if (isEmpty()){
            System.out.println("为空");
            throw new RuntimeException("为空");
        }
        int value = arr[top];;
        top--;
        return value;
    }

    /**
     * 遍历
     */
    public void show(){
        if (isEmpty()){
            System.out.println("栈为空");
            return;
        }
        while (top != -1){
            System.out.println(arr[top]);
            top--;
        }
    }

}
