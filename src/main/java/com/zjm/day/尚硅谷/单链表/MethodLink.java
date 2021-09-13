package com.zjm.day.尚硅谷.单链表;

import java.util.Stack;

/**
 * @Author zjm
 * @Description:
 * @Date: Created in 13:12 2021/9/6
 * @Modified By:
 */
public class MethodLink {

    Node head = new Node("", 0, 0);

    /**
     * 添加
     * @param node
     */
    public void add(Node node) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    /**
     * 根据no顺序添加
     * @param node
     */
    public void addOrder(Node node) {
        Node temp;
        if ((temp = head.next) == null) {
            head.next = node;
            return;
        }
        while (true){
            Integer no1 = temp.getNo();
            Integer no2 = node.getNo();
            if (no1.equals(no2)){
                break;
            }else if (no2 > no1){
                if (temp.next == null){
                    temp.next = node;
                    break;
                }
                if (temp.next.getNo() > no2){
                    node.next = temp.next;
                    temp.next = node;
                    break;
                }
                temp = temp.next;
            }else {
                node.next = head.next;
                head.next = node;
                break;
            }
        }

    }

    /**
     * 遍历
     */
    public void show() {
        Node temp;
        if ((temp = head.next) == null) {
            System.out.println("链表为空");
            return;
        }
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
    }


    /**
     * 是否为空
     * @return
     */
    public boolean isEmpty(){
        if (head.next == null) {
            System.out.println("链表为空");
            return true;
        }
        return false;
    }

    /**
     * 修改
     * @param delNode
     */
    public void update(Node delNode){
        Node temp;
        if ((temp = head.next) == null) {
            System.out.println("链表为空");
            return;
        }
        while (temp != null) {
            if (temp.getNo().equals(delNode.getNo())){
                temp.setAge(delNode.getAge());
                temp.setName(delNode.getName());
                break;
            }
            temp = temp.next;
        }

    }

    /**
     * 删除
     * @param delNode
     */
    public void del(Node delNode){
        Node temp = head;
        if (temp.next == null) {
            System.out.println("链表为空");
            return;
        }
        Node next;
        while (temp.next != null) {
            if (temp.next.getNo().equals(delNode.getNo())){
                next =  temp.next.next;
                temp.next = next;
                break;
            }
            temp = temp.next;
        }

    }

    /*----------------------单链表面试题(新浪、百度、腾讯)-----------------------*/

    /**
     * 求单链表中有效节点的个数
     */
    public int countNode(){
        Node temp;
        if ((temp = head.next) == null) {
            System.out.println("链表为空");
            return 0;
        }
        int count = 1;
        while (temp.next != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    /**
     * 反转
     */
    public void reversalLink() {
        Node temp;
        if ((temp = head.next) == null) {
            System.out.println("链表为空");
            return;
        }
        Node reversalNode = new Node("", 0, 0);
        Node next;
        while (temp != null) {
            next = temp.next;
            temp.next = reversalNode.next;
            reversalNode.next = temp;
            temp = next;
        }
        head.next = reversalNode.next;
    }

    /**
     * 查找倒数第k个节点
     * @param k
     * @return
     */
    public Node findNodeByK(int k){
        int i = countNode();
        if (k > i){
            return null;
        }
        int num = i - k;
        Node temp = head;
        while (num != 0){
            num--;
            temp = temp.next;
        }
        return temp.next;
    }

    /**
     * 从尾到头打印单链表 【百度，要求方式 1：反向遍历 。 方式 2：Stack 栈】
     */
    public void printRev(){
        Stack<Node> nodes = new Stack<>();
        Node temp = head.next;
        while (temp != null){
            nodes.add(temp);
            temp = temp.next;
        }
        int size = nodes.size();
        for (int i = 0; i < size; i++) {
            System.out.println(nodes.pop());
        }
    }


    /**
     * 合并两个“有序”的单链表，合并之后的链表依然有序
     */
    public static void mergeLink(Node node1,Node node2) {
        Node node = new Node("",0,0);
        Node temp = node;

        while (node1.next != null && node2.next != null){
            if (node1.next.getNo() < node2.next.getNo()){
                temp.next = node1.next;
                node1.next = node1.next.next;
            }else {
                temp.next = node2.next;
                node2.next = node2.next.next;
            }
            temp = temp.next;
        }
        if (node1.next != null){
            temp.next = node1.next;
        }
        if (node2.next != null){
            temp.next = node2.next;
        }

        while (node != null){
            System.out.println(node);
            node = node.next;
        }
    }

}
