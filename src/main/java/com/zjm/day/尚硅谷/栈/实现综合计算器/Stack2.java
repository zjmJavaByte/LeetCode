package com.zjm.day.尚硅谷.栈.实现综合计算器;

public class Stack2 {

    private int maxSize;//栈的大小

    private int[] arr;//数组模拟栈

    private int top = -1;//表示栈顶

    public Stack2(int maxSize) {
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
     * 获取栈顶的元素
     * @return
     */
    public int getTop(){
        return arr[top];
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

    /**
     * 返回运算符的优先级，优先级是程序员自己定义的，优先级使用数组表示
     * 数字越大，则优先级就越高
     */
    public static int priority(int opr){
        if (opr == '*' || opr == '/'){
            return 1;
        }else if (opr == '-' || opr == '+'){
            return 0;
        }else {
            return -1;//假定目前
        }
    }


    /**
     * 判断是否为运算符
     * @param val
     * @return
     */
    public static boolean isOperation(char val){
        return val == '*' || val == '/' || val == '-' || val == '+';
    }


    public static int cal(int num1,int num2,int oper){
        int res = 0;//用于存放计算的结果
        switch (oper){
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num2 - num1;//后出栈的作为被减数
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                res = num2 / num1;//后出栈的作为被除数
                break;
            default:
                break;
        }
        return res;
    }


    public static void main(String[] args) {
        String expresion = "3+2*6-2";
        System.out.println(expresion.substring(6,7).charAt(0));
    }
}
