package com.zjm.day.尚硅谷.栈;

public class Test {

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }

        System.out.println(stack.pop());
        System.out.println();
        stack.show();

    }
}
