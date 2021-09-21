package com.zjm.day.尚硅谷.双链表;

/**
 * @Author zjm
 * @Description: 双链表实体类
 * @Date: Created in 12:24 2021/9/10
 * @Modified By:
 */
public class Node {

    public int no;

    public String name;

    public Node next;

    public Node pre;

    public Node(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Node{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}
